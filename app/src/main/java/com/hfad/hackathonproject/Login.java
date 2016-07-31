package com.hfad.hackathonproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userlogin);
        Intent intent = getIntent();
    }
    public void onLogin(View view) {
        EditText username = (EditText)findViewById(R.id.editText2);
        EditText password = (EditText)findViewById(R.id.editText3);
        String usernameString = username.getText().toString();
        String passwordString = password.getText().toString();

        Intent intent2 = new Intent(this,DisplayrestaurantsActivity.class);

        /*intent2.putExtra(,usernameString);
        intent2.putExtra(,passwordString);*/

    }
}
