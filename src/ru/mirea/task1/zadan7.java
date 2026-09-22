package ru.mirea.task1;
import java.util.Scanner;

public class zadan7 {
    public static long factorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException(
                    "Число должно быть от 0 до 20."
            );
        }

        long result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {   // check fact 0 i 5
        System.out.println("0! = " + factorial(0));
        System.out.println("5! = " + factorial(5));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число от 0 до 20: ");
        int n = scanner.nextInt();

        if (n >= 0 && n <= 20) {
            System.out.println(n + "! = " + factorial(n));
        } else {
            System.out.println("Число должно быть целым И от 0 до 20");
        }

        scanner.close();
    }
}
