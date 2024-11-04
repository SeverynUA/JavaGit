package HomeWork.les5.Models;

import HomeWork.les5.Interface.ILibraryItem;

import java.time.LocalDate;
import java.util.List;

public class Newspaper implements ILibraryItem {
    private String title;
    private LocalDate releaseDate;
    private List<String> headlines;

    public Newspaper(String title, LocalDate releaseDate, List<String> headlines) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.headlines = headlines;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void DisplayInfo() {
        System.out.println("Newspaper Title: " + title);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Headlines: " + String.join(", ", headlines));
    }
}
