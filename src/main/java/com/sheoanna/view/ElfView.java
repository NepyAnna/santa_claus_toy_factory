package com.sheoanna.view;

import com.sheoanna.dtos.GoodToyDto;
import com.sheoanna.dtos.IdOfToyDTO;
import com.sheoanna.dtos.NaughtyToyDto;

public class ElfView extends View {

    public static void index() {
        System.out.println("-----------------------------------------");
        System.out.println("Toy Manager (Session Type: Elf)");
        System.out.println("1. Add toy.");
        System.out.println("2. See all toys.");
        System.out.println("3. Delete toy.");
        System.out.println("4. Log out.");
        System.out.println("Select an option:");
        int option = scanner.nextInt();
        scanner.nextLine();

        if(option == 1) selectChild();
        if(option == 2) getAllToys();
        if(option == 3) deleteToy();
        if (option == 4) closeSession();
    }

    public static void selectChild() {
        System.out.println("-----------------------------------------");
        System.out.println("For child...:");
        System.out.println("1. Good.");
        System.out.println("2. Naughty.");
        int option = scanner.nextInt();
        scanner.nextLine();

        if (option == 1) postGoodToy();
        if (option == 2) postNaughtyToy();
    }

    public static void postGoodToy() {
        System.out.println("-----------------------------------------");
        System.out.println("Enter title:");
        String title = scanner.nextLine();
        System.out.println("Enter the brand:");
        String brand = scanner.nextLine();
        System.out.println("Enter the recommended age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the category:");
        String category = scanner.nextLine();

        controller.postGoodToy(new GoodToyDto(title, brand, age, category));
        index();
    }

    public static void postNaughtyToy() {
        System.out.println("-----------------------------------------");
        System.out.println("Enter title: ");
        String title = scanner.nextLine();
        System.out.println("Enter the content: ");
        String content = scanner.nextLine();
       
        controller.postNaughtyToy(new NaughtyToyDto(title, content));
        index();
    }

    public static void getAllToys() {
        System.out.println(controller.getAllToys());
        index();;
    }

    public static void deleteToy() {
        System.out.println("-----------------------------------------");
        System.out.println("Enter the ID of the toy to be deleted: ");
        String idOfToy = scanner.next();

        controller.deleteToy(new IdOfToyDTO(idOfToy));
        index();
    }

    public static void addToyResponse(String response) {
        System.out.println(response);
    }

    public static void closeSession() {
        HomeView.index();
    }
}
