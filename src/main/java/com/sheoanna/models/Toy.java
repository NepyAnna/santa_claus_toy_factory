package com.sheoanna.models;

public abstract class Toy {
    protected String id;
    protected String title;
   // protected boolean isGoodToy;
    
    
    public Toy(String id, String title) {
        this.id = id;
        this.title = title;
    }

    /*public Toy(String title, boolean isGoodToy) {
        this.title = title;
        this.isGoodToy = isGoodToy;
    }*/

    public String getId() {
        return id;
    }

    public String getTitle(){
        return title;
    }

    public void setId(int id) {
        if(isGoodToy) {
            this.id = "G" + id;
        } else {
            this.id = "N" + id;
        }
    }
    
    @Override
    public String toString() {
        return "Identifier: " + id + ", Title: " + title;
    }
}
