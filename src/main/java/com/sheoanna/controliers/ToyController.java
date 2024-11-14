package com.sheoanna.controliers;

import com.sheoanna.dtos.GoodToyDto;
import com.sheoanna.repositories.ToyRepository;
import com.sheoanna.view.ElfView;

public class ToyController {
    private final ToyRepository repository;

    public ToyController(){
        this.repository = new ToyRepository();
    }

    public void postGoodToy(GoodToyDto goodToyDto) {
        String response = repository.addToyForGood(goodToyDto);
        
        ElfView.addToyResponse(response);
    }
}
