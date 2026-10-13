package ru.mirea.task2.zad5;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        this.age = age;
    }

    public long getHumanAge() {
        return age * 7L;
    }

    @Override
    public String toString() {
        return "Dog{name='" + name + "', age=" + age + ", humanAge=" + getHumanAge() + "}";
    }
}
