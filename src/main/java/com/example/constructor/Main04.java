package com.example.constructor;

public class Main04 {
    public static void main(String[] args) {
        User user = new User(0, "John", "Smith");
        Author author = new Author(0, "Jamie", "Haron", "Writtter");
        Book book = new Book(0, "Przez laki zielone", author);
        Book book2 = new Book(1, "How to learn coding", author);
        user.addBook(book);
        user.addBook(book2);
        user.printUser();
    }
}
