package com.example.constructor;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private String surname;
    private List<Book> books = new ArrayList<>();

    public User(int id, String name, String surname){
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
    public void addBook(Book book){
        this.books.add(book);
    }
    public void printUser(){
        StringBuilder sb = new StringBuilder();
        sb.append("Id: " + id + "\n");
        sb.append("Name: " + name + "\n");
        sb.append("Surname: " + surname + "\n");
        sb.append("Books: ");
        for (Book b : this.books){
            sb.append(b.getTitle() + ", ");
        }
        sb.delete(sb.length()-2, sb.length()-1);
        System.out.println(sb);
    }
}
