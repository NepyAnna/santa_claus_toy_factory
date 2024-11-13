package com.sheoanna.models;

public abstract class Toy {
    private String id;
    private String title;

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
}
