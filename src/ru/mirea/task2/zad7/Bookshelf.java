package ru.mirea.task2.zad7;

import java.util.Arrays;
import java.util.Comparator;

public class Bookshelf {
    private Book[] books = new Book[0];
    private int count;

    public void addBook(String author, String title, int year) {
        books = Arrays.copyOf(books, count + 1);
        books[count++] = new Book(author, title, year);
    }

    public int getCount() {
        return count;
    }

    private Book copyBook(Book book) {
        return new Book(book.getAuthor(), book.getTitle(), book.getYear());
    }

    public Book getEarliestBook() {
        if (count == 0) {
            return null;
        }
        Book earliest = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() < earliest.getYear()) {
                earliest = books[i];
            }
        }
        return copyBook(earliest);
    }

    public Book getLatestBook() {
        if (count == 0) {
            return null;
        }
        Book latest = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() > latest.getYear()) {
                latest = books[i];
            }
        }
        return copyBook(latest);
    }

    public void sortByYear() {
        Arrays.sort(books, 0, count, Comparator.comparingInt(Book::getYear));
    }

    public void printBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}
