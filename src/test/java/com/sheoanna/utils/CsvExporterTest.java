package com.sheoanna.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.sheoanna.models.ToyForGood;
import com.sheoanna.models.ToyForNaughty;

public class CsvExporterTest {
    private final String testFilePath = "test_toys.csv";

    @AfterEach
    void cleanup() {
        File file = new File(testFilePath);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    void testExportToysToCSV() throws IOException {
        List<ToyForGood> goodToys = new ArrayList<>();
        goodToys.add(new ToyForGood("G1", "Teddy Bear", "Barnie", "+3", "Plush"));
        goodToys.add(new ToyForGood("G2", "Lego Set", "Lego", "+7", "Building"));

        List<ToyForNaughty> naughtyToys = new ArrayList<>();
        naughtyToys.add(new ToyForNaughty("N1", "Noisy Drum", "Annoying sound maker"));

        CsvExporter.exportToysToCSV(goodToys, naughtyToys, testFilePath);
        String fileContent = Files.readString(new File(testFilePath).toPath());

        String expectedContent = """
                Good Toys:
                ID,Title,Brand,Recommended Age,Category
                G1,Teddy Bear,Barnie,+3,Plush
                G2,Lego Set,Lego,+7,Building

                Naughty Toys:
                ID,Title,Content
                N1,Noisy Drum,Annoying sound maker
                """;
        assertEquals(expectedContent.trim(), fileContent.trim());
    }
}
