package com.sheoanna.controliers;

import com.sheoanna.dtos.GoodToyDto;
import com.sheoanna.dtos.NaughtyToyDto;
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

    public void postpostNaughtyToy(NaughtyToyDto naughtyToyDto){
        String response = repository.addToyForNaughty(naughtyToyDto);

        ElfView.addToyResponse(response);
    }
}
