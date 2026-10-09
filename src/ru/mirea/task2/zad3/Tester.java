package ru.mirea.task2.zad3;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Tester {
    private Circle[] circles = new Circle[0];
    private int count;

    public void addCircle(Circle circle) {
        if (circle == null) {
            throw new IllegalArgumentException("Circle не должна быть null");
        }
        circles = Arrays.copyOf(circles, count + 1);
        circles[count++] = circle;
    }

    public int getCount() {
        return count;
    }

    public Circle getSmallestCircle() {
        if (count == 0) {
            return null;
        }
        Circle smallest = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() < smallest.getRadius()) {
                smallest = circles[i];
            }
        }
        return smallest;
    }

    public Circle getLargestCircle() {
        if (count == 0) {
            return null;
        }
        Circle largest = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() > largest.getRadius()) {
                largest = circles[i];
            }
        }
        return largest;
    }

    public void sortByRadius() {
        Arrays.sort(circles, 0, count, Comparator.comparingDouble(Circle::getRadius));
    }

    public void printCircles() {
        for (int i = 0; i < count; i++) {
            System.out.println(circles[i]);
        }
    }

    public static void main(String[] args) {
        Tester tester = new Tester();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            Point center = new Point(random.nextInt(21) - 10, random.nextInt(21) - 10);
            double radius = 1 + random.nextDouble() * 9;
            tester.addCircle(new Circle(center, radius));
        }
        System.out.println("Количество circles: " + tester.getCount());
        tester.printCircles();
        System.out.println("наименьшая: " + tester.getSmallestCircle());
        System.out.println("наибольшая: " + tester.getLargestCircle());
        tester.sortByRadius();
        System.out.println("По возрастанию радиуса:");
        tester.printCircles();
    }
}
