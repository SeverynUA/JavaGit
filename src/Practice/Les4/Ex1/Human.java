package Practice.Les4.Ex1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import java.util.Date;

public class Human implements printInfo
{
    private String firstName;
    private String lastName;
    private LocalDate birthday;

    private Contact contact;
    private LivePlace livePlace;

    public Human(String firstName, String lastName, String birthday)
    {
        this.firstName = firstName;
        this.lastName = lastName;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try
        {
            this.birthday = LocalDate.parse(birthday, formatter);
        }
        catch (DateTimeParseException e)
        {
            System.out.println("Помилка парсингу дати: " + e.getMessage());
        }
    }

    public String getBirthdayAsString()
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.birthday.format(formatter);
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public LocalDate getBirthday()
    {
        return birthday;
    }

    public void setFirstName(String firstName)
    {
        if(firstName != null)
        {
            this.firstName = firstName;
        }
        return;
    }

    public void setContact(Contact contact)
    {
        this.contact = contact;
    }

    public void setLivePlace(LivePlace livePlace)
    {
        this.livePlace = livePlace;
    }

    public void setLastName(String lastName)
    {
        if(lastName != null)
        {
            this.lastName = lastName;
        }
        return;
    }

    public void setBirthday(String birthday)
    {
        if (birthday != null)
        {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            try
            {
                this.birthday = LocalDate.parse(birthday, formatter);
            }
            catch (DateTimeParseException e)
            {
                System.out.println("Помилка парсингу дати: " + e.getMessage());
            }
        } else
        {
            System.out.println("Дата народження не може бути null.");
        }
        return;
    }

    @Override
    public void PrintInfo_person()
    {
        System.out.println("Firstname: " + firstName);
        System.out.println("Lastname: " + lastName);
        System.out.println("Birthday: " + getBirthdayAsString());

        if (contact != null)
        {
            System.out.println("Contact Information:");
            contact.PrintInfo_person();
        }

        if (livePlace != null)
        {
            System.out.println("Living Place Information:");
            livePlace.PrintInfo_person();
        }
    }
}
