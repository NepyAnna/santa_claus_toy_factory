package com.sheoanna.repositories;

import java.util.ArrayList;
import java.util.List;

import com.sheoanna.models.Toy;

public class ToyRepository {
    private List<Toy> toys = new ArrayList<>();

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void removeToy(String id) {
        toys.removeIf(toy -> toy.getId().equals(id));
    }

    public List<Toy> getAllToys() {
        return toys;
    }
}
