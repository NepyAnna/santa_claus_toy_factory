package com.sheoanna.view;

public class HomeView  extends View {
    public static void index() {
        System.out.println("Log in as:");
        System.out.println("1. Elf");
        System.out.println("2. Santa Claus");
        System.out.println("3. Exit");
        System.out.println("Seleccione una opción:");

        int option = scanner.nextInt();

        if (option == 1) ElfView.index();
        if (option == 3) quit();
    }

    public static void quit() {
        scanner.close();
    }
}
