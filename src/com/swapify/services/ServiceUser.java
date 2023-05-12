package com.swapify.services;

import com.codename1.components.InteractionDialog;
import com.codename1.io.CharArrayReader;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.MultipartRequest;
import com.codename1.io.NetworkEvent;
import com.codename1.io.NetworkManager;
import com.codename1.ui.Button;
import com.codename1.ui.Dialog;
import com.codename1.ui.Label;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BorderLayout;

import com.codename1.ui.util.Resources;

import com.swapify.SessionManager;
import com.swapify.gui.EnvoyerReclamationForm;
import com.swapify.gui.HomeForm;
import com.swapify.models.User;
import com.swapify.util.Constantes;
import java.io.IOException;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ServiceUser {

    //singleton
    static ServiceUser instance;
    boolean RESULT_OK = false;
    //inisialisation connection request
    private ConnectionRequest req;

    List<User> users = new ArrayList<User>();

    //Constructor 
    private ServiceUser() {
        req = new ConnectionRequest();
    }

    //get instance 
    public static ServiceUser getInstance() {
        if (instance == null) {
            instance = new ServiceUser();
        }
        return instance;

    }

    //sinup 
    public void signup(String name, String email, String password, int phone, String sexe, String date, String photo) throws IOException {
        MultipartRequest req = new MultipartRequest();
        String url = "http://127.0.0.1:8000/user/SinUp?name=" + name
                  + "&email=" + email
                  + "&phoneNumber=" + phone
                  + "&sexe=female&password=" + password
                  + "&naissance=" + date;
        String mime = "image/png";
        req.addData("photo", photo, mime);
        req.setUrl(url);
        req.setPost(true);

        //execution du l'url
        req.addResponseListener((evt) -> {
            byte[] data = (byte[]) evt.getMetaData();
            String responseData = new String(data);
            // Check the response from the server
            if (responseData.equals("Account is created")) {
                // Registration was successful
                Dialog.show("Success", "Account created!", "OK", null);
            } else {
                // Registration failed
                if (responseData.contains("EMAIL INVALIDE")) {
                    // Email address entered by user was invalid
                    Dialog.show("Error", "Invalid email address!", "OK", null);
                } else {
                    // Email address is valid
                    if (responseData == null || responseData.isEmpty()) {
                        // Error communicating with server
                        Dialog.show("Error", "Communication error with server!", "OK", null);
                    } else {
                        // Server responded with a message
                        Dialog.show("Error", "Server response: " + responseData, "OK", null);
                    }
                }
            }
        });
        //apres l'execution du l'url en attendre la reponse du serveur
        NetworkManager.getInstance().addToQueueAndWait(req);
    }

    public void signin(String email, String password, Resources rs) {
        String url = "http://127.0.0.1:8000/user/SinIn?email=" + email
                  + "&password=" + password;
        req = new ConnectionRequest(url, false);
        req.setUrl(url);

        req.addResponseListener((e) -> {

            JSONParser j = new JSONParser();

            String json = new String(req.getResponseData()) + "";

            try {
                if (json.equals("email NOT fOUND") || json.equals("password NOT fOUND")) {
                    Dialog.show("Echec d'authentification", "email ou mot de passe éronné", "OK", null);
                } else {
                    System.out.println("data ==" + json);
                    Map<String, Object> user = j.parseJSON(new CharArrayReader(json.toCharArray()));
                    //Session 
                    float id = Float.parseFloat(user.get("id").toString());
                    float isBlock = Float.parseFloat(user.get("isBlock").toString());
                    SessionManager.setId((int) id);
                    SessionManager.setIsBlock((int) isBlock);
                    SessionManager.setPassowrd(user.get("password").toString());
                    SessionManager.setName(user.get("name").toString());
                    SessionManager.setEmail(user.get("email").toString());
                    if (user.get("photo") != null) {
                        SessionManager.setPhoto(user.get("photo").toString());
                    }
                    if (user.size() > 0) {
                        if (SessionManager.getIsBlock() == 1) {
                            new EnvoyerReclamationForm(rs).show();
                         /*   InteractionDialog dialog = new InteractionDialog("Error");
                            dialog.setLayout(new BorderLayout());

                            Label label = new Label("You are blocked!");
                            Button okButton = new Button("OK");

                            okButton.addActionListener(evt -> {
                                dialog.dispose();
                               
                            });
                            dialog.addComponent(BorderLayout.CENTER, label);
                            dialog.addComponent(BorderLayout.SOUTH, okButton);
*/
                        }else{
                        new HomeForm(rs).show();
                        }
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        });

        NetworkManager.getInstance().addToQueueAndWait(req);
    }

    public void editProfil(String name, String email, String password) {
        String url = "http://127.0.0.1:8000/user/edit?id=" + String.valueOf(SessionManager.getId())
                  + "&name=" + name
                  + "&email=" + email
                  + "&sexe=female"
                  + "&password=" + password;
        MultipartRequest req = new MultipartRequest();
        req.setUrl(url);
        req.setPost(true);
        //execution du l'url
        req.addResponseListener((evt) -> {
            byte[] data = (byte[]) evt.getMetaData();
            String responseData = new String(data);
            // Check the response from the server
            if (responseData.equals("Account is modified")) {
                SessionManager.setPassowrd(password);
                SessionManager.setName(name);
                SessionManager.setEmail(email);
                // Registration was successful
                Dialog.show("Success", " Account is modified!", "OK", null);

            } else {

                // Server responded with a message
                Dialog.show("Error", "Server response: " + responseData, "OK", null);

            }
        });
        //apres l'execution du l'url en attendre la reponse du serveur
        NetworkManager.getInstance().addToQueueAndWait(req);
    }

    //fetch
    public List<User> fetchUsers() {
        req = new ConnectionRequest();
        //consruire url
        String url = Constantes.BASE_URL + "/user/display";
        req.setUrl(url);
        req.setPost(false);

        req.addResponseListener(new ActionListener<NetworkEvent>() {
            @Override
            public void actionPerformed(NetworkEvent e) {
                users = parseUsers(new String(req.getResponseData()));
                req.removeResponseListener(this);
            }
        });
        NetworkManager.getInstance().addToQueueAndWait(req);
        return users;
    }

    ///parse
    public List<User> parseUsers(String jsonText) {
        List<User> result = new ArrayList<User>();
        JSONParser jp = new JSONParser();
        try {
            Map<String, Object> usersList = jp.parseJSON(new CharArrayReader(jsonText.toCharArray()));
            List<Map<String, Object>> listMaps = (List<Map<String, Object>>) usersList;
            for (Map<String, Object> item : listMaps) {
                User u = new User();
                u.setName((String) item.get("name"));
                u.setEmail((String) item.get("email"));
                u.setPhoneNumber((int) item.get("phoneNumber"));
                u.setNaissance((Date) item.get("naissance"));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return result;
    }

}
