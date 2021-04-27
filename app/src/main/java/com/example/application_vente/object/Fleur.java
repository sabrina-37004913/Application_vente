package com.example.application_vente.object;

import android.graphics.Bitmap;

public class Fleur {

    private int id;
    private String name;
    private boolean stock;
    private Bitmap img;
    private String description;
    private String prix;

    public Fleur(int id, String name, boolean stock, Bitmap img, String description, String prix){
        this.id = id;
        this.name=name;
        this.stock=stock;
        this.img=img;
        this.description = description;
        this.prix = prix;
    }

    public Fleur(){}

    public String getName() {
        return name;
    }


    public Bitmap getImg() {
        return img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImg(Bitmap img){this.img=img;}

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

