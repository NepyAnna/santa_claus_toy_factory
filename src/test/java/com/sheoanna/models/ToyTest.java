package com.sheoanna.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToyTest {
    private Toy toy; 

    @BeforeEach
    void setUp() {
       toy = new Toy("G1", "Doll"){};
    }
    
    @Test
    void testGetId() {
        assertEquals("G1", toy.getId());
    }

    @Test
    void testGetTitle() {
        assertEquals("Doll", toy.getTitle());
    }

    @Test
    void testToString() {
        assertEquals("Identifier: G1, Title: Doll", toy.toString());
    }
}
