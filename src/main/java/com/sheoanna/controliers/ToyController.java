package com.sheoanna.controliers;

import java.util.List;
import com.sheoanna.dtos.GoodToyDto;
import com.sheoanna.dtos.NaughtyToyDto;
import com.sheoanna.models.ToyForGood;
import com.sheoanna.models.ToyForNaughty;
import com.sheoanna.repositories.ToyRepository;
import com.sheoanna.utils.CsvExporter;
import com.sheoanna.view.ElfView;

public class ToyController {
    private final ToyRepository repository;

    public ToyController() {
        this.repository = new ToyRepository();
    }

    public void postGoodToy(GoodToyDto goodToyDto) {
        String response = repository.addToyForGood(goodToyDto);

        ElfView.addToyResponse(response);
    }

    public void postNaughtyToy(NaughtyToyDto naughtyToyDto) {
        String response = repository.addToyForNaughty(naughtyToyDto);

        ElfView.addToyResponse(response);
    }

    public String getAllToys() {
        return repository.getAllToys();
    }

    public String getToysForGood() {
        return repository.getToysForGood();
    }

    public String getToysForNaughty() {
        return repository.getToysForNaughty();
    }

    public void deleteToy(String id) {
        String response = repository.deleteToy(id);

        ElfView.addToyResponse(response);
    }

    public void exportToysToCSV(String filePath) {
        List<ToyForGood> goodToys = repository.getToysG();
        List<ToyForNaughty> naughtyToys = repository.getToysN();
        CsvExporter.exportToysToCSV(goodToys, naughtyToys, filePath);
    }
}
