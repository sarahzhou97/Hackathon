package com.hfad.hackathonproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        Intent intent = getIntent();
    }

    public void onSignUp() {
        EditText username = (EditText)findViewById(R.id.editText2);
        EditText password = (EditText)findViewById(R.id.editText);
        String usernameString = username.getText().toString();
        String passwordString = password.getText().toString();

        /*Intent intent2 = new Intent(this,DisplayrestaurantsActivity.class);

        intent2.putExtra(,usernameString);
        intent2.putExtra(,passwordString);*/

    }
}
