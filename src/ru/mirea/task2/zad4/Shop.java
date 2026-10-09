package ru.mirea.task2.zad4;
import java.util.Arrays;

public class Shop {
    private Computer[] computers = new Computer[0];
    private int count;

    public void addComputer(Computer computer) {
        if (computer == null) {
            throw new IllegalArgumentException("Компьютер не должен быть null");
        }
        computers = Arrays.copyOf(computers, count + 1);
        computers[count++] = computer;
    }

    public boolean removeComputer(String model) {
        for (int i = 0; i < count; i++) {
            if (computers[i].getModel().equalsIgnoreCase(model)) {
                System.arraycopy(computers, i + 1, computers, i, count - i - 1);
                computers = Arrays.copyOf(computers, --count);
                return true;
            }
        }
        return false;
    }

    public Computer findComputer(String model) {
        for (int i = 0; i < count; i++) {
            if (computers[i].getModel().equalsIgnoreCase(model)) {
                return computers[i];
            }
        }
        return null;
    }

    public int getCount() {
        return count;
    }

    public void printComputers() {
        if (count == 0) {
            System.out.println("Магазин пуст");
        }
        for (int i = 0; i < count; i++) {
            System.out.println(computers[i]);
        }
    }
}
