package com.example.application_vente.object;

public class Boutique {

    private  long id;
    private String name;
    private String article;
    private String city;

    public Boutique(long id,String name, String article, String city){
        this.id=id;
        this.name=name;
        this.article=article;
        this.city=city;
    }

    public Boutique(){}

    public long getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getarticle() {
        return article;
    }

    public String getCity() {
        return city;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public  void setCity(String city) {
        this.city=city;
    }

    public void setId (long id){
        this.id=id;
    }
}
