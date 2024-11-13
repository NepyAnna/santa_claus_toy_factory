package com.sheoanna.models;

public class ToyForNaughty extends Toy{
    private String content;

    public ToyForNaughty(String title, String id, String content) {
        super(title, id);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return super.toString() + ", Content: " + content;
    }
}
