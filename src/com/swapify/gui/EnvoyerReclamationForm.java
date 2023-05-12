/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swapify.gui;

import com.codename1.components.ImageViewer;
import com.codename1.ui.Button;
import static com.codename1.ui.Component.LEFT;
import static com.codename1.ui.Component.RIGHT;
import com.codename1.ui.Container;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.util.Resources;
import com.swapify.SessionManager;
import com.swapify.models.Reclamation;
import com.swapify.services.ServiceReclamation;
import com.swapify.services.ServiceUser;
import java.util.Date;

/**
 *
 * @author abdel
 */
public class EnvoyerReclamationForm extends Form{
       public EnvoyerReclamationForm(Resources theme) {
        super(new BorderLayout(BorderLayout.CENTER_BEHAVIOR_CENTER_ABSOLUTE));
        
        /*Image logoScaled = theme.getImage("logo.png");
        Image logo = logoScaled.scaled(logoScaled.getWidth() * 3, (int) (logoScaled.getHeight() * 2.5));
        ImageViewer imageViewer = new ImageViewer(logo);
        Container imageContainer = new Container(new BorderLayout());
        imageContainer.add(BorderLayout.CENTER, imageViewer);*/

        TextField tObjet = new TextField("", "Object", 20, TextField.EMAILADDR);
        TextField tDescription = new TextField("", "Description", 20, TextField.PASSWORD);
        tObjet.getAllStyles().setMargin(LEFT, 0);
        tDescription.getAllStyles().setMargin(LEFT, 0);
      
        Button loginButton = new Button("Envoyer");

        loginButton.addActionListener(e -> {
            String objet = tObjet.getText().toString();
            String description = tDescription.getText().toString();
            int idUser = SessionManager.getId();
            Reclamation reclamation = new Reclamation( objet,  description,  0, idUser, 4);
            ServiceReclamation.getInstance().ajoutReclamation(reclamation);
            
        });
        Container by = BoxLayout.encloseY(
                  BorderLayout.center(tObjet),
                  BorderLayout.center(tDescription),
                  loginButton
                  
        );
        add(BorderLayout.CENTER, by);
    }
}
