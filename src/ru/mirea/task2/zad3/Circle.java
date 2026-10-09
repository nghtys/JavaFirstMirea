package ru.mirea.task2.zad3;
import java.util.Locale;


public class Circle {
    private Point center;
    private double radius;
    private double length;

    public Circle(Point center, double radius) {
        setCenter(center);
        setRadius(radius);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        if (center == null) {
            throw new IllegalArgumentException("Центр не должен быть null");
        }
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (!Double.isFinite(radius) || radius <= 0) {
            throw new IllegalArgumentException("Радиус должен быть >0");
        }
        this.radius = radius;
        this.length = 2 * Math.PI * radius;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "Circle{center=%s, radius=%.2f, length=%.2f}",
                center, radius, length);
    }
}