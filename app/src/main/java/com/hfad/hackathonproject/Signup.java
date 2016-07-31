package com.hfad.hackathonproject;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Signup extends AppCompatActivity {
    String usernameString;
    String passwordString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        Intent intent = getIntent();
    }

    public void onSignUp() {
        EditText username = (EditText)findViewById(R.id.editText2);
        EditText password = (EditText)findViewById(R.id.editText);
        usernameString = username.getText().toString();
        passwordString = password.getText().toString();

       AzureConnector connector = new AzureConnector();

        boolean userExistsTest = connector.insertUserLogin("LOGIN",usernameString,passwordString);
        if (!userExistsTest) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Sorry but that username is already taken.").setTitle("Sorry").setCancelable(false);
            builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    dialog.cancel();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        } else {
            Intent intent2 = new Intent(this,MakePalate.class);
        }

    }
}
