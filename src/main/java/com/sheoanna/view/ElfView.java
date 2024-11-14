package com.sheoanna.view;

import com.sheoanna.controliers.ToyController;
import com.sheoanna.dtos.GoodToyDto;
import com.sheoanna.dtos.NaughtyToyDto;

public class ElfView extends View {
    private static final ToyController controller = new ToyController();

    public static void index() {
        System.out.println("-----------------------------------------");
        System.out.println("Toy Manager (Session Type: Elf)");
        System.out.println("1. Add toy");
        System.out.println("2. See all toys");
        System.out.println("4. Log out");
        System.out.println("Select an option:");
        int option = scanner.nextInt();

        if(option == 1) selectChild();
        if (option == 4) closeSession();
    }

    public static void selectChild() {
        System.out.println("-----------------------------------------");
        System.out.println("For child...:");
        System.out.println("1. Good");
        System.out.println("2. Naughty");
        int option = scanner.nextInt();

        if (option == 1) postGoodToy();
        if (option == 2) postNaughtyToy();
    }

    public static void postGoodToy() {
        System.out.println("-----------------------------------------");
        System.out.println("Enter title:");
        String title = scanner.next();
        System.out.println("Enter the brand:");
        String brand = scanner.next();
        System.out.println("Enter the recommended age:");
        int age = scanner.nextInt();
        System.out.println("Enter the category:");
        String category = scanner.next();

        controller.postGoodToy(new GoodToyDto(title, brand, age, category));
    }

    public static void postNaughtyToy() {
        System.out.println("-----------------------------------------");
        System.out.println("Enter title: ");
        String title = scanner.nextLine();
        System.out.println("Enter the content: ");
        String content = scanner.nextLine();

        controller.postNaughtyToy(new NaughtyToyDto(title, content));
    }

    public static void addToyResponse(String response) {
        System.out.println(response);
    }

    public static void closeSession() {
        HomeView.index();
    }
}
