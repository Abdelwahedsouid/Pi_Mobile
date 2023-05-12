/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swapify.gui;

import com.codename1.capture.Capture;
import com.codename1.components.ImageViewer;
import com.codename1.ui.Button;
import com.codename1.ui.ComboBox;
import com.codename1.ui.Container;
import com.codename1.ui.Display;
import com.codename1.ui.EncodedImage;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.Toolbar;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.util.Resources;
import com.codename1.util.Base64;
import com.swapify.models.Produit;
import com.swapify.services.ServiceAnnonce;
import com.swapify.services.ServiceProduit;
import java.io.IOException;
import java.util.List;

public class AjoutAnnonceForm extends Form {

    private static int idArticle;
    private Toolbar tb;
    private Image image;
    private String path;

    public AjoutAnnonceForm(Resources theme) {
        super(new BorderLayout(BorderLayout.CENTER_BEHAVIOR_CENTER));
        tb = new Toolbar();
        setToolbar(tb);

        tb.setBackCommand("", e -> {
            new AffichageAnnonceForm(theme).show();
        });
        tb.setTitle("Ajouter une Annonce");
        //ajout d'image
        ComboBox<Produit> produitsComboBox = new ComboBox<>();
        List<Produit> produits = ServiceProduit.getInstance().afficherMesProduits();

        for (Produit produit : produits) {
            produitsComboBox.addItem(produit);
        }
        produitsComboBox.addActionListener(evt -> {
            Produit selectedProduit = produitsComboBox.getSelectedItem();
            idArticle = selectedProduit.getIdArticle();
            // Ajouter une image pour le produit
            String encodedImage = selectedProduit.getPhoto();
            if (encodedImage != null) {
                byte[] imageData = Base64.decode(encodedImage.getBytes());
                EncodedImage image = EncodedImage.create(imageData);
                EncodedImage img = (EncodedImage) image.scaled(500, 500);
                ImageViewer imageViewer = new ImageViewer(img);
                add(BorderLayout.NORTH, imageViewer);
            }
        });
        //ajout formulaire
        Label nameLabel = new Label("Titre Annonce : ");
        TextField nameField = new TextField("", "Annonce", 20, TextField.ANY);
        Button saveButton = new Button("Ajouter");
        saveButton.addActionListener(e -> {
            try {
                String name = nameField.getText();
                ServiceAnnonce.getInstance().ajouter(name, idArticle);
                //ToastBar.showInfoMessage("Données modifié avec succès !");
            } catch (IOException ex) {
                ex.getStackTrace();
            }
        });
        Container profileDataContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        profileDataContainer.addAll(produitsComboBox, nameLabel, nameField, saveButton);
        add(BorderLayout.CENTER, profileDataContainer);
    }
}
