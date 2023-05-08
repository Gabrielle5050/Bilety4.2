package com.example.bilety42;

import java.io.Serializable;
public class User implements Serializable {
    private int id_user, hour1, min1, hour2, min2, price2;
    private float price;
    private String name, lastName, startingLocation, endLocation;
    public User(int id_user, String name, String lastName, String startingLocation, int hour1, int min1,
                String endLocation, int hour2, int min2, float price){
        this.id_user = id_user;
        this.name = name;
        this.lastName = lastName;
        this.startingLocation = startingLocation;
        this.hour1 = hour1;
        this.min1 = min1;
        this.endLocation = endLocation;
        this.hour2 = hour2;
        this.min2 = min2;
        this.price = price;
    }
    public void User(){};

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getHour1() {
        return hour1;
    }

    public void setHour1(int hour1) {
        this.hour1 = hour1;
    }

    public int getMin1() {
        return min1;
    }

    public void setMin1(int min1) {
        this.min1 = min1;
    }

    public int getHour2() {
        return hour2;
    }

    public void setHour2(int hour2) {
        this.hour2 = hour2;
    }

    public int getMin2() {
        return min2;
    }

    public void setMin2(int min2) {
        this.min2 = min2;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStartingLocation() {
        return startingLocation;
    }

    public void setStartingLocation(String startingLocation) {
        this.startingLocation = startingLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }
}