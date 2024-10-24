package HomeWork.les4.Ex5;

import java.time.Year;
import java.util.Scanner;

public class Book
{
    private String title;
    private String fullName_author;
    private int yearPublished;
    private String namePublisher;
    private String genre;
    private int number_pages;

    public Book()
    {
        Menu();
    }

    public Book(String title, String fullName_author, int yearPublished, String namePublisher, String genre, int number_pages)
    {
        this.title = title;
        this.fullName_author = fullName_author;
        setYearPublished(yearPublished);
        this.namePublisher = namePublisher;
        this.genre = genre;
        if (number_pages > 0) {
            this.number_pages = number_pages;
        } else {
            throw new IllegalArgumentException("Кількість сторінок повинна бути більше 0.");
        }
    }

    public void setYearPublished(int yearPublished)
    {
        int currentYear = Year.now().getValue();  // Поточний рік

        // Перевіряємо, чи рік у допустимому діапазоні
        if (yearPublished >= 1900 && yearPublished <= currentYear)
        {
            this.yearPublished = yearPublished;
        } else {
            throw new IllegalArgumentException("Некоректний рік випуску: " + yearPublished);
        }
    }

    public int getYearPublished()
    {
        return yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title)
    {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        }
    }

    public String getFullName_author()
    {
        return fullName_author;
    }

    public void setFullName_author(String fullName_author)
    {
        if (fullName_author != null && !fullName_author.isEmpty())
        {
            this.fullName_author = fullName_author;
        }
    }

    public String getNamePublisher()
    {
        return namePublisher;
    }

    public void setNamePublisher(String namePublisher)
    {
        if (namePublisher != null && !namePublisher.isEmpty())
        {
            this.namePublisher = namePublisher;
        }
    }

    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String genre)
    {
        if (genre != null && !genre.isEmpty())
        {
            this.genre = genre;
        }
    }

    public int getNumber_pages()
    {
        return number_pages;
    }

    public void setNumber_pages(int number_pages)
    {

        if (number_pages > 0)
        {
            this.number_pages = number_pages;
        }
        else
        {
            throw new IllegalArgumentException("Кількість сторінок повинна бути більше 0.");
        }
    }

    private void ShowInfo()
    {
        System.out.println("Title: " + title);
        System.out.println("Year of published: " + yearPublished);
        System.out.println("Name of publisher: " + namePublisher);
        System.out.println("FullName of author: " + fullName_author);
        System.out.println("Genre: " + genre);
        System.out.println("Number of pages: " + number_pages);
    }

    public void Menu()
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Створити нову книгу");
        System.out.println("0. Вийти");

        int choice = sc.nextInt();;

        switch (choice)
        {
            case 1:

                Book book = createBook();
                System.out.println("Нова книга створена.");
                Menu(book);
                break;
            case 2:
                break;
            default: return;
        }
        return;
    }

    public void Menu(Book book)
    {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 0)
        {
            System.out.println("\n=== Меню ===");
            System.out.println("1. Показати інформацію про книгу");
            System.out.println("2. Редагувати назву книги");
            System.out.println("3. Редагувати автора книги");
            System.out.println("4. Редагувати рік випуску");
            System.out.println("5. Редагувати видавця");
            System.out.println("6. Редагувати жанр");
            System.out.println("7. Редагувати кількість сторінок");
            System.out.println("0. Вийти");

            System.out.print("Оберіть дію: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice)
            {
                case 1:
                    book.ShowInfo();
                    break;
                case 2:
                    System.out.print("Введіть нову назву книги: ");
                    String newTitle = sc.nextLine();
                    book.setTitle(newTitle);
                    break;
                case 3:
                    System.out.print("Введіть нового автора книги: ");
                    String newAuthor = sc.nextLine();
                    book.setFullName_author(newAuthor);
                    break;
                case 4:
                    System.out.print("Введіть новий рік випуску: ");
                    int newYear = sc.nextInt();
                    book.setYearPublished(newYear);
                    break;
                case 5:
                    System.out.print("Введіть нове ім'я видавця: ");
                    String newPublisher = sc.nextLine();
                    book.setNamePublisher(newPublisher);
                    break;
                case 6:
                    System.out.print("Введіть новий жанр: ");
                    String newGenre = sc.nextLine();
                    book.setGenre(newGenre);
                    break;
                case 7:
                    System.out.print("Введіть нову кількість сторінок: ");
                    int newPages = sc.nextInt();
                    book.setNumber_pages(newPages);
                    break;
                case 0:
                    System.out.println("Вихід з меню.");
                    break;
                default:
                    System.out.println("Некоректний вибір. Спробуйте ще раз.");
            }
        }
    }

    private Book createBook()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть назву книги: ");
        String title = sc.nextLine();

        System.out.print("Введіть ім'я автора: ");
        String fullName_author = sc.nextLine();

        System.out.print("Введіть рік випуску: ");
        int yearPublished = sc.nextInt();

        System.out.print("Введіть ім'я видавця: ");
        sc.nextLine(); // Очищення після вводу int
        String namePublisher = sc.nextLine();

        System.out.print("Введіть жанр: ");
        String genre = sc.nextLine();

        System.out.print("Введіть кількість сторінок: ");
        int number_pages = sc.nextInt();

        return new Book(title, fullName_author, yearPublished, namePublisher, genre, number_pages);
    }
}

