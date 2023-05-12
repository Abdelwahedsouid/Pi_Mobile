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
import com.codename1.ui.util.Resources;
import com.swapify.SessionManager;
import com.swapify.gui.HomeForm;
import com.swapify.models.Produit;
import com.swapify.models.User;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author abdel
 */
public class ServiceProduit {
    
    //singleton
    static ServiceProduit instance;
    boolean RESULT_OK = false;
    //inisialisation connection request
    private ConnectionRequest req;
    
    List<User> users = new ArrayList<User>();

    //Constructor 
    private ServiceProduit() {
        req = new ConnectionRequest();
    }
    //get instance 
    public static ServiceProduit getInstance() {
        if (instance == null) {
            instance = new ServiceProduit();
        }
        return instance;

    }
     public void ajouter(String nom, String description, String  image) throws IOException {
        MultipartRequest req = new MultipartRequest();
        String url = "http://127.0.0.1:8000/produit/code/new?nom=" + nom
                  + "&description=" + description + "&estimation=52&etat=neuf"
                  + "&id=" +SessionManager.getId()
                  + "&idCategorie=1";
  
        String mime = "image/png";
        req.addData("image", image,mime);
        req.setUrl(url);
        req.setPost(true);
  
        //execution du l'url
        req.addResponseListener((evt) -> {
            byte[] data = (byte[]) evt.getMetaData();
            String responseData = new String(data);
            // Check the response from the server
            if (responseData.equals("Produit is created")) {
                // Registration was successful
                Dialog.show("Success", "Produit ajouté!", "OK", null);
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
       
    public List<Produit> afficherMesProduits() {
    List<Produit> produits = new ArrayList<>();
       
    String url = "http://127.0.0.1:8000/produit/code/display";
    req = new ConnectionRequest(url, false);
    req.setUrl(url);
    req.addResponseListener((evt) -> {
       
        try {
            JSONParser j = new JSONParser(); 
            Map<String, Object> produitsJson = j.parseJSON(new CharArrayReader(new String(req.getResponseData()).toCharArray()));
            List<Map<String, Object>> list = (List<Map<String, Object>>) produitsJson.get("root");
            for (Map<String, Object> obj : list) {
                Produit produit = new Produit();
                produit.setIdArticle((int) Float.parseFloat(obj.get("idArticle").toString()));
                produit.setNom(obj.get("nom").toString());
                produit.setDescription(obj.get("description").toString());
                produit.setPhoto(obj.get("image").toString());
                //produit.setEstimation( Integer.parseInt(obj.get("estimation").toString()));
                produits.add(produit);  
            }
        } catch (IOException ex) {
            ex.getStackTrace();
        }
                
        
    });
    NetworkManager.getInstance().addToQueueAndWait(req);
    return produits;
}
    
}
