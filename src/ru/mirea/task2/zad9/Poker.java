package ru.mirea.task2.zad9;

import java.util.Random;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Количество игроков (1–10): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Нужно ввести целое число");
                return;
            }
            int players = scanner.nextInt();
            if (players < 1 || players > 10) {
                System.out.println("От 1 до 10 игроков");
                return;
            }
            String[] suits = {"пики", "черви", "бубны", "трефы"};
            String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "валет", "дама", "король", "туз"}; // porvan2z
            String[] deck = new String[suits.length * ranks.length];
            int index = 0;
            for (String suit : suits) {
                for (String rank : ranks) {
                    deck[index++] = rank + " " + suit;
                }
            }
            Random random = new Random();
            for (int i = deck.length - 1; i > 0; i--) {
                int j = random.nextInt(i + 1);
                String temporary = deck[i];
                deck[i] = deck[j];
                deck[j] = temporary;
            }
            for (int player = 0; player < players; player++) {
                System.out.println("Игрок " + (player + 1) + ":");
                for (int card = 0; card < 5; card++) {
                    System.out.println(deck[card * players + player]);
                }
                System.out.println();
            }
        }
    }
}
