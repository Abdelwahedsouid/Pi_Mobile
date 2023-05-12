package com.swapify.gui;

import com.codename1.components.ImageViewer;
import com.codename1.io.Storage;
import com.codename1.ui.Button;
import com.codename1.ui.Command;
import com.codename1.ui.Container;
import com.codename1.ui.EncodedImage;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.Toolbar;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.util.Resources;
import com.codename1.ui.util.UIBuilder;
import com.swapify.SessionManager;

/**
 *
 * @author abdel
 */
public class HomeForm extends Form {

    public HomeForm(Resources theme) {
        super(new BorderLayout());

        Toolbar tb = new Toolbar();
        setToolbar(tb);
        // Ajouter une image à gauche de la barre d'accueil
       Image logoScaled = theme.getImage("logo.png");
        Image logo = logoScaled.scaled(logoScaled.getWidth() * 3, (int) (logoScaled.getHeight() * 2.5));
        ImageViewer logoImageViewer = new ImageViewer(logo);
        Container LogoImageContainer = new Container(new BorderLayout());
        LogoImageContainer.add( BorderLayout.CENTER,logoImageViewer);
        tb.setTitleComponent(LogoImageContainer);
       
        //barre de recherche au milieu
        TextField recherche = new TextField("", "Recherche", 18, TextField.TEXT_CURSOR);
        recherche.getUnselectedStyle().setBgColor(0xf7f7f7);
        recherche.getUnselectedStyle().setFgColor(0x000000);
        Container searchContainer = new Container(new BorderLayout());
        searchContainer.add(BorderLayout.CENTER, recherche);
        tb.setTitleComponent(searchContainer);
        // bouton de déconnexion à droite de la barre d'accueil
        Image logoutIcon = FontImage.createMaterial(FontImage.MATERIAL_EXIT_TO_APP, "Logout", 5.0f);
        Button logoutButton = new Button("Logout", logoutIcon);
        tb.addCommandToRightBar(new Command("", logoutIcon) {
            @Override
            public void actionPerformed(ActionEvent evt) {
                new LoginForm(theme).show();
                SessionManager.pref.clearAll();
                Storage.getInstance().clearStorage();
                System.out.println("id user=" + SessionManager.getId());
            }
        });
        // Ajouter le reste du contenu de la page d'accueil ici
             
        // sidebar au dessus de l'application           
        // conteneur pour les boutons au dessous
        Container buttonsContainer = new Container(new BorderLayout());

//  boutons pour les pages de profil, de compte et d'annonces
        Image profileImg = FontImage.createMaterial(FontImage.MATERIAL_ACCOUNT_CIRCLE, "profile", 4.0f);
        Image PlusImg = FontImage.createMaterial(FontImage.MATERIAL_ADD, "plus", 4.0f);
        Image AboutImg = FontImage.createMaterial(FontImage.MATERIAL_BUSINESS_CENTER, "about", 4.0f);
        Image HomeImg = FontImage.createMaterial(FontImage.MATERIAL_HOUSE, "home", 4.0f);
        Image ChatImg = FontImage.createMaterial(FontImage.MATERIAL_MESSENGER, "chat", 4.0f);
        Button profileButton = new Button("", profileImg);
        Button AboutButton = new Button("", AboutImg);
        Button PlusButton = new Button("", PlusImg);
        Button ChatButton = new Button("", ChatImg);
        Button HomeButton = new Button("", HomeImg);

        
        //actions sur l'ajout d'annonce
        PlusButton.addPointerPressedListener((evt) -> {
             AjoutAnnonceForm profileForm = new AjoutAnnonceForm(theme);
            profileForm.show();
        });
//  actions pour les boutons
        profileButton.addActionListener((evt) -> {
            ProfilForm profileForm = new ProfilForm(theme);
            profileForm.show();
        });
        HomeButton.addActionListener((evt) -> {
            AffichageAnnonceForm homeForm = new AffichageAnnonceForm(theme);
            homeForm.show();
        });

        //  boutons à gauche
        Container leftButtons = new Container(new BoxLayout(BoxLayout.X_AXIS));
        leftButtons.add(profileButton);
        leftButtons.add(HomeButton);
        buttonsContainer.add(BorderLayout.WEST, leftButtons);
        //  boutons à droite
        Container rightButtons = new Container(new BoxLayout(BoxLayout.X_AXIS));
        rightButtons.add(AboutButton);
        rightButtons.add(ChatButton);
        buttonsContainer.add(BorderLayout.EAST, rightButtons);
        // button au centre
        buttonsContainer.add(BorderLayout.CENTER, PlusButton);
        // Ajouter le conteneur à la forme HomeForm
        add(BorderLayout.SOUTH, buttonsContainer);
        buttonsContainer.setUIID("Tab");

    }
}
