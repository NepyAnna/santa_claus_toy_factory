package com.sheoanna.view;

public class SantaView extends View {
    public static void index() {
        System.out.println("-----------------------------------------");
        System.out.println("Toy Manager (Session Type: Santa)");
        System.out.println("1. See list of good children's toys");
        System.out.println("2. See list of bad kids toys");
        System.out.println("3. Save list of all toys (.csv)");
        System.out.println("4. Log out");
        System.out.println("Select an option:");

        int option = scanner.nextInt();

        if (option == 4) HomeView.index();
    }

    public static void closeSession() {
        HomeView.index();
    }
}
