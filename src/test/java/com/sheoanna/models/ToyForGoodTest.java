package com.sheoanna.models;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToyForGoodTest {
    private ToyForGood toy; 

    @BeforeEach
    public void setUp(){
        toy = new ToyForGood("G1", "Doll", "Barbie",5, "Dolls");
    }
    @Test
    void testGetBrand() {
        assertEquals("Barbie", toy.getBrand());

    }

    @Test
    void testGetCategory() {
        assertEquals("Dolls", toy.getCategory());
    }

    @Test
    void testGetRecommendedAge() {
        assertEquals(5, toy.getRecommendedAge());
    }

    @Test
    void testToString() {
        assertEquals("Identifier: G1, Title: Doll, Brand: Barbie, Recommended age: 5, Category: Dolls", toy.toString());
    }
}
