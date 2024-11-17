package com.sheoanna.models;

public abstract class Toy {
    protected String id;
    protected String title;
    protected boolean isGoodToy;
    

    public Toy(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle(){
        return title;
    }

    public void setId(int id) {
        if (isGoodToy) {
            this.id = "B" + id;
        } else {
            this.id = "M" + id;
        }
    }

    @Override
    public String toString() {
        return "Identifier: " + id + ", Title: " + title;
    }
}
