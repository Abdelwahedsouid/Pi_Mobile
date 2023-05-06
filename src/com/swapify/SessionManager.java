
package com.swapify;

import com.codename1.io.Preferences;


public class SessionManager {
    
    public static Preferences pref ; 
    private static int id ; 
    private static String name ; 
    private static String email; 
    private static String passowrd ;
    private static String photo;

    public static Preferences getPref() {
        return pref;
    }

    public static void setPref(Preferences pref) {
        SessionManager.pref = pref;
    }

    public static int getId() {
        return pref.get("id",id);
    }

    public static void setId(int id) {
        pref.set("id",id);
    }

    public static String getName() {
        return pref.get("name",name);
    }

    public static void setName(String name) {
         pref.set("name",name);
    }

    public static String getEmail() {
        return pref.get("email",email);
    }

    public static void setEmail(String email) {
         pref.set("email",email);
    }

    public static String getPassowrd() {
        return pref.get("passowrd",passowrd);
    }

    public static void setPassowrd(String passowrd) {
         pref.set("passowrd",passowrd);
    }

    public static String getPhoto() {
        return pref.get("photo",photo);
    }

    public static void setPhoto(String photo) {
         pref.set("photo",photo);
    }
    
    
    
}
