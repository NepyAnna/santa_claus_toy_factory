package com.sheoanna.dtos;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GoodToyDtoTest {
    GoodToyDto toy;
    
    @BeforeEach
    public void setUp() {
        toy = new GoodToyDto("Lego Set", "Lego", 8, "Building");
    }
    
    
    @Test
    void testBrand() {
        assertEquals("Lego", toy.brand());
    }

    @Test
    void testCategory() {
        assertEquals("Building", toy.category());
    }

    @Test
    void testRecommendedAge() {
        assertEquals(8, toy.recommendedAge());
    }

    @Test
    void testTitle() {
        assertEquals("Lego Set", toy.title());
    }

    @Test
    public void testToString() { 
    String expected = "GoodToyDto[title=Lego Set, brand=Lego, recommendedAge=8, category=Building]";
        assertEquals(expected, toy.toString());
    }
}
