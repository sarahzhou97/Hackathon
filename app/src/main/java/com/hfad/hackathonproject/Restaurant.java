package com.hfad.hackathonproject;

/**
 * Created by sarahzhou on 7/26/16.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Restaurant {

    private String name;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String phonenum;
    private String[] categories;
    private String price;
    private double rating;
    private String hours;
    private String website;

    public ArrayList<Restaurant> restaurants = generateRestaurants();

   public ArrayList<Restaurant> generateRestaurants() {
       ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();

        String csvFile="/Users/sarahzhou/AndroidStudioProjects/HackathonProject/Restaurants.csv";
        BufferedReader br = null;
        String line="";

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line=br.readLine())!=null) {
                String[] data = line.split(",");
                String[] categoriesArray = data[6].split(",");
                double ratingDouble = Double.parseDouble(data[8]);
                restaurants.add(new Restaurant(data[0],data[1],data[2],data[3],data[4],data[5],categoriesArray,data[7],ratingDouble,data[9],data[10]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

return restaurants;
}

    public Restaurant(String name,String address,String city, String state, String zipcode, String phonenum,String[] categories,String price,double rating,String hours, String website) {
        this.name = name;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zipcode=zipcode;
        this.phonenum=phonenum;
        this.categories=categories;
        this.price=price;
        this.rating=rating;
        this.hours = hours;
        this.website=website;
    }

    //write getters
}
