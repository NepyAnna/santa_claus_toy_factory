package com.sheoanna.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToyForNaughtyTest {
    private ToyForNaughty toy;

    @BeforeEach
    public void setUp() {
        toy = new ToyForNaughty("Ball", "N1", "Small ball");
    } 
    @Test
    void testGetContent() {
        assertEquals("Small ball", toy.getContent());
    }

    @Test
    void testToString() {
        assertEquals("Identifier: Ball, Title: N1, Content: Small ball", toy.toString());

    }
}
