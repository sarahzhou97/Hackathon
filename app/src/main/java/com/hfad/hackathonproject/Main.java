package com.hfad.hackathonproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }

    public void loginButton() {
        Intent intent = new Intent(Main.this, Login.class);
    }

    public void signUpButton() {
        Intent intent2 = new Intent(Main.this,Signup.class);
    }

}
