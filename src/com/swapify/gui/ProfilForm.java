/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swapify.gui;

import com.codename1.components.ImageViewer;

import com.codename1.ui.Container;
import com.codename1.ui.EncodedImage;

import com.codename1.ui.Label;

import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.util.Resources;
import com.codename1.util.Base64;
import com.swapify.SessionManager;

public class ProfilForm extends ProfilFormPrincipale {

 

    public ProfilForm(Resources theme) {
        super(theme,"My Acount",createContent());
    
    }
    private static Container createContent(){
        
        //declarer le container 
        Container mainContainer = new Container(new BorderLayout());
        
         // Ajouter une photo de profil circulaire
        String encodedImage = SessionManager.getPhoto();
        if (encodedImage != null){
            byte[] imageData = Base64.decode(encodedImage.getBytes());
            EncodedImage image = EncodedImage.create(imageData);
            ImageViewer imageViewer = new ImageViewer(image);
            Container profileImageContainer = new Container(new BorderLayout());
            profileImageContainer.add(BorderLayout.CENTER, imageViewer);
            mainContainer.add(BorderLayout.NORTH, profileImageContainer);
        }  
        // Afficher les données de profil
        Label nameLabel = new Label("Nom : " + SessionManager.getName());
        Label emailLabel = new Label("E-mail :" + SessionManager.getEmail());
        Container profileDataContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        profileDataContainer.add(nameLabel);
        profileDataContainer.add(emailLabel);
       // add(BorderLayout.NORTH, profileImageContainer);
        mainContainer.add(BorderLayout.CENTER, profileDataContainer);
        return mainContainer;
    }

}
