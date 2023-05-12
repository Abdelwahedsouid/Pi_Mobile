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
import com.codename1.ui.Display;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.util.Resources;
import com.swapify.services.ServiceUser;

public class LoginForm extends Form {

    public LoginForm(Resources theme) {
        super(new BorderLayout(BorderLayout.CENTER_BEHAVIOR_CENTER_ABSOLUTE));
        
        Image logoScaled = theme.getImage("logo.png");
        Image logo = logoScaled.scaled(logoScaled.getWidth() * 3, (int) (logoScaled.getHeight() * 2.5));
        ImageViewer imageViewer = new ImageViewer(logo);
        Container imageContainer = new Container(new BorderLayout());
        imageContainer.add(BorderLayout.CENTER, imageViewer);

        TextField tEmail = new TextField("", "Email", 20, TextField.EMAILADDR);
        TextField tPassword = new TextField("", "Password", 20, TextField.PASSWORD);
        tEmail.getAllStyles().setMargin(LEFT, 0);
        tPassword.getAllStyles().setMargin(LEFT, 0);
        Label loginIcon = new Label("", "TextField");
        Label passwordIcon = new Label("", "TextField");
        loginIcon.getAllStyles().setMargin(RIGHT, 0);
        passwordIcon.getAllStyles().setMargin(RIGHT, 0);
        FontImage.setMaterialIcon(loginIcon, FontImage.MATERIAL_PERSON_OUTLINE, 3);
        FontImage.setMaterialIcon(passwordIcon, FontImage.MATERIAL_LOCK_OUTLINE, 3);
        Button loginButton = new Button("LOGIN");

        loginButton.addActionListener(e -> {
            String email = tEmail.getText().toString();
            String password = tPassword.getText().toString();
            ServiceUser.getInstance().signin(email, password, theme);
        });
        Button createNewAccount = new Button("CREATE NEW ACCOUNT");
        createNewAccount.setUIID("CreateNewAccountButton");
        createNewAccount.addActionListener(e -> new SignUpForm(theme).show());

        Container by = BoxLayout.encloseY(
                  BorderLayout.center(tEmail).
                            add(BorderLayout.WEST, loginIcon),
                  BorderLayout.center(tPassword).
                            add(BorderLayout.WEST, passwordIcon),
                  loginButton,
                  createNewAccount
        );
        add(BorderLayout.NORTH, imageContainer);
        add(BorderLayout.CENTER, by);
        // for low res and landscape devices
        by.setScrollableY(true);
        by.setScrollVisible(false);
    }

}
