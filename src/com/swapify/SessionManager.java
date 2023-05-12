package com.swapify;

import com.codename1.io.Preferences;
import java.util.Date;

public class SessionManager {

    public static Preferences pref;
    private static int id;
    private static String name;
    private static String email;
    private static String passowrd;
    private static String photo;
    private static int isBlock, duree;
    private static Date lastLogin;

    public static Preferences getPref() {
        return pref;
    }

    public static void setPref(Preferences pref) {
        SessionManager.pref = pref;
    }

    public static int getId() {
        return pref.get("id", id);
    }

    public static void setId(int id) {
        pref.set("id", id);
    }

    public static String getName() {
        return pref.get("name", name);
    }

    public static void setName(String name) {
        pref.set("name", name);
    }

    public static String getEmail() {
        return pref.get("email", email);
    }

    public static void setEmail(String email) {
        pref.set("email", email);
    }

    public static String getPassowrd() {
        return pref.get("passowrd", passowrd);
    }

    public static void setPassowrd(String passowrd) {
        pref.set("passowrd", passowrd);
    }

    public static String getPhoto() {
        return pref.get("photo", photo);
    }

    public static void setPhoto(String photo) {
        pref.set("photo", photo);
    }

    public static int getIsBlock() {
        return pref.get("isBlock", isBlock);
    }

    public static void setIsBlock(int isBlock) {
        SessionManager.pref.set("isBlock", isBlock);
    }

    public static int getDuree() {
        return pref.get("duree", duree);
    }

    public static void setDuree(int duree) {
        SessionManager.pref.set("duree", duree);
    }

    public static Date getLastLogin() {
        long lastLoginTime = pref.get("lastLogin", 0L); // Valeur par défaut 0L si la clé "lastLogin" n'est pas présente
        Date lastLogin = new Date(lastLoginTime);
        return lastLogin;
    }

    public static void setLastLogin(Date date) {
        long lastLoginTime = date.getTime();
        pref.set("lastLogin", lastLoginTime);
    }

    public static long calculateDuration(Date logoutTime) {
        Date lastLogin = getLastLogin();
        long duration = logoutTime.getTime() - lastLogin.getTime();
        return duration;
    }

}
