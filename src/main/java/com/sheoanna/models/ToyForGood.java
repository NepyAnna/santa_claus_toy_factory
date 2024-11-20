package com.sheoanna.models;

public class ToyForGood extends Toy {
    private String brand;
    private int recommendedAge;
    private String category;

    public ToyForGood(String id, String title, String brand, int recommendedAge, String category) {
        super(id, title);
        this.brand = brand;
        this.recommendedAge = recommendedAge;
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public int getRecommendedAge() {
        return recommendedAge;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return super.toString() + ", Brand: " + brand + ", Recommended age: " + recommendedAge + ", Category: " + category;
    }

}
