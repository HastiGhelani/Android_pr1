package com.example.controlsdemo;

public class Car {
    //1. declare fields
    private String title, description;
    private int img, price;

    //2 Create Constructor


    public Car(String title, String description, int img, int price) {
        this.title = title;
        this.description = description;
        this.img = img;
        this.price = price;
    }

    public Car() {
    }

    //3. getter and setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
