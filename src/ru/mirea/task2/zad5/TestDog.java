package ru.mirea.task2.zad5;

public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog("Чепух", 2);
        System.out.println("Кличка: " + dog.getName() + ", возраст: " + dog.getAge());
        dog.setName("Барсик");
        dog.setAge(3);
        System.out.println("Человеческий возраст: " + dog.getHumanAge());
        DogKennel kennel = new DogKennel();
        kennel.addDogs(dog, new Dog("Шарик", 5), new Dog("Рекс", 1));
        kennel.printDogs();
    }
}
