package ru.mirea.task2.zad5;

import java.util.Arrays;

public class DogKennel {
    private Dog[] dogs = new Dog[0];

    public void addDogs(Dog... newDogs) {
        for (Dog dog : newDogs) {
            if (dog == null) {
                throw new IllegalArgumentException("Собака не может быть пустой");
            }
        }
        int oldSize = dogs.length;
        dogs = Arrays.copyOf(dogs, oldSize + newDogs.length);
        System.arraycopy(newDogs, 0, dogs, oldSize, newDogs.length);
    }

    public void printDogs() {
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}
