/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swapify.models;

import java.util.Date;

/**
 *
 * @author abdel
 */
public class Reclamation {
    
    
    private int id;
    private String objet,description;
    private Date  CreatedAt;
    private int IsRead;
    private int Sender;
    private int Recipient;

    public Reclamation(int id, String objet, String description, Date CreatedAt, int IsRead, int Sender, int Recipient) {
        this.id = id;
        this.objet = objet;
        this.description = description;
        this.CreatedAt = CreatedAt;
        this.IsRead = IsRead;
        this.Sender = Sender;
        this.Recipient = Recipient;
    }

    public Reclamation() {
    }

    public Reclamation(String objet, String description, int IsRead, int Sender, int Recipient) {
        this.objet = objet;
        this.description = description;
        this.IsRead = IsRead;
        this.Sender = Sender;
        this.Recipient = Recipient;
    }
 
    public int getId() {
        return id;
    }

      public void setId(int id) {
          this.id =id;
        
    }
    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(Date CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

   
    public int getIsRead() {
        return IsRead;
    }

    public void setIsRead(int IsRead) {
        this.IsRead = IsRead;
    }

    public int getSender() {
        return Sender;
    }

    public void setSender(int Sender) {
        this.Sender = Sender;
    }

    public int getRecipient() {
        return Recipient;
    }

    public void setRecipient(int Recipient) {
        this.Recipient = Recipient;
    }

   
    
    
    
}
