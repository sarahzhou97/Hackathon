package com.hfad.hackathonproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RestaurantDescription extends AppCompatActivity {

    AzureConnector connector = new AzureConnector();
   ArrayList<Restaurant> restaurants = connector.getRestaurants("RESTAURANTS");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant_description);
        Intent intent = getIntent();

        ImageView icon = (ImageView)findViewById(R.id.RestaurantIcon);
        TextView categories = (TextView)findViewById(R.id.categories);
        TextView website = (TextView)findViewById(R.id.website);




    }

    public void gotowebsite(View view) {
        goToUrl();
    }

    public void gotomaps() {

    }

    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW,uriUrl);
        startActivity(launchBrowser);
    }
}
