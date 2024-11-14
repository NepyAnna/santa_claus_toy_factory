package com.sheoanna;

import com.sheoanna.controliers.HomeController;

public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        new HomeController();
}
}
