


package com.swapify.models;


import java.util.Date;


 
public class User {

    private int id, phoneNumber;
   
    private String[] roles;
    private String password, name, sexe,email;
     
    private Date naissance;
    // private int age, duree, is_block,;
   // private String  reset_token, photo;
   // private Boolean isVerified;
   // private LocalDateTime date_deblockage;
public User() {
    }

    public User(int id, int phoneNumber, String[] roles, String password, String name, String sexe, String email, Date naissance) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.roles = roles;
        this.password = password;
        this.name = name;
        this.sexe = sexe;
        this.email = email;
        this.naissance = naissance;
    }

    public User(int phoneNumber, String[] roles, String password, String name, String sexe, String email, Date naissance) {
        this.phoneNumber = phoneNumber;
        this.roles = roles;
        this.password = password;
        this.name = name;
        this.sexe = sexe;
        this.email = email;
        this.naissance = naissance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNaissance() {
        return naissance;
    }

    public void setNaissance(Date naissance) {
        this.naissance = naissance;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", phoneNumber=" + phoneNumber + ", roles=" + roles + ", password=" + password + ", name=" + name + ", sexe=" + sexe + ", email=" + email + ", naissance=" + naissance + '}';
    }


    

    

    

}
