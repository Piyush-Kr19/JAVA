// Write a Java program to create a class called "Book" with attributes for title, author,
// and ISBN, and methods to add and remove books from a collection.

import java.util.Scanner;
import java.util.ArrayList;

public class Book {

    private String title;
    private String author;
    private int ISBN;

    public Book(String title , String author ,int ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getISBN(){
        return ISBN;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setISBN(int ISBN){
        this.ISBN = ISBN;
    }
}
