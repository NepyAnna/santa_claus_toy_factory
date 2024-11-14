package com.sheoanna.view;

public class ElfView extends View {
    public static void index() {
        System.out.println("-----------------------------------------");
        System.out.println("Gestor de juguetes (Tip de sessión: Elfo)");
        System.out.println("1. Añadir juguete");
        System.out.println("2. Ver todos los juguetes");
        System.out.println("4. Cerrar sesión");
        System.out.println("Seleccione una opción:");
        int option = scanner.nextInt();

        if (option == 4) closeSession();
    }

    public static void closeSession() {
        HomeView.index();
    }
}
