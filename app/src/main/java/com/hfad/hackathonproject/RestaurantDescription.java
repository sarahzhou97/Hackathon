package com.hfad.hackathonproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RestaurantDescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant_description);

        ImageView icon = (ImageView)findViewById(R.id.RestaurantIcon);
        TextView categories = (TextView)findViewById(R.id.categories);
        TextView website = (TextView)findViewById(R.id.website);
        
        website.setText();

    }

    public void gotowebsite() {

    }

    public void gotomaps() {

    }
}
