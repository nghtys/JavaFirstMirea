package ru.mirea.task2.zad2;

public class testball {
    public static void main(String[] args) {
        ball first = new ball();
        ball second = new ball(2.5, 4.0);
        System.out.println("first ball: " + first);
        System.out.println("second ball: " + second);
        first.setX(1.0);
        first.setY(2.0);
        System.out.println("coords: " + first.getX() + ", " + first.getY());
        second.setXY(5.0, 6.0);
        System.out.println("После setXY: " + second);
        second.move(-2.0, 3.0);
        System.out.println("После перемещения: " + second);
    }
}
