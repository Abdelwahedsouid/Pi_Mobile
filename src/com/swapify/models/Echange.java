package com.swapify.models;

public class Echange {

    private int id;
    private int idDemandeur;

    private int idReciever;

    private int idArticleDemandeur;

    private int idArticleReciever;
    private String imageDemandeur,imageReciever;  
    private int confirmation;

    private int ConfirmationReciever;
    private String Statut;

    public Echange() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdDemandeur() {
        return idDemandeur;
    }

    public void setIdDemandeur(int idDemandeur) {
        this.idDemandeur = idDemandeur;
    }

    public int getIdReciever() {
        return idReciever;
    }

    public void setIdReciever(int idReciever) {
        this.idReciever = idReciever;
    }

    public int getIdArticleDemandeur() {
        return idArticleDemandeur;
    }

    public void setIdArticleDemandeur(int idArticleDemandeur) {
        this.idArticleDemandeur = idArticleDemandeur;
    }

    public int getIdArticleReciever() {
        return idArticleReciever;
    }

    public void setIdArticleReciever(int idArticleReciever) {
        this.idArticleReciever = idArticleReciever;
    }

    public int getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(int confirmation) {
        this.confirmation = confirmation;
    }

    public int getConfirmationReciever() {
        return ConfirmationReciever;
    }

    public void setConfirmationReciever(int ConfirmationReciever) {
        this.ConfirmationReciever = ConfirmationReciever;
    }

    public String getStatut() {
        return Statut;
    }

    public void setStatut(String Statut) {
        this.Statut = Statut;
    }

    public String getImageDemandeur() {
        return imageDemandeur;
    }

    public void setImageDemandeur(String imageDemandeur) {
        this.imageDemandeur = imageDemandeur;
    }

    public String getImageReciever() {
        return imageReciever;
    }

    public void setImageReciever(String imageReciever) {
        this.imageReciever = imageReciever;
    }
       
}
