package com.sheoanna.repositories;

import java.util.ArrayList;
import java.util.List;

import com.sheoanna.dtos.GoodToyDto;
import com.sheoanna.dtos.NaughtyToyDto;
import com.sheoanna.models.ToyForGood;
import com.sheoanna.models.ToyForNaughty;

public class ToyRepository {
    private List<ToyForGood> toysG = new ArrayList<>();
    private List<ToyForNaughty> toysN =new ArrayList<>();

    public String addToyForGood(GoodToyDto dto) {
        String idOfToy = "G" + (toysG.size() + 1);
        ToyForGood toy = new ToyForGood(idOfToy, dto.title(), dto.brand(), dto.recommendedAge(), dto.category());
        
        toysG.add(toy);

        return "Toy added successfully!";
    }

    public String addToyForNaughty(NaughtyToyDto dto) {
        String idOfToy = "N" + (toysN.size() + 1);
        ToyForNaughty toy = new ToyForNaughty(idOfToy, dto.title(), dto.content());
        
        toysN.add(toy);
        return "Toy added successfully!";
    }

    public void removeToy(String id) {
        char targetSymbol = id.charAt(0);

        if (targetSymbol == 'G') {

            toysG.removeIf(toy -> toy.getId().equals(id));

        } else if(targetSymbol == 'N') {
            toysN.removeIf(toy -> toy.getId().equals(id));
        } else {
           System.out.println("Wrong Identifier!");
        }
    }

    public List<ToyForGood> getToysG() {
        return toysG;
    }

    public List<ToyForNaughty> getToysN() {
        return toysN;
    }

}
