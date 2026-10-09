package ru.mirea.task2.zad1;

public class testauthor {

    public static void main(String[] args) {
        author author = new author("Иван Петров", "ivan@example.com", "m");
        System.out.println(author);
        System.out.println("Имя: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Пол: " + author.getGender());
        author.setEmail("petrov@example.com");
        System.out.println("После смены: " + author);
    }
}
