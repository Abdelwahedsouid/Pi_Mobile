
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
import com.swapify.models.Produit;
import com.swapify.services.ServiceProduit;
import java.util.List;
public class AffichageProduitForm extends ProfilFormPrincipale {

    public AffichageProduitForm(Resources theme) {

        super(theme, "Mes Produits", createContent(theme));
     
    }
    private static Container createContent(Resources theme) {

        //declarer le container 
        Container mainContainer = new Container(new BorderLayout());

        Button saveButton = new Button("Ajouter");
        saveButton.addActionListener(e -> new AjoutProduitForm(theme).show());

        Container buttonContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        buttonContainer.add(saveButton);
        
        mainContainer.add(BorderLayout.NORTH, buttonContainer);
        //affichage ses donnée
        Container productListContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        List<Produit> produits = ServiceProduit.getInstance().afficherMesProduits();
        
 
        //parcourir les produit
        for (Produit produit : produits) {
            // Créer un container pour chaque produit
            Container produitContainer = new Container(new BorderLayout());
            produitContainer.getStyle().setMargin(20, 20, 0, 0);

            // Ajouter une image pour le produit
           String encodedImage = produit.getPhoto();
            if (encodedImage != null){
             byte[] imageData = Base64.decode(encodedImage.getBytes());
            EncodedImage image = EncodedImage.create(imageData);
            EncodedImage img =(EncodedImage) image.scaled(150, 150);
            ImageViewer imageViewer = new ImageViewer(img);
            produitContainer.add(BorderLayout.WEST,  imageViewer);
            }
            // Ajouter le nom et la description du produit
            Container productInfoContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS));
            Label productNameLabel = new Label(produit.getNom());
            Label productDescriptionLabel = new Label(produit.getDescription());
            productInfoContainer.add(productNameLabel);
            productInfoContainer.add(productDescriptionLabel);

            produitContainer.add(BorderLayout.CENTER, productInfoContainer);
            productListContainer.add(produitContainer);
        }
        mainContainer.add(BorderLayout.CENTER, productListContainer);  
        return mainContainer;
    }
}
