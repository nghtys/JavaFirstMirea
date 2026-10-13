package ru.mirea.task2.zad6;

public class TestCircle {
    public static void main(String[] args) {
        Circle first = new Circle(0.0, 0.0, 3.0);
        Circle second = new Circle(2.0, 1.0, 5.0);
        System.out.println(first);
        System.out.println("Площадь: " + first.getArea());
        System.out.println("Длина: " + first.getLength());
        System.out.println("Сравнение с большей окружностью: " + first.compareTo(second));
        first.setX(1.0);
        first.setY(2.0);
        first.setRadius(5.0);
        System.out.println("Центр: " + first.getX() + ", " + first.getY());
        System.out.println("Радиус: " + first.getRadius());
        System.out.println("Сравнение равных по радиусу окружностей: " + first.compareTo(second));
        first.setRadius(6.0);
        System.out.println("Сравнение с меньшей окружностью: " + first.compareTo(second));
    }
}
