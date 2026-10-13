package ru.mirea.task2.zad10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите строку:");
            String line = scanner.hasNextLine() ? scanner.nextLine().trim() : "";
            int count = line.isEmpty() ? 0 : line.split("(?U)\\s+").length;
            System.out.println("Количество слов: " + count);
        }
    }
}
