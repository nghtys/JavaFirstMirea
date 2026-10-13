package ru.mirea.task2.zad7;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Автор", "Название", 2000);
        book.setAuthor("Александр Пушкин");
        book.setTitle("Медный всадник");
        book.setYear(1833);
        System.out.println(book);
        Bookshelf shelf = new Bookshelf();
        shelf.addBook("Лев Толстой", "Война и мир", 1869);
        shelf.addBook(book.getAuthor(), book.getTitle(), book.getYear());
        shelf.addBook("Фёдор Достоевский", "Идиот", 1868);
        System.out.println("Книг на полке: " + shelf.getCount());
        System.out.println("Самая ранняя: " + shelf.getEarliestBook());
        System.out.println("Самая поздняя: " + shelf.getLatestBook());
        shelf.sortByYear();
        System.out.println("Книги по возрастанию года издания:");
        shelf.printBooks();
    }
}
