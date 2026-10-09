package ru.mirea.task3;
import java.util.Arrays;
import java.util.Random;

public class rndm {
    public static void main(String[] args){
        double[] mathArray = new double[10];
        double[] rndmArray = new double[10];
        Random random = new Random();

        for (int i = 0; i < mathArray.length; i++) {
            mathArray[i] = Math.random();
            rndmArray[i] = random.nextDouble();
        }
        System.out.println("math.random(), before: " + Arrays.toString((mathArray)));
        Arrays.sort(mathArray);
        System.out.println("math.random(), after: " + Arrays.toString((mathArray)));
        System.out.println("Random, before: " + Arrays.toString((rndmArray)));
        Arrays.sort(rndmArray);
        System.out.println("Random, before: " + Arrays.toString((rndmArray)));
    }
}
