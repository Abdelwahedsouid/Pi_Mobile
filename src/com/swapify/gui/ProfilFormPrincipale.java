/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swapify.gui;

import com.codename1.io.Storage;
import com.codename1.ui.Button;
import com.codename1.ui.Command;
import com.codename1.ui.Container;
import com.codename1.ui.FontImage;
import com.codename1.ui.Image;
import com.codename1.ui.Toolbar;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.util.Resources;
import com.swapify.SessionManager;

/**
 *
 * @author abdel
 */
public abstract class ProfilFormPrincipale extends HomeForm {

    private Toolbar tb;

    public ProfilFormPrincipale(Resources theme, String title, Container content) {
        super(theme);
        tb = new Toolbar();
        setToolbar(tb);
        tb.setTitle(title);
        // Ajouter les commandes de la barre d'outils ici
        Image EchangeIcon = FontImage.createMaterial(FontImage.MATERIAL_TRAVEL_EXPLORE, "Retour", 5.0f);
        tb.addCommandToSideMenu(new Command(" Echanges", EchangeIcon) {
            @Override
            public void actionPerformed(ActionEvent evt) {
                new AffichageEchangeForm(theme,title,content).show();
            }
        });
        //button settings
        Image SettingsIcon = FontImage.createMaterial(FontImage.MATERIAL_SETTINGS, "Retour", 5.0f);
        tb.addCommandToSideMenu(new Command(" Settings", SettingsIcon) {
            @Override
            public void actionPerformed(ActionEvent evt) {
                new SettingsUser(theme).show();
            }
        });
        //button article
        Image articleIcon = FontImage.createMaterial(FontImage.MATERIAL_CATEGORY, "Retour", 5.0f);
        tb.addCommandToSideMenu(new Command(" Articles", articleIcon) {
            @Override
            public void actionPerformed(ActionEvent evt) {
                new AffichageProduitForm(theme).show();
            }
        });
        //button annonces
        Image annonceIcon = FontImage.createMaterial(FontImage.MATERIAL_DESKTOP_WINDOWS, "Retour", 5.0f);
        tb.addCommandToSideMenu(new Command(" Annonces", annonceIcon) {
            @Override
            public void actionPerformed(ActionEvent evt) {
                new AllAnnoncesUserForm(theme).show();
            }
        });
        //buuton logout
        Image logoutIcon = FontImage.createMaterial(FontImage.MATERIAL_EXIT_TO_APP, "Logout", 4.0f);
        Button logoutButton = new Button("Logout", logoutIcon);
        tb.addCommandToSideMenu(new Command(" logout", logoutIcon) {
            @Override
            public void actionPerformed(ActionEvent evt) {
                new LoginForm(theme).show();
                SessionManager.pref.clearAll();
                Storage.getInstance().clearStorage();
                System.out.println("id user=" + SessionManager.getId());
            }
        });
        
        add(BorderLayout.CENTER, content);

    }

}
