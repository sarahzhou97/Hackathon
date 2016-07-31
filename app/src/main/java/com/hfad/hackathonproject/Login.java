package com.hfad.hackathonproject;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    String usernameString;
    String passwordString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userlogin);
        Intent intent = getIntent();
    }
    public void onLogin(View view) {
        EditText username = (EditText)findViewById(R.id.editText2);
        EditText password = (EditText)findViewById(R.id.editText3);
        usernameString = username.getText().toString();
        passwordString = password.getText().toString();

        AzureConnector connector = new AzureConnector();
        boolean confirm = connector.confirmUser("LOGIN",usernameString,passwordString);

        if (confirm) {
            Intent intent2 = new Intent(this,MakePalate.class);
            startActivity(intent2);
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Sorry but your username does not match your password.").setTitle("Try Again").setCancelable(false);
            builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    dialog.cancel();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();

        }

    }
}