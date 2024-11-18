package com.sheoanna.utils;

import com.sheoanna.models.ToyForGood;
import com.sheoanna.models.ToyForNaughty;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvExporter {

    public static void exportToysToCSV(List<ToyForGood> goodToys, List<ToyForNaughty> naughtyToys, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.append("Good Toys:\n");
            writer.append("ID,Title,Brand,Recommended Age,Category\n");
            for (ToyForGood toy : goodToys) {
                writer.append(toy.getId())
                      .append(",")
                      .append(toy.getTitle())
                      .append(",")
                      .append(toy.getBrand())
                      .append(",")
                      .append(String.valueOf(toy.getRecommendedAge()))
                      .append(",")
                      .append(toy.getCategory())
                      .append("\n");
            }

            writer.append("\nNaughty Toys:\n");
            writer.append("ID,Title,Content\n");
            for (ToyForNaughty toy : naughtyToys) {
                writer.append(toy.getId())
                      .append(",")
                      .append(toy.getTitle())
                      .append(",")
                      .append(toy.getContent())
                      .append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
