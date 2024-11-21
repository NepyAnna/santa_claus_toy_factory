package com.sheoanna.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sheoanna.dtos.GoodToyDto;
import com.sheoanna.dtos.NaughtyToyDto;
import com.sheoanna.models.ToyForGood;
import com.sheoanna.models.ToyForNaughty;

public class ToyRepositoryTest {
    private ToyRepository toyRepository;

    @BeforeEach
    public void setUp() {
        toyRepository = new ToyRepository();
    }

    @Test
    void testAddToyForGood() {
        GoodToyDto goodToyDto = new GoodToyDto("Toy 1", "Brand A", 5, "Action Figure");

        String response = toyRepository.addToyForGood(goodToyDto);
        
        assertEquals("Toy added successfully!", response);

        List<ToyForGood> toys = toyRepository.getToysG();
        assertEquals(1, toys.size());
        assertEquals("Toy 1", toys.get(0).getTitle());

    }

    @Test
    void testAddToyForNaughty() {
        NaughtyToyDto naughtyToyDto = new NaughtyToyDto("Toy 1", "Content of Toy 1");

        String response = toyRepository.addToyForNaughty(naughtyToyDto);

        assertEquals("Toy added successfully!", response);

        List<ToyForNaughty> toys = toyRepository.getToysN();
        assertEquals(1, toys.size());
        assertEquals("Toy 1", toys.get(0).getTitle());

    }

    @Test
    void testDeleteToy() {
        GoodToyDto goodToyDto = new GoodToyDto("Toy 1", "Brand A", 5, "Action Figure");
        toyRepository.addToyForGood(goodToyDto);

        List<ToyForGood> toysBeforeDelete = toyRepository.getToysG();
        assertEquals(1, toysBeforeDelete.size());

        String response = toyRepository.deleteToy("G1");
        assertEquals("Toy successfully removed", response);

        List<ToyForGood> toysAfterDelete = toyRepository.getToysG();
        assertEquals(0, toysAfterDelete.size());
    }

    @Test
    void testGetAllToys() {
         GoodToyDto goodToyDto = new GoodToyDto("Toy 1", "Brand A", 5, "Action Figure");
        NaughtyToyDto naughtyToyDto = new NaughtyToyDto("Toy 2", "Content of Toy 2");

        toyRepository.addToyForGood(goodToyDto);
        toyRepository.addToyForNaughty(naughtyToyDto);

        String allToys = toyRepository.getAllToys();
        assertTrue(allToys.contains("Toy 1"));
        assertTrue(allToys.contains("Toy 2"));
    }

    @Test
    void testGetToysForGood() {
        GoodToyDto goodToyDto = new GoodToyDto("Toy 1", "Brand A", 5, "Action Figure");

        toyRepository.addToyForGood(goodToyDto);

        String toysForGood = toyRepository.getToysForGood();
        //assertTrue(toysForGood.contains("Toy 1"));
    }

    @Test
    void testGetToysForNaughty() {
        NaughtyToyDto naughtyToyDto = new NaughtyToyDto("Toy 1", "Content of Toy 1");

        toyRepository.addToyForNaughty(naughtyToyDto);

        String toysForNaughty = toyRepository.getToysForNaughty();
        assertTrue(toysForNaughty.contains("Toy 1"));
    }

    @Test
    void testGetToysG() {
        String toysForGood = toyRepository.getToysForGood();
        assertEquals("There are no any avaliable toy.", toysForGood);

    }

    @Test
    void testGetToysN() {
        String toysForNaughty = toyRepository.getToysForNaughty();
        assertEquals("There are no any avaliable toy.", toysForNaughty);

    }
}
