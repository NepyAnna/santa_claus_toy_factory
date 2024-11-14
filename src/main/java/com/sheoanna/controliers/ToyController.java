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
        // hará algo con el repositorio
        // si todo ha ido bien devolverá la respuesta
        //ElfView.addToyResponse();
    }
}
