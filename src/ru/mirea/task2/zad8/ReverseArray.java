package ru.mirea.task2.zad8;

import java.util.Arrays;

public class ReverseArray {
    public static void reverse(String[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int opposite = array.length - 1 - i;
            String temporary = array[i];
            array[i] = array[opposite];
            array[opposite] = temporary;
        }
    }

    public static void main(String[] args) {
        String[] words = {"один", "два", "три", "четыре", "пять"};
        System.out.println("До: " + Arrays.toString(words));
        reverse(words);
        System.out.println("После: " + Arrays.toString(words));
    }
}
