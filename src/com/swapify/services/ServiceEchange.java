/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swapify.services;

import com.codename1.io.CharArrayReader;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.MultipartRequest;
import com.codename1.io.NetworkManager;
import com.codename1.ui.Dialog;
import com.swapify.SessionManager;
import com.swapify.models.Echange;
import com.swapify.models.Produit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author abdel
 */
public class ServiceEchange {
    //singleton
    static ServiceEchange instance;
    boolean RESULT_OK = false;
    //inisialisation connection request
    private ConnectionRequest req;
    //Constructor 
    private ServiceEchange() {
        req = new ConnectionRequest();
    }
    //get instance 
    public static ServiceEchange getInstance() {
        if (instance == null) {
            instance = new ServiceEchange();
        }
        return instance;
    }
    public void ajouter(int idReciever, int idArticle) throws IOException {
        MultipartRequest req = new MultipartRequest();
        String url = "http://127.0.0.1:8000/echange/code/new?idArticle=" + idArticle
                  + "&idReciever=" + idReciever
                  + "&idDemandeur=" + SessionManager.getId();
        req.setUrl(url);
        req.setPost(false);
        //execution du l'url
        req.addResponseListener((evt) -> {
            byte[] data = (byte[]) evt.getMetaData();
            String responseData = new String(data);
            // Check the response from the server
            if (responseData.equals("Echange is created")) {
                // Registration was successful
                Dialog.show("Success", "Echange Envoyer!", "OK", null);
            } else {
                if (responseData == null || responseData.isEmpty()) {
                    // Error communicating with server
                    Dialog.show("Error", "Communication error with server!", "OK", null);
                } else {
                    // Server responded with a message
                    Dialog.show("Error", "Server response: " + responseData, "OK", null);
                }
            }
        });
        //apres l'execution du l'url en attendre la reponse du serveur
        NetworkManager.getInstance().addToQueueAndWait(req);
    } 
    public List<Echange> afficherMesEchanges(int id){
        List<Echange> echanges = new ArrayList<>();
        
        String url = "http://127.0.0.1:8000/echange/code/display?id="+id;
    req = new ConnectionRequest(url, false);
    req.setUrl(url);
    req.addResponseListener((evt) -> {
        
        try {
            JSONParser j = new JSONParser(); 
            Map<String, Object> produitsJson = j.parseJSON(new CharArrayReader(new String(req.getResponseData()).toCharArray()));
            List<Map<String, Object>> list = (List<Map<String, Object>>) produitsJson.get("root");
            for (Map<String, Object> obj : list) {
                Echange echange = new Echange();
               
                echanges.add(echange);  
            }
        } catch (IOException ex) {
            ex.getStackTrace();
        }
                     
    });
    NetworkManager.getInstance().addToQueueAndWait(req);
        
        
        return echanges;
    }
     
}
