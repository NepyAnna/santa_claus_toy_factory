package com.sheoanna.view;

public class SantaView extends View {

    public static void index() {
        System.out.println("-----------------------------------------");
        System.out.println("Toy Manager (Session Type: Santa)");
        System.out.println("1. See list of good children's toys");
        System.out.println("2. See list of naughty kids toys");
        System.out.println("3. Save list of all toys (.csv)");
        System.out.println("4. Log out");
        System.out.println("Select an option:");

        int option = scanner.nextInt();

        if (option == 1)
            getAllToysForGood();
        if (option == 2)
            getToysForNaughty();
        if (option == 3)
            saveToysCSV();
        if (option == 4)
            HomeView.index();
    }

    public static void getAllToysForGood() {
        System.out.println(controller.getToysForGood());
        index();
    }

    public static void getToysForNaughty() {
        System.out.println(controller.getToysForNaughty());
        index();
    }

    public static void saveToysCSV() {
        String filePath = "./toys.csv";
        controller.exportToysToCSV(filePath);
        System.out.println("Saved toy list.");
        index();
    }

    public static void closeSession() {
        HomeView.index();
    }
}
