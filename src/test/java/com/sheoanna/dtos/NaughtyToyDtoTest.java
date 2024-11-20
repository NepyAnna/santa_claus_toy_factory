package com.sheoanna.dtos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NaughtyToyDtoTest {
    NaughtyToyDto toy;

    @BeforeEach
    public void setUp() {
        toy = new NaughtyToyDto("Car", "HotWeels");
    }

    @Test
    void testContent() {
        assertEquals("HotWeels", toy.content());
    }

    @Test
    void testTitle() {
        assertEquals("Car", toy.title());
    }

    @Test
    public void testToString() { 
    String expected = "NaughtyToyDto[title=Car, content=HotWeels]";
        assertEquals(expected, toy.toString());
    }
}
