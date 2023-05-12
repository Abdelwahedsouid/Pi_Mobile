/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swapify.gui;

import com.codename1.capture.Capture;
import com.codename1.ui.Button;
import com.codename1.ui.Container;
import com.codename1.ui.Display;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.Toolbar;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.util.Resources;
import com.swapify.services.ServiceProduit;
import com.swapify.services.ServiceUser;
import java.io.IOException;

/**
 *
 * @author abdel
 */
public class AjoutProduitForm extends Form {

    private Toolbar tb;
    private Image image;
    private String path;

    public AjoutProduitForm(Resources theme) {
        super(new BorderLayout(BorderLayout.CENTER_BEHAVIOR_CENTER));

        tb = new Toolbar();

        setToolbar(tb);
        tb.setTitle("Ajouter un produit");
        tb.setBackCommand("", e -> {
            new ProfilForm(theme).show();
        });
        //ajout d'image
        Button selectImageBtn = new Button("Sélectionner une image");
        Label l = new Label();
        selectImageBtn.addActionListener((evt) -> {
            path = Capture.capturePhoto(Display.getInstance().getDisplayWidth(), -1);
            if (path != null) {
                try {
                    image = Image.createImage(path);
                    Image scaledImage = image.scaled(image.getWidth() / 3, image.getHeight() / 3);
                    l.setIcon(scaledImage);
                    revalidate();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        tb.addCommandToLeftBar("", null, (evt) -> {
        });
        add(BorderLayout.NORTH, BoxLayout.encloseY(selectImageBtn, l));
        //ajout formulaire
        Label nameLabel = new Label("Nom Produit : ");
        TextField nameField = new TextField("", "Nom", 20, TextField.ANY);
        Label descriptionLabel = new Label(" Description :");
        TextField descriptionField = new TextField("", "Desecription", 20, TextField.ANY);
        Button saveButton = new Button("Ajouter");
        saveButton.addActionListener(e -> {
            String name = nameField.getText();
            String description = descriptionField.getText();
            try {
                ServiceProduit.getInstance().ajouter(name, description, path);
                //ToastBar.showInfoMessage("Données modifié avec succès !");
            } catch (IOException ex) {
                ex.getMessage();
            }
        });
        Container profileDataContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        profileDataContainer.addAll(nameLabel, nameField, descriptionLabel, descriptionField, saveButton);
        add(BorderLayout.CENTER, profileDataContainer);
    }
}
