
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
import com.swapify.models.Echange;
import com.swapify.models.Produit;
import com.swapify.services.ServiceEchange;
import com.swapify.services.ServiceProduit;
import java.util.List;

public class AffichageEchangeForm extends ProfilFormPrincipale {
    
    public AffichageEchangeForm(Resources theme, String title, Container content) {
       super(theme,"Mes demandes d'echanges",createContent());
    }
     private static Container createContent(){
        
        //declarer le container 
        Container mainContainer = new Container(new BorderLayout());

      /*  Button saveButton = new Button("Ajouter");
        saveButton.addActionListener(e -> new AjoutProduitForm(theme).show());

        Container buttonContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        buttonContainer.add(saveButton);
        
        mainContainer.add(BorderLayout.NORTH, buttonContainer);*/
        
      //affichage mes echange
        int id = SessionManager.getId();
        
        Container productListContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        List<Echange> echanges = ServiceEchange.getInstance().afficherMesEchanges(id);   
        //parcourir les produit
        for (Echange echange : echanges) {
            // Créer un container pour chaque produit
            Container produitContainer = new Container(new BorderLayout());
            produitContainer.getStyle().setMargin(20, 20, 0, 0);

            // Afficher l'image de reciever
            String encodedImage = echange.getImageReciever();
            if (encodedImage != null){
             byte[] imageData = Base64.decode(encodedImage.getBytes());
            EncodedImage image = EncodedImage.create(imageData);
            EncodedImage img =(EncodedImage) image.scaled(150, 150);
            ImageViewer imageViewer = new ImageViewer(img);
            produitContainer.add(BorderLayout.WEST,  imageViewer);
            }
            // Afficher l'image de demandeur
            
            /* Ajouter le nom et la description du produit
            Container productInfoContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS));
            Label productNameLabel = new Label(echange.);
            Label productDescriptionLabel = new Label(echange.getDescription());
            productInfoContainer.add(productNameLabel);
            productInfoContainer.add(productDescriptionLabel);
             */
           // produitContainer.add(BorderLayout.CENTER, productInfoContainer);
            productListContainer.add(produitContainer);
        }
        mainContainer.add(BorderLayout.CENTER, productListContainer);
        return mainContainer;
    }
}
