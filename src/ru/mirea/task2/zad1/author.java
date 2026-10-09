package ru.mirea.task2.zad1;

public class author {

    private String name;
    private String email;
    private String gender;

    public author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return "Author{name='" + name + "', email='" + email + "', gender=" + gender + "}";
    }

}
