package com.sheoanna.view;

import java.util.Scanner;
import com.sheoanna.controliers.ToyController;

public abstract class View {
    protected static Scanner scanner = new Scanner(System.in);
    protected static final ToyController controller = new ToyController();
}
