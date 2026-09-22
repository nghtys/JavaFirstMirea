package ru.mirea.task1;
import java.util.Scanner;

public class zadan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Размер массива должен быть >0");
            scanner.close();
            return;
        }

        int[] numbers = new int[n];
        int i = 0;

        do {
            System.out.print("Введите элемент [" + i + "]: ");
            numbers[i] = scanner.nextInt();
            i++;
        } while (i < n);

        long sumDoWhile = 0;
        i = 0;

        do {
            sumDoWhile += numbers[i];
            i++;
        } while (i < n);

        long sumWhile = 0;
        int min = numbers[0];
        int max = numbers[0];
        i = 0;

        while (i < n) {
            sumWhile += numbers[i];

            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max) {
                max = numbers[i];
            }

            i++;
        }

        System.out.println("Сумма через do while: " + sumDoWhile);
        System.out.println("Сумма через while: " + sumWhile);
        System.out.println("Min элемент: " + min);
        System.out.println("Max элемент: " + max);

        scanner.close();
    }
}
