/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swapify.gui;

import com.codename1.components.ImageViewer;
import com.codename1.io.Storage;
import com.codename1.ui.Button;
import com.codename1.ui.Command;
import com.codename1.ui.Container;
import com.codename1.ui.EncodedImage;
import com.codename1.ui.FontImage;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.Toolbar;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.util.Resources;
import com.codename1.util.Base64;
import com.swapify.SessionManager;
import com.swapify.services.ServiceUser;

/**
 *
 * @author abdel
 */
public class SettingsUser extends HomeForm {

    private Toolbar tb; // Définir le champ tb

    public SettingsUser(Resources theme) {
        super(theme);
        tb = new Toolbar();
        setToolbar(tb);
        tb.setTitle("Settings");
                 tb.setBackCommand("", e -> {
            new ProfilForm(theme).show();
        });
         Image backIcon = FontImage.createMaterial(FontImage.MATERIAL_ARROW_BACK, "Retour", 5.0f);
       
        
        // Ajoute une photo de profil circulaire
        String encodedImage = SessionManager.getPhoto();
        if (encodedImage != null) {
            byte[] imageData = Base64.decode(encodedImage.getBytes());
            EncodedImage image = EncodedImage.create(imageData);
            ImageViewer imageViewer = new ImageViewer(image);
            Container profileImageContainer = new Container(new BorderLayout());
            profileImageContainer.add(BorderLayout.CENTER, imageViewer);
            add(BorderLayout.NORTH, profileImageContainer);
        }
        // Afficher les données de profil
        Label nameLabel = new Label("Nom : " );
        TextField usernameField = new TextField("", "Nom d'utilisateur", 20, TextField.ANY);
        Label passwordLabel = new Label("Password :" );
        TextField passwordField = new TextField("", "Mot de passe", 20, TextField.PASSWORD);
        Label emailLabel = new Label("E-mail :" );
        TextField emailField = new TextField("", "Email", 20, TextField.EMAILADDR);
         Button saveButton = new Button("Editer");
        saveButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
            String email = emailField.getText();
            ServiceUser.getInstance().editProfil(username, email, password);
            
            //ToastBar.showInfoMessage("Données modifié avec succès !");
        });
        Container profileDataContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        profileDataContainer.addAll(nameLabel,usernameField,emailLabel,emailField,passwordLabel,passwordField,saveButton);
        add(BorderLayout.CENTER, profileDataContainer);
    }
}
