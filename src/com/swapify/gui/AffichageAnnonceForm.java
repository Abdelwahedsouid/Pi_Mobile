/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swapify.gui;

import com.codename1.components.ImageViewer;
import com.codename1.ui.Button;
import com.codename1.ui.Container;
import com.codename1.ui.EncodedImage;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.util.Resources;
import com.codename1.util.Base64;
import com.swapify.models.Annonce;
import com.swapify.services.ServiceAnnonce;
import com.swapify.services.ServiceEchange;
import java.io.IOException;
import java.util.List;


/**
 *
 * @author abdel
 */


   public class AffichageAnnonceForm extends HomeForm {

    public AffichageAnnonceForm(Resources theme) {
        super(theme);

        // Créer une liste pour afficher les annonces
        List<Annonce> annonces = ServiceAnnonce.getInstance().afficherAnnonces();

        // Créer un conteneur principal avec un FlowLayout vertical
        Container mainContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS));

        for (Annonce annonce : annonces) {

            // Créer un conteneur pour chaque annonce avec un BoxLayout horizontal
            Container annonceContainer = new Container(new BoxLayout(BoxLayout.X_AXIS));
            // Charger et afficher l'image
            String encodedImage = annonce.getPhoto();
            if (encodedImage != null) {
                byte[] imageData = Base64.decode(encodedImage.getBytes());
                EncodedImage image = EncodedImage.create(imageData);
                EncodedImage scaledImage = (EncodedImage) image.scaled(500, -1); // Redimensionner l'image avec une largeur de 150 pixels et une hauteur proportionnelle
                ImageViewer imageViewer = new ImageViewer(scaledImage);
                annonceContainer.add(imageViewer);
            }
            // Ajouter le label pour le titre de l'annonce
            Container donneContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS));
            Label nomLabel = new Label(annonce.getTitre());
            donneContainer.add(nomLabel);
            Button echangeBut = new Button("demander");
            donneContainer.add(echangeBut);
            echangeBut.addActionListener((evt) -> {
                try {
                    ServiceEchange.getInstance().ajouter(annonce.getIdUser(), annonce.getIdArticle());

                } catch (IOException ex) {
                    ex.getMessage();
                }
            });
            annonceContainer.add(donneContainer);
            annonceContainer.setUIID("Menu");

            // Ajouter le conteneur de l'annonce au conteneur principal
            mainContainer.add(annonceContainer);
        }

        // Créer un conteneur scrollable pour contenir le conteneur principal
        Container scrollableContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        scrollableContainer.setScrollableY(true);
        scrollableContainer.add(mainContainer);

        add(BorderLayout.CENTER, scrollableContainer);
    }
}

