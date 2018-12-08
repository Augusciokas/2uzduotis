package com.example.augustinas.a2uzduotis3bandymas;

import android.app.Application;

import com.firebase.client.Firebase;
import com.google.firebase.database.FirebaseDatabase;

public class FireApp extends Application {
    @Override
    public void onCreate(){
        super.onCreate();

        Firebase.setAndroidContext(this);
    }


}
