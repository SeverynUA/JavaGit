import HomeWork.les5.Interface.ILibraryItem;
import HomeWork.les5.LibraryCatalog;
import HomeWork.les5.Models.Almanac;
import HomeWork.les5.Models.Book;
import HomeWork.les5.Models.Newspaper;

import java.time.LocalDate;
import java.util.Arrays;

public class Main
{
    public static void main(String[] arg)
    {
        LibraryCatalog catalog = new LibraryCatalog();

        // Тестова ініціалізація каталогу
        ILibraryItem book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 180);
        ILibraryItem book2 = new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", 281);

        ILibraryItem newspaper1 = new Newspaper("The Daily News", LocalDate.of(2024, 10, 15),
                Arrays.asList("Headline 1", "Headline 2", "Headline 3"));

        ILibraryItem almanac1 = new Almanac("Literary Almanac",
                Arrays.asList("Short Story by Author A", "Poem by Author B", "Essay by Author C"));

        // Додаємо елементи в каталог
        catalog.AddItem(book1);
        catalog.AddItem(book2);
        catalog.AddItem(newspaper1);
        catalog.AddItem(almanac1);

        // Виведення всіх елементів
        System.out.println("\n--- Displaying All Items ---");
        catalog.DisplayAllItems();

        // Пошук по назві
        System.out.println("\n--- Searching for 'The Great Gatsby' ---");
        catalog.SearchByTitle("The Great Gatsby");

        // Пошук по автору
        System.out.println("\n--- Searching for books by 'Harper Lee' ---");
        catalog.SearchByAuthor("Harper Lee");
    }
}