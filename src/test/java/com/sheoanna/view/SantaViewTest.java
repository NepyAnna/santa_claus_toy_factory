package com.sheoanna.view;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.sheoanna.controliers.ToyController;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SantaViewTest {
    private SantaView santaView;
    private ToyController controllerMock;
    private Scanner scannerMock;

    @BeforeEach
    public void setUp() {
        controllerMock = mock(ToyController.class);
        scannerMock = mock(Scanner.class);

        santaView = new SantaView();
    }

    @Test
    void testCloseSession() {

    }

    @Test
    void testGetAllToysForGood() {
       

    }

    @Test
    void testGetToysForNaughty() {

    }

    @Test
    void testIndex() {

    }

    @Test
    void testSaveToysCSV() {

    }
}
