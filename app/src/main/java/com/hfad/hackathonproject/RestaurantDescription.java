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
import java.util.HashMap;

public class RestaurantDescription extends AppCompatActivity {

    AzureConnector connector = new AzureConnector();
   ArrayList<Restaurant> restaurants = connector.getRestaurants("RESTAURANTS");
    ArrayList<Restaurant> arr;
    HashMap<Restaurant,Integer> hm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant_description);
        Intent intent = getIntent();
        String name=getIntent().getStringExtra("name");


        ImageView icon = (ImageView)findViewById(R.id.RestaurantIcon);
        TextView categories = (TextView)findViewById(R.id.categories);
        ArrayList<String> rest_name = new ArrayList<String>();
        rest_name.add(name);
        hm = connector.getRestaurantNumbers("RESTAURANTS",rest_name);
        arr = new ArrayList<Restaurant>(hm.keySet());
        categories.setText(arr.get(0).getCategories());

    }

    public void gotowebsite(View view) {
        goToUrl(arr.get(0).getUrl());
    }

    public void gotomaps() {
        goToUrl(arr.get(0).getMapAddress());
    }

    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW,uriUrl);
        startActivity(launchBrowser);
    }
}
