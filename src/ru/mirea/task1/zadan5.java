package ru.mirea.task1;
import java.util.Scanner;

public class zadan5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (args.length == 0) {
            System.out.print("Введите аргументы через пробел: ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Аргументы не введены.");
                scanner.close();
                return;
            }

            args = input.split("\\s+");
        }

        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
        }

        scanner.close();
    }

}
