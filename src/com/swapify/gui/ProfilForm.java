/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swapify.gui;

import com.codename1.components.FloatingActionButton;
import com.codename1.components.ImageViewer;
import com.codename1.io.Storage;
import com.codename1.ui.Button;
import com.codename1.ui.Command;
import static com.codename1.ui.Component.BOTTOM;
import static com.codename1.ui.Component.CENTER;
import com.codename1.ui.Container;
import com.codename1.ui.EncodedImage;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.Toolbar;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.layouts.GridLayout;
import com.codename1.ui.util.Resources;
import com.codename1.util.Base64;
import com.swapify.SessionManager;

public class ProfilForm extends HomeForm {

    private Toolbar tb;

    public ProfilForm(Resources theme) {
        super(theme);
        tb = new Toolbar();
        setToolbar(tb);
        tb.setTitle("My Acount");
        //button settings
        Image SettingsIcon = FontImage.createMaterial(FontImage.MATERIAL_SETTINGS, "Retour", 5.0f);
        tb.addCommandToSideMenu(new Command("Settings", SettingsIcon) {
            @Override
            public void actionPerformed(ActionEvent evt) {
                new SettingsUser(theme).show();
            }
        });
        //button article
        Image articleIcon = FontImage.createMaterial(FontImage.MATERIAL_CATEGORY, "Retour", 5.0f);
        tb.addCommandToSideMenu(new Command("Articles", articleIcon) {
            @Override
            public void actionPerformed(ActionEvent evt) {
                new ArticleForm(theme).show();
            }
        });
        //buuton logout
        Image logoutIcon = FontImage.createMaterial(FontImage.MATERIAL_EXIT_TO_APP, "Logout", 4.0f);
        Button logoutButton = new Button("Logout", logoutIcon);
        tb.addCommandToSideMenu(new Command("logout", logoutIcon) {
            @Override
            public void actionPerformed(ActionEvent evt) {
                new LoginForm(theme).show();
                SessionManager.pref.clearAll();
                Storage.getInstance().clearStorage();
                System.out.println("id user=" + SessionManager.getId());
            }
        });
        // Ajouter une photo de profil circulaire
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
        Label nameLabel = new Label("Nom : " + SessionManager.getName());
        Label emailLabel = new Label("E-mail :" + SessionManager.getEmail());
        Container profileDataContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        profileDataContainer.add(nameLabel);

        profileDataContainer.add(emailLabel);

       // add(BorderLayout.NORTH, profileImageContainer);
        add(BorderLayout.CENTER, profileDataContainer);
    }

}
