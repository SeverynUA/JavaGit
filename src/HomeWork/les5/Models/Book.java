package HomeWork.les5.Models;

import HomeWork.les5.Interface.ILibraryItem;

public class Book implements ILibraryItem {
    private String title;
    private String author;
    private String genre;
    private int pages;

    public Book(String title, String author, String genre, int pages) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pages = pages;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void DisplayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Pages: " + pages);
    }
}