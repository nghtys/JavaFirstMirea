package ru.mirea.task2.zad4;

public class Computer {
    private String model;
    private String processor;
    private int ram;
    private double price;

    public Computer(String model, String processor, int ram, double price) {
        if (model.trim().isEmpty() || processor.trim().isEmpty()) {
            throw new IllegalArgumentException("Модель и процессор не должны быть пустыми");
        }
        if (ram <= 0 || !Double.isFinite(price) || price < 0) {
            throw new IllegalArgumentException("ОЗУ должно быть положительным, цена — неотрицательной");
        }
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Computer{model='" + model + "', processor='" + processor
                + "', ram=" + ram + " ГБ, price=" + price + "}";
    }
}