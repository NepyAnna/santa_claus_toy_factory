package com.sheoanna.repositories;

import java.util.ArrayList;
import java.util.List;

import com.sheoanna.models.ToyForGood;
import com.sheoanna.models.ToyForNaughty;

public class ToyRepository {
    private List<ToyForGood> toysG = new ArrayList<>();
    private List<ToyForNaughty> toysN =new ArrayList<>();

    public void addToyForGood(String title, String brand, String recommendedAge, String category) {
        String idOfToy = "G" + (toysG.size() + 1);
        ToyForGood toy = new ToyForGood(idOfToy, title, brand, recommendedAge, category);
        
        toysG.add(toy);
    }

    public void addToyForNaughty(String title, String content) {
        String idOfToy = "N" + (toysN.size() + 1);
        ToyForNaughty toy = new ToyForNaughty(idOfToy, title, content);
        
        toysN.add(toy);
    }

    public void removeToy(String id) {
        char targetSymbol = id.charAt(0);

        if (targetSymbol == 'G') {

            toysG.removeIf(toy -> toy.getId().equals(id));

        } else if(targetSymbol == 'N') {

        } else {
           System.out.println("Wrong Identifier!");
        }
       // toys.removeIf(toy -> toy.getId().equals(id));
    }

    public List<ToyForGood> getToysG() {
        return toysG;
    }

    public List<ToyForNaughty> getToysN() {
        return toysN;
    }

}
