package ru.mirea.task1;

public class zadan3 {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 12, 16, 20};
        int sum = 0;

        System.out.print("Массив: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println();
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}

