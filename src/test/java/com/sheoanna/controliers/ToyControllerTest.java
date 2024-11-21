package com.sheoanna.controliers;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.sheoanna.dtos.GoodToyDto;
import com.sheoanna.dtos.NaughtyToyDto;

public class ToyControllerTest {
    private ToyController controller;

    @BeforeEach
    void setUp() {
        controller = new ToyController();
    }

   @Test
    public void postGoodToyTest() {
        GoodToyDto goodToy = new GoodToyDto("Teddy Bear", "Barnie", "+3", "Plush");
        controller.postGoodToy(goodToy);

        String toys = controller.getToysForGood();
        assertTrue(toys.contains("Teddy Bear"));
    }

    @Test
    void testPostNaughtyToy() {
        NaughtyToyDto naughtyToy = new NaughtyToyDto("Broken Doll", "Doll missing a leg");
        controller.postNaughtyToy(naughtyToy);

        String toys = controller.getToysForNaughty();
        assertTrue(toys.contains("Broken Doll"));
    }

    @Test
    void testGetAllToys() {
        GoodToyDto goodToy = new GoodToyDto("Lego Set", "Lego", "+8", "Building");
        NaughtyToyDto naughtyToy = new NaughtyToyDto("Noisy Toy", "Extremely loud");

        controller.postGoodToy(goodToy);
        controller.postNaughtyToy(naughtyToy);

        String allToys = controller.getAllToys();
        assertTrue(allToys.contains("Lego Set"));
        assertTrue(allToys.contains("Noisy Toy"));
    }

    @Test
    void testDeleteToy() {
        GoodToyDto goodToy = new GoodToyDto("Puzzle", "PuzzleBrand", "+6", "Smart");
        NaughtyToyDto naughtyToy = new NaughtyToyDto("Noisy Toy", "Extremely loud");

        controller.postGoodToy(goodToy);
        controller.postNaughtyToy(naughtyToy);

        String allToysBefore = controller.getAllToys();
        assertTrue(allToysBefore.contains("Puzzle"));
        assertTrue(allToysBefore.contains("Noisy Toy"));

        controller.deleteToy("G1");
        controller.deleteToy("N1");

        String allToysAfter = controller.getAllToys();
        assertFalse(allToysAfter.contains("Puzzle"));
        assertFalse(allToysAfter.contains("Noisy Toy"));
    }

    @Test
    void testExportToysToCSV() {
        GoodToyDto goodToy = new GoodToyDto("Toy Car", "HotWeels", "+5", "Vehicles");
        NaughtyToyDto naughtyToy = new NaughtyToyDto("Noisy Drum", "Annoying sounds");

        controller.postGoodToy(goodToy);
        controller.postNaughtyToy(naughtyToy);

        String filePath = "./test_toys.csv";
        controller.exportToysToCSV(filePath);

        assertTrue(new java.io.File(filePath).exists());
    } 
}
