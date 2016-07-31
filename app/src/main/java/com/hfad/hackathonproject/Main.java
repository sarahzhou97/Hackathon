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

    public void loginButton(View view) {
        Intent intent = new Intent(Main.this, Login.class);
        startActivity(intent);
    }

    public void signUpButton(View view) {
        Intent intent2 = new Intent(Main.this,Signup.class);
        startActivity(intent2);
    }

}
