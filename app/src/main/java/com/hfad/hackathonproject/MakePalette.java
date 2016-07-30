package com.hfad.hackathonproject;

/**
 * Created by sarahzhou on 7/26/16.
 */
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import java.util.ArrayList;

public class MakePalette extends AppCompatActivity {

    private ArrayList<String> Restaurant = new ArrayList<String>();
    private ArrayList<Integer> Rating  = new ArrayList<Integer>();


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.makepalette);
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.checkbox_american:
                if (checked) {
                    Restaurant.add("American");
                    Restaurant.add("Chowder");
                    Restaurant.add("Diner");
                    Restaurant.add("Californian");
                    Restaurant.add("Burgers");
                }
                break;

            case R.id.checkbox_deli:
                if (checked) {
                    Restaurant.add("Deli");
                    Restaurant.add("Sub");
                    Restaurant.add("Sandwiches");
                    Restaurant.add("Bagels");
                }
                break;

            case R.id.checkbox_cafe:
                if (checked) {
                    Restaurant.add("Cafe");
                    Restaurant.add("Coffee");
                    Restaurant.add("Tea");
                }
                break;

            case R.id.checkbox_southern:
                if (checked) {
                    Restaurant.add("Southern");
                    Restaurant.add("Soul Food");
                    Restaurant.add("Cajun");
                    Restaurant.add("Creole");
                    Restaurant.add("Southwestern");
                }
                break;

            case R.id.checkbox_pizza:
                if (checked) {
                    Restaurant.add("pizza");
                }
                break;

            case R.id.checkbox_barbecue:
                if (checked) {
                    Restaurant.add("Barbecue");
                    Restaurant.add("Grill");
                    Restaurant.add("Ribs");
                    Restaurant.add("Steak");
                }
                break;

            case R.id.checkbox_pubfood:
                if (checked) {
                    Restaurant.add("Pub Food");
                    Restaurant.add("Wings");
                    Restaurant.add("Gastropub");
                    Restaurant.add("Irish");
                    Restaurant.add("German");
                }
                break;

            case R.id.checkbox_dessert:
                if (checked) {
                    Restaurant.add("Dessert");
                    Restaurant.add("Donuts");
                    Restaurant.add("Frozen Yogurt");
                    Restaurant.add("Ice Cream");
                }
                break;

            case R.id.checkbox_latin:
                if (checked) {
                    Restaurant.add("Latin");
                    Restaurant.add("South American");
                    Restaurant.add("Latin American");
                    Restaurant.add("Polynesian");
                    Restaurant.add("Hawaiian");
                    Restaurant.add("Caribbean");
                    Restaurant.add("Brazilian");
                    Restaurant.add("Spanish");
                    Restaurant.add("Mexican");
                    Restaurant.add("Puerto Rican");
                    Restaurant.add("Tex Mex");
                }
                break;

            case R.id.checkbox_mediterranean:
                if (checked) {
                    Restaurant.add("Mediterranean");
                    Restaurant.add("Middle Eastern");
                    Restaurant.add("Lebanese");
                    Restaurant.add("Greek");
                    Restaurant.add("African");
                    Restaurant.add("Ethiopian");
                }
                break;

            case R.id.checkbox_vegetarian:
                if (checked) {
                    Restaurant.add("Vegetarian");
                    Restaurant.add("Organic");
                    Restaurant.add("Vegan");
                    Restaurant.add("Smoothies");
                    Restaurant.add("Juices");
                    Restaurant.add("Kosher");
                }
                break;

            case R.id.checkbox_bakery:
                if (checked) {
                    Restaurant.add("Bakery");
                }
                break;

            case R.id.checkbox_seafood:
                if (checked) {
                    Restaurant.add("Seafood");
                    Restaurant.add("Oysters");
                    Restaurant.add("Raw");
                }
                break;

            case R.id.checkbox_indian:
                if (checked) {
                    Restaurant.add("Indian");
                    Restaurant.add("Pakistani");
                }
                break;

            case R.id.checkbox_thai:
                if (checked) {
                    Restaurant.add("Thai");
                }
                break;

            case R.id.checkbox_chinese:
                if (checked) {
                    Restaurant.add("Chinese");
                    Restaurant.add("Taiwanese");
                    Restaurant.add("Dim Sum");
                }
                break;

            case R.id.checkbox_japanese:
                if (checked) {
                    Restaurant.add("Japanese");
                    Restaurant.add("Sushi");
                }
                break;
            case R.id.checkbox_italian:
                if (checked) {
                    Restaurant.add("Italian");
                }
                break;
            case R.id.checkbox_korean:
                if (checked) {
                    Restaurant.add("Korean");
                }
                break;
            case R.id.checkbox_vietnamese:
                if (checked) {
                    Restaurant.add("Vietnamese");
                    Restaurant.add("Pho");
                }
                break;
        }
    }

    public void onCheckboxClickedPrice(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.priceone:
                if (checked) {
                    Rating.add(1);
                }
                break;
            case R.id.pricetwo:
                if (checked) {
                    Rating.add(2);
                }
                break;
            case R.id.pricethree:
                if (checked) {
                    Rating.add(3);
                }
                break;
            case R.id.pricefour:
                if (checked) {
                    if (Rating.contains(3) && !Rating.contains(4)) {
                        Rating.add(3);
                        Rating.add(4);
                    } else {
                        Rating.add(4);
                    }
                }
                break;
        }
    }
}