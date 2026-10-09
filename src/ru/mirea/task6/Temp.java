package ru.mirea.task6;

import java.util.Locale;
import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.print("Введите температуру в градусах C (дробная часть через точку): ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Требуется число.");
                return;
            }
            double celsius = scanner.nextDouble();

            Convertable kelvinConverter = new KelvinConverter();
            Convertable fahrenheitConverter = new FahrenheitConverter();

            System.out.printf(Locale.US, "По Кельвину: %.2f K%n",
                    kelvinConverter.convert(celsius));
            System.out.printf(Locale.US, "По Фаренгейту: %.2f °F%n",
                    fahrenheitConverter.convert(celsius));
        }
    }
}

interface Convertable {
    double convert(double celsius);
}

class KelvinConverter implements Convertable {
    @Override
    public double convert(double celsius) {
        return celsius + 273.15;
    }
}

class FahrenheitConverter implements Convertable {
    @Override
    public double convert(double celsius) {
        return celsius * 9.0 / 5.0 + 32;
    }
}

