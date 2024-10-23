package HomeWork.les4.Ex5;

import java.time.Year;

public class Book
{
    private String title;
    private String fullName_author;
    private int yearPublished;
    private String namePublisher;
    private String genre;
    private int number_pages;

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

    public void ShowInfo()
    {
        System.out.println("Title: " + title);
        System.out.println("Year of published: " + yearPublished);
        System.out.println("Name of publisher: " + namePublisher);
        System.out.println("FullName of author: " + fullName_author);
        System.out.println("Genre: " + genre);
        System.out.println("Number of pages: " + number_pages);
    }
}

