package com.sheoanna.models;

public class ToyForGood extends Toy {
    private String brand;
    private String recommendedAge;
    private String category;

    public ToyForGood(String identifier, String title, String brand, String recommendedAge, String category) {
        super(identifier, title);
        this.brand = brand;
        this.recommendedAge = recommendedAge;
        this.category = category;
    }
}
