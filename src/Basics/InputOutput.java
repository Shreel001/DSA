package Basics;

import java.util.Scanner;

public class InputOutput {
    public static void inputOutput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.print("You are " + name);
    }

    public static void main(String[] args) {
        inputOutput();
    }
}
