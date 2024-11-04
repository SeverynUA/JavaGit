package HomeWork.les5;

import HomeWork.les5.Interface.ILibraryItem;
import HomeWork.les5.Models.Book;
import HomeWork.les5.Models.Newspaper;
import HomeWork.les5.Models.Almanac;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibraryCatalog
{
    private List<ILibraryItem> items = new ArrayList<>();

    public void AddItem(ILibraryItem item) {
        if (item != null) {
            items.add(item);
            System.out.println("Item added: " + item.getTitle());
        }
    }

    public void DisplayAllItems() {
        System.out.println("Library Catalog:");
        for (ILibraryItem item : items) {
            item.DisplayInfo();
            System.out.println("----------");
        }
    }

    public void SearchByTitle(String title) {
        System.out.println("Searching for title: " + title);
        for (ILibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                item.DisplayInfo();
                return;
            }
        }
        System.out.println("Item with title '" + title + "' not found.");
    }

    public void SearchByAuthor(String author) {
        System.out.println("Searching for author: " + author);
        for (ILibraryItem item : items) {
            if (item instanceof Book && ((Book) item).getAuthor().equalsIgnoreCase(author)) {
                item.DisplayInfo();
                return;
            }
        }
        System.out.println("No books found by author '" + author + "'.");
    }

    public void InitializeCatalog() {
        AddItem(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Novel", 180));
        AddItem(new Book("To Kill a Mockingbird", "Harper Lee", "Novel", 281));
        AddItem(new Newspaper("The Daily News", LocalDate.now(), Arrays.asList("Breaking News", "Sports Highlights")));
        AddItem(new Almanac("Literary Almanac", Arrays.asList("Pride and Prejudice", "Moby Dick", "War and Peace")));
    }
}
