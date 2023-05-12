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
import com.swapify.models.Annonce;
import com.swapify.models.Produit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author abdel
 */
public class ServiceAnnonce {

    //singleton
    static ServiceAnnonce instance;
    boolean RESULT_OK = false;
    //inisialisation connection request
    private ConnectionRequest req;

    //Constructor 
    private ServiceAnnonce() {
        req = new ConnectionRequest();
    }

    //get instance 
    public static ServiceAnnonce getInstance() {
        if (instance == null) {
            instance = new ServiceAnnonce();
        }
        return instance;

    }

    public void ajouter(String titre, int idArticle) throws IOException {
        MultipartRequest req = new MultipartRequest();

        String url = "http://127.0.0.1:8000/annonce/code/new?titre=" + titre
                  + "&idArticle=" + idArticle
                  + "&id=" + SessionManager.getId();

        req.setUrl(url);
        req.setPost(false);

        //execution du l'url
        req.addResponseListener((evt) -> {
            byte[] data = (byte[]) evt.getMetaData();
            String responseData = new String(data);
            // Check the response from the server
            if (responseData.equals("Annonce is created")) {
                // Registration was successful
                Dialog.show("Success", "Annonce ajouté!", "OK", null);
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

    public List<Annonce> afficherAnnonces() {

        List<Annonce> annonces = new ArrayList<>();
        String url = "http://127.0.0.1:8000/annonce/code/display";
        req = new ConnectionRequest(url, false);
        req.setUrl(url);
        req.addResponseListener((evt) -> {
            try {
                JSONParser j = new JSONParser();
                Map<String, Object> produitsJson = j.parseJSON(new CharArrayReader(new String(req.getResponseData()).toCharArray()));
                List<Map<String, Object>> list = (List<Map<String, Object>>) produitsJson.get("root");
                for (Map<String, Object> obj : list) {
                    Annonce annonce = new Annonce();
                    annonce.setTitre(obj.get("titre").toString());
                    annonce.setPhoto(obj.get("photo").toString());
                    if (obj.get("articleId") != null) {
                    annonce.setIdArticle((int) Float.parseFloat(obj.get("articleId").toString()));
                    }
                    if (obj.get("userId") != null) {
                        annonce.setIdUser((int) Float.parseFloat(obj.get("userId").toString()));
                    }
                    
                    annonces.add(annonce);
                }
            } catch (IOException ex) {
                ex.getStackTrace();
            }
        });
        NetworkManager.getInstance().addToQueueAndWait(req);
        return annonces;
    }
    public List<Annonce> afficherMesAnnonces(int id) {

        List<Annonce> annonces = new ArrayList<>();
        String url = "http://127.0.0.1:8000/annonce/code/display?userId="+id;
        req = new ConnectionRequest(url, false);
        req.setUrl(url);
        req.addResponseListener((evt) -> {
            try {
                JSONParser j = new JSONParser();
                Map<String, Object> produitsJson = j.parseJSON(new CharArrayReader(new String(req.getResponseData()).toCharArray()));
                List<Map<String, Object>> list = (List<Map<String, Object>>) produitsJson.get("root");
                for (Map<String, Object> obj : list) {
                    Annonce annonce = new Annonce();
                    annonce.setTitre(obj.get("titre").toString());
                    annonce.setPhoto(obj.get("photo").toString());
                    if (obj.get("articleId") != null) {
                    annonce.setIdArticle((int) Float.parseFloat(obj.get("articleId").toString()));
                    }
                    if (obj.get("userId") != null) {
                        annonce.setIdUser((int) Float.parseFloat(obj.get("userId").toString()));
                    }
                    
                    annonces.add(annonce);
                }
            } catch (IOException ex) {
                ex.getStackTrace();
            }
        });
        NetworkManager.getInstance().addToQueueAndWait(req);
        return annonces;
    }
}
