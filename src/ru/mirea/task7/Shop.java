package ru.mirea.task7;

public class Shop implements Printable {
    private final String name;

    public Shop(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Shop) {
                Shop magazine = (Shop) item;
                System.out.println(magazine.name);
            }
        }
    }

    public static void main(String[] args) {
        Printable[] publications = {
                new Book("Мастер и Маргарита"),
                new Shop("Наука и жизнь"),
                new Book("Война и мир"),
                new Shop("Вокруг света")
        };

        printMagazines(publications);
    }
}

interface Printable {
    void print();
}

class Book implements Printable {
    private final String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
