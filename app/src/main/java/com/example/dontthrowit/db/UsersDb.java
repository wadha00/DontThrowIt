package com.example.dontthrowit.db;

import android.content.Context;
import android.content.SharedPreferences;


import com.example.dontthrowit.model.Users;

import java.util.ArrayList;
import java.util.List;

/**
 */
public class UsersDb {

    //                                           Wadha Al-Naser
    private static final String Wadha_USERNAME = "Wadha_userName";
    private static final String Wadha_PASSWORD = "Wadha_password";
    private static final String Wadha_EMAIL = "WadhaEmail";


    //    _____________Ayat Abdulrahem __
    private static final String Ayat_USERNAME = "Ayat_username";

    private static final String Ayat_PASSWORD = "Ayat_password";
    private static final String Ayat_EMAIL = "AyatEmail";

    //    _____________Tasnem
    private static final String Tasnem_USERNAME = "Tasnem_userName";
    private static final String Tasnem_PASSWORD = "Tasnem_password";
    private static final String Tasnem_EMAIL = "TasnemEmail";
    //    _____________Fatemah
    private static final String Fatemah_USERNAME = "Fatemah_userName";
    private static final String Fatemah_PASSWORD = "Fatemah_password";
    private static final String Fatemah_EMAIL = "FatemahEmail";


    //    _____________user
    private static final String USER_USERNAME = "user_username";
    private static final String USER_IMAGE = "user_profileImage";
    private static final String USER_PASSWORD = "user_password";
    private static final String USER_EMAIL = "user_Email";
    private static final String USER_SPE = "user_spe";

    public static String PREFS = "PREFS";

    public static SharedPreferences sharedPreferences;
    Context context;
    private static List<Users> usersList;

    public UsersDb(Context context) {
        this.context = context;

        sharedPreferences = context.getSharedPreferences(UsersDb.PREFS, context.MODE_PRIVATE);
    }


    public void saveWadhaData() {
        SharedPreferences.Editor myEditor = sharedPreferences.edit();
        myEditor.putString(Wadha_USERNAME, "Wadha Al-Naser");
        myEditor.putString(Wadha_PASSWORD, "66696818");
        myEditor.putString(Wadha_EMAIL, "wadha.project19@gmail.com");
        myEditor.apply();
    }

    public Users loadWadhaData() {

        return new Users(sharedPreferences.getString(Wadha_USERNAME, null),
                sharedPreferences.getString(Wadha_PASSWORD, null),
                sharedPreferences.getString(Wadha_EMAIL, null));

    }


    //    _____________ Ayat_____________________


    public void saveAyatData() {
        SharedPreferences.Editor myEditor = sharedPreferences.edit();
        myEditor.putString(Ayat_USERNAME, "Ayat Abdulrahem");
        myEditor.putString(Ayat_PASSWORD, "99364232");
        myEditor.putString(Ayat_EMAIL, "ayat.project19@gmail.com");
        myEditor.apply();
    }

    public Users loadAyatData() {

        return new Users(sharedPreferences.getString(Ayat_USERNAME, null),
                sharedPreferences.getString(Ayat_PASSWORD, null),
                sharedPreferences.getString(Ayat_EMAIL, null));
    }//   //

    //  _____________ Tasnem_____________________


    public void saveTasnemData() {
        SharedPreferences.Editor myEditor = sharedPreferences.edit();
        myEditor.putString(Ayat_USERNAME, "Tasnem Al-Kandri");
        myEditor.putString(Ayat_PASSWORD, "90903033");
        myEditor.putString(Ayat_EMAIL, "tasnem.project19@gmail.com");
        myEditor.apply();
    }

    public Users loadTasnemData() {

        return new Users(sharedPreferences.getString(Tasnem_USERNAME, null),
                sharedPreferences.getString(Tasnem_PASSWORD, null),
                sharedPreferences.getString(Tasnem_EMAIL, null));
    }//   //

    //  _____________ Fatemah_____________________


    public void saveFatemahData() {
        SharedPreferences.Editor myEditor = sharedPreferences.edit();
        myEditor.putString(Fatemah_USERNAME, "Fatemah Al-Rumh");
        myEditor.putString(Fatemah_PASSWORD, "94900811");
        myEditor.putString(Fatemah_EMAIL, "fatemah.project19@gmail.com");
        myEditor.apply();
    }

    public Users loadFatemahData() {

        return new Users(sharedPreferences.getString(Fatemah_USERNAME, null),
                sharedPreferences.getString(Fatemah_PASSWORD, null),
                sharedPreferences.getString(Fatemah_EMAIL, null));
    }//


//   _____________ User_____________________




    public void saveUserData(Users users) {
        SharedPreferences.Editor myEditor = sharedPreferences.edit();
        myEditor.putString(USER_USERNAME, users.getUserName());

        myEditor.putString(USER_PASSWORD, users.getPassword());
        myEditor.putString(USER_EMAIL, users.getEmail());
        myEditor.putString(USER_SPE, users.getSpecializations());
        myEditor.apply();
    }

    public Users loadUserData() {

        return new Users(sharedPreferences.getString(USER_USERNAME, null),
                sharedPreferences.getString(USER_PASSWORD, null),
                sharedPreferences.getString(USER_EMAIL, null),
                sharedPreferences.getString(USER_SPE, null));
    }


    public static void saveUserName(Users users) {


        usersList.add(users);

    }

    public static List<Users> getUserName() {
        usersList = new ArrayList<>();

        usersList.add(new Users("wadha.project19@gmail.com", "wadha12345600"));
        usersList.add(new Users("ayat.project19@gmail.com", "ayat12345600"));
        usersList.add(new Users(" tasnem.project19@gmail.com", "tasnem12345600"));
        usersList.add(new Users(" fatemah.project19@gmail.com", "fatemah12345600"));
        return usersList;
    }
}

