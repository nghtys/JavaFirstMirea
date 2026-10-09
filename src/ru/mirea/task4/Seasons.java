package ru.mirea.task4;

public class Seasons {
    public static void main(String[] args) {
        Season favoriteSeason = Season.SUMMER;

        System.out.println("Любимое время года:");
        printSeason(favoriteSeason);
        printLove(favoriteSeason);

        System.out.println("\nВсе времена года:");
        for (Season season : Season.values()) {
            printSeason(season);
        }
    }

    public static void printLove(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }

    private static void printSeason(Season season) {
        System.out.println(season.getTitle()
                + ": средняя температура " + season.getAverageTemperature()
                + " °C; " + season.getDescription());
    }
}

enum Season {
    WINTER("Зима", -10),
    SPRING("Весна", 10),
    SUMMER("Лето", 25) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN("Осень", 5);

    private final String title;
    private final double averageTemperature;

    Season(String title, double averageTemperature) {
        this.title = title;
        this.averageTemperature = averageTemperature;
    }

    public String getTitle() {
        return title;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
