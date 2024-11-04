package HomeWork.les5.Models;

import HomeWork.les5.Interface.ILibraryItem;

import java.util.List;

public class Almanac implements ILibraryItem
{
    private String title;
    private List<String> works;

    public Almanac(String title, List<String> works) {
        this.title = title;
        this.works = works;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void DisplayInfo() {
        System.out.println("Almanac Title: " + title);
        System.out.println("Works: " + String.join(", ", works));
    }
}
