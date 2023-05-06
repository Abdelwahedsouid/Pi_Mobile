/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swapify.gui;


import com.codename1.ui.Button;
import com.codename1.ui.ButtonGroup;
import com.codename1.ui.Component;
import com.codename1.ui.Container;
import com.codename1.ui.Dialog;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.RadioButton;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.spinner.Picker;
import com.codename1.ui.util.Resources;
import com.swapify.services.ServiceUser;

import java.text.SimpleDateFormat;

/**
 *
 * @author abdel
 */
public class SignUpForm extends Form {

    public SignUpForm(Resources theme) {

        super(new BorderLayout(BorderLayout.CENTER_BEHAVIOR_CENTER_ABSOLUTE));
        //ajouter l'image 
        String btnChooseImage  ;
        
        //ajouter les input
        TextField tNom = new TextField("", "");
        TextField tEmail = new TextField("", "");
        TextField tPassword = new TextField("", "");
        TextField tPhone = new TextField("", "");

        tPassword.setConstraint(TextField.PASSWORD);
        Container genderContainer = new Container(new FlowLayout(Component.CENTER));
        RadioButton maleBtn = new RadioButton("Male");
        RadioButton femaleBtn = new RadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup(maleBtn, femaleBtn);

        //Ajouter les deux boutons radio au groupe de boutons 
        genderContainer.add(maleBtn);

        genderContainer.add(femaleBtn);
        Picker date = new Picker();
        Label lblNom = new Label("Nom :");
        Label lblEmail = new Label("Email :");
        Label lblPassword = new Label("Password :");
        Label lblPhone = new Label("Phone Number :");
        Label lblGender = new Label("Gender :");
        Label lblDate = new Label("Date :");
        //lien sign in
        Button signIn = new Button("Sign In");

        signIn.setUIID(
                  "LoginButton");
        Button btnValid = new Button("Register");

        signIn.addActionListener(e
                  -> new LoginForm(theme).show());

        //ajouter les labels et les boutons dans le container
        add(BorderLayout.CENTER, BoxLayout.encloseY(
                  lblNom, tNom, lblEmail, tEmail, lblPassword, tPassword, lblPhone, tPhone, lblGender, genderContainer, lblDate, date, btnValid, signIn
        ));

        //register button
        btnValid.addActionListener(
                  new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt
            ) {
                String name = tNom.getText().toString();
                String email = tEmail.getText().toString();
                String password = tPassword.getText().toString();
                String phone = tPhone.getText().toString();
                int phoneNumber = Integer.parseInt(phone);
                String sexe = genderGroup.getSelected().getText().toString();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String formattedDate = sdf.format(date.getDate());
                //controle de saisie 
                if (name.isEmpty() || email.isEmpty() || password.isEmpty() || phone.isEmpty() || sexe.isEmpty() || formattedDate.isEmpty()) {
                    Dialog.show("Erreur", "Veuillez remplir tous les champs obligatoires", "OK", null);
                } else {
                    ServiceUser.getInstance().signup(name, email, password, phoneNumber, sexe, formattedDate);
                }
            }
        }
        );
    }
}
