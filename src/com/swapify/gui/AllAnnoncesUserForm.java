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
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.util.Resources;
import com.codename1.util.Base64;
import com.swapify.SessionManager;
import com.swapify.models.Annonce;
import com.swapify.models.Produit;
import com.swapify.services.ServiceAnnonce;
import com.swapify.services.ServiceProduit;
import java.util.List;


public class AllAnnoncesUserForm extends  ProfilFormPrincipale {
    



    public AllAnnoncesUserForm(Resources theme) {

        super(theme, "Mes Annonces", createContent(theme));
     
    }
    private static Container createContent(Resources theme) {

        //declarer le container 
        Container mainContainer = new Container(new BorderLayout());
  
        Container buttonContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        mainContainer.add(BorderLayout.NORTH, buttonContainer);
        //affichage ses donnée
        Container productListContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        List<Annonce> annonces = ServiceAnnonce.getInstance().afficherMesAnnonces(SessionManager.getId());
        
        //parcourir les produit
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
         Label nomLabel = new Label( annonce.getTitre());
         donneContainer.add(nomLabel);
      
         annonceContainer.add(donneContainer);
        annonceContainer.setUIID("Menu");
        }
        mainContainer.add(BorderLayout.CENTER, productListContainer);  
        return mainContainer;
    }
}


