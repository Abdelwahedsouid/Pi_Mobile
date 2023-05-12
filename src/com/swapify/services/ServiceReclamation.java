package com.swapify.services;

import com.codename1.io.CharArrayReader;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkEvent;
import com.codename1.io.NetworkManager;
import com.codename1.ui.events.ActionListener;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.codename1.ui.Dialog;
import com.codename1.ui.Dialog;
import com.swapify.models.Reclamation;
import com.swapify.util.Constantes;

/**
 *
 * @author Lenovo
 */
public class ServiceReclamation {

    //singleton 
    public static ServiceReclamation instance = null;

    public static boolean resultOk = true;

    //initilisation connection request 
    private ConnectionRequest req;

    public static ServiceReclamation getInstance() {
        if (instance == null) {
            instance = new ServiceReclamation();
        }
        return instance;
    }

    public ServiceReclamation() {
        req = new ConnectionRequest();

    }

    //ajout Reclamation 
    public void ajoutReclamation(Reclamation reclamation) {

        // Vérifier que la description n'est pas vide
        String description = reclamation.getDescription();
        if (description == null || description.trim().isEmpty()) {
            System.out.println("La description ne doit pas etre vide.");
            return;
        }

        // Vérifier que l'objet n'est pas vide
        String objet = reclamation.getObjet();
        if (objet == null || objet.trim().isEmpty()) {
            System.out.println("L'objet ne doit pas etre vide.");
            return;
        }

        // Liste des mots clés à rechercher
        List<String> motsCles = Arrays.asList("merde", "connard", "foutre", "salope", "enculé", "putain", "bite", "cul", "niquer", "fuck", "shit", "bitch", "asshole", "dick", "pussy", "cock", "motherfucker", "wanker", "bastard");

        // Vérifier si un mot clé est présent dans la description ou l'objet
        for (String mot : motsCles) {
            if (description.contains(mot) || objet.contains(mot)) {
                String message = "Mot trouvé dans la réclamation considéré comme inapproprié : " + mot;

                // Vérifier si le mot clé est autorisé
                boolean motAutorise = false;

                // Ajoutez ici la logique pour vérifier si le mot clé est autorisé
                if (!motAutorise) {
                    Dialog.show("ALERT", message, "OK", null);
                    return;
                }
            }
        }

        String url = Constantes.BASE_URL + "/reclamation/code/new?objet=" + reclamation.getObjet() 
                  + "&description=" + reclamation.getDescription()
                  + "&senderId=" + reclamation.getSender()
                  + "&recipientId=" + reclamation.getRecipient();

        req.setUrl(url);
        //execution du l'url
        req.addResponseListener((evt) -> {
            byte[] data = (byte[]) evt.getMetaData();
            String responseData = new String(data);
            // Check the response from the server
            if (responseData.equals("Reclamation is sended")) {
                // Registration was successful
                Dialog.show("Success", "Reclamation envoyé!", "OK", null);
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
        
       

        NetworkManager.getInstance().addToQueueAndWait(req);

    }

    //affichage Reclamation
 /*   public ArrayList<Reclamation> affichageReclamations() {
        ArrayList<Reclamation> result = new ArrayList<>();

        String url = Constantes.BASE_URL + "/displayreclamtion";
        req.setUrl(url);

        req.addResponseListener(new ActionListener<NetworkEvent>() {
            @Override
            public void actionPerformed(NetworkEvent evt) {
                JSONParser jsonp;
                jsonp = new JSONParser();

                try {
                    Map<String, Object> mapReclamations = jsonp.parseJSON(new CharArrayReader(new String(req.getResponseData()).toCharArray()));

                    List<Map<String, Object>> listOfMaps = (List<Map<String, Object>>) mapReclamations.get("root");

                    for (Map<String, Object> obj : listOfMaps) {
                        Reclamation re = new Reclamation();

                        //dima id fi codename one float 5outhouha
                        float id = Float.parseFloat(obj.get("id").toString());

                        String objet = obj.get("objet").toString();

                        String description = obj.get("description").toString();

                        float IsRead = Float.parseFloat(obj.get("IsRead").toString());

                        re.setId((int) id);
                        re.setObjet(objet);
                        re.setDescription(description);
                        re.setIsRead((int) IsRead);

                        //Date 
                        String DateConverter = obj.get("date").toString().substring(obj.get("date").toString().indexOf("timestamp") + 10, obj.get("date").toString().lastIndexOf("}"));

                        Date currentTime = new Date(Double.valueOf(DateConverter).longValue() * 1000);

                        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                        String dateString = formatter.format(currentTime);
                        re.setCreatedAt(dateString);

                        //insert data into ArrayList result
                        result.add(re);

                    }

                } catch (Exception ex) {

                    ex.printStackTrace();
                }

            }
        });

        NetworkManager.getInstance().addToQueueAndWait(req);//execution ta3 request sinon yet3ada chy dima nal9awha

        return result;

    }

    //Detail Reclamation  
    public Reclamation DetailRecalamation(int id, Reclamation reclamation) {

        String url = Constantes.BASE_URL + "/detailReclamation?" + id;
        req.setUrl(url);

        String str = new String(req.getResponseData());
        req.addResponseListener(((evt) -> {

            JSONParser jsonp = new JSONParser();
            try {

                Map<String, Object> obj = jsonp.parseJSON(new CharArrayReader(new String(str).toCharArray()));

                reclamation.setObjet(obj.get("obj").toString());
                reclamation.setDescription(obj.get("description").toString());
                reclamation.setIsRead(Integer.parseInt(obj.get("IsRead").toString()));

            } catch (IOException ex) {
                System.out.println("error related to sql :( " + ex.getMessage());
            }

            System.out.println("data === " + str);

        }));

        NetworkManager.getInstance().addToQueueAndWait(req);//execution ta3 request sinon yet3ada chy dima nal9awha

        return reclamation;

    }
*/
    //Delete  Rclamation
    public boolean deleteReclamation(int id) {
        String url = Constantes.BASE_URL + "/deleteReclamation?id=" + id;

        req.setUrl(url);

        req.addResponseListener(new ActionListener<NetworkEvent>() {
            @Override
            public void actionPerformed(NetworkEvent evt) {

                req.removeResponseCodeListener(this);
            }
        });

        NetworkManager.getInstance().addToQueueAndWait(req);
        return resultOk;
    }

    //Update  Reclamation 
    public boolean modifierReclamation(Reclamation reclamation) {
        String url = Constantes.BASE_URL + "/updateReclamation?id=" + reclamation.getId() + "&objet=" + reclamation.getObjet() + "&description=" + reclamation.getDescription() + "&etat=" + reclamation.getIsRead();
        req.setUrl(url);

        req.addResponseListener(new ActionListener<NetworkEvent>() {
            @Override
            public void actionPerformed(NetworkEvent evt) {
                resultOk = req.getResponseCode() == 200;
                req.removeResponseListener(this);
            }
        });

        NetworkManager.getInstance().addToQueueAndWait(req);
        return resultOk;

    }

}
