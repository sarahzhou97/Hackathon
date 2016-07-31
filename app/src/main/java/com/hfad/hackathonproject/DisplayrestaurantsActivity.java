package com.hfad.hackathonproject;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hfad.hackathonproject.AzureConnector;
import com.hfad.hackathonproject.R;
import com.hfad.hackathonproject.Restaurant;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class DisplayrestaurantsActivity extends AppCompatActivity {

    private TextView name1,name2,name3,name4,address1,address2,address3,address4,price1,price2,price3,price4;
    private ImageView icon1,icon2,icon3,icon4;
    AzureConnector connector= new AzureConnector();
    ArrayList<Restaurant> restaurants= connector.getRestaurants("RESTAURANTS");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displayrestaurantstorate);

        Intent intent = getIntent();

        CardView cv1 = (CardView)findViewById(R.id.cv1);
        CardView cv2 = (CardView)findViewById(R.id.cv2);
        CardView cv3 = (CardView)findViewById(R.id.cv3);
        CardView cv4 = (CardView)findViewById(R.id.cv4);

        TextView name1 = (TextView)findViewById(R.id.name1);
        TextView name2 = (TextView)findViewById(R.id.name2);
        TextView name3 = (TextView)findViewById(R.id.name3);
        TextView name4 = (TextView)findViewById(R.id.name4);

        TextView address1 = (TextView)findViewById(R.id.address1);
        TextView address2 = (TextView)findViewById(R.id.address2);
        TextView address3 = (TextView)findViewById(R.id.address3);
        TextView address4 = (TextView)findViewById(R.id.address4);

        TextView price1 = (TextView)findViewById(R.id.price1);
        TextView price2= (TextView)findViewById(R.id.price2);
        TextView price3= (TextView)findViewById(R.id.price3);
        TextView price4= (TextView)findViewById(R.id.price4);

        TextView categories1= (TextView)findViewById(R.id.categories1);
        TextView categories2 = (TextView)findViewById(R.id.categories2);
        TextView categories3 = (TextView)findViewById(R.id.categories3);
        TextView categories4 = (TextView)findViewById(R.id.categories4);

        ImageView icon1 = (ImageView)findViewById(R.id.icon1);
        ImageView icon2 = (ImageView)findViewById(R.id.icon2);
        ImageView icon3 = (ImageView)findViewById(R.id.icon3);
        ImageView icon4 = (ImageView)findViewById(R.id.icon4);




        name1.setText(restaurants.get(0).getName());
        name2.setText(restaurants.get(1).getName());
        name3.setText(restaurants.get(2).getName());
        name4.setText(restaurants.get(3).getName());

        address1.setText(restaurants.get(0).getAddress());
        address2.setText(restaurants.get(1).getAddress());
        address3.setText(restaurants.get(2).getAddress());
        address4.setText(restaurants.get(3).getAddress());

        price1.setText(new String(new char[restaurants.get(0).getPrice()]).replace("\0","$"));
        price2.setText(new String(new char[restaurants.get(1).getPrice()]).replace("\0","$"));
        price3.setText(new String(new char[restaurants.get(2).getPrice()]).replace("\0","$"));
        price4.setText(new String(new char[restaurants.get(3).getPrice()]).replace("\0","$"));

        categories1.setText(restaurants.get(0).getCategories());
        categories2.setText(restaurants.get(1).getCategories());
        categories3.setText(restaurants.get(2).getCategories());
        categories4.setText(restaurants.get(3).getCategories());


        icon1.setImageDrawable(setDrawable(restaurants.get(0).getIcon()));
        icon2.setImageDrawable(setDrawable(restaurants.get(1).getIcon()));
        icon3.setImageDrawable(setDrawable(restaurants.get(2).getIcon()));
        icon4.setImageDrawable(setDrawable(restaurants.get(3).getIcon()));


    }

    private Drawable setDrawable(String string) {
        if (string.equals("icecream")) {
            return this.getResources().getDrawable(R.drawable.icecream);
        } if (string.equals("hotdrink")) {
            return this.getResources().getDrawable(R.drawable.hotdrink);
        } else {
            return this.getResources().getDrawable(R.drawable.foodpic);
        }
    }

    public void onClickNum1(View view) {
        connector = new AzureConnector();
        restaurants = connector.getRestaurants("RESTAURANTS");
        Intent intent1 = new Intent(this,RestaurantDescription.class);
        intent1.putExtra("name",restaurants.get(0).getName());
        startActivity(intent1);
    }

    public void onClickNum2(View view) {
        connector = new AzureConnector();
        restaurants = connector.getRestaurants("RESTAURANTS");
        Intent intent2 = new Intent(this,RestaurantDescription.class);
        intent2.putExtra("name",restaurants.get(1).getName());
        startActivity(intent2);
    }

    public void onClickNum3(View view) {
        connector = new AzureConnector();
        restaurants = connector.getRestaurants("RESTAURANTS");
        Intent intent3 = new Intent(this,RestaurantDescription.class);
        intent3.putExtra("name",restaurants.get(2).getName());
        startActivity(intent3);
    }

    public void onClickNum4(View view) {
        connector = new AzureConnector();
        restaurants = connector.getRestaurants("RESTAURANTS");
        Intent intent4 = new Intent(this,RestaurantDescription.class);
        intent4.putExtra("name",restaurants.get(3).getName());
        startActivity(intent4);
    }
}
