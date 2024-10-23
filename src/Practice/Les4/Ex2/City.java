package Practice.Les4.Ex2;

import java.time.LocalDate;

public class City
{
    private String name;
    private int countLives;
    private String postalCode;
    private String phoneCode;

    public City(String name,int countLives,String postalCode, String phoneCode)
    {
        this.name = name;
        this.countLives = countLives;
        this.postalCode = postalCode;
        this.phoneCode = phoneCode;
    }

    public String getName()
    {
        return name;
    }

    public int getCountLives()
    {
        return countLives;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public String getPhoneCode()
    {
        return phoneCode;
    }

    public void setName(String firstName)
    {
        if(name != null)
        {
            this.name = name;
        }
        return;
    }


    public void setCountLives(int countLives)
    {
        if(countLives != 0)
        {
            this.countLives = countLives;
        }
        return;
    }


    public void setPostalCode(String postalCode)
    {
        if(postalCode != null)
        {
            this.postalCode = postalCode;
        }
        return;
    }


    public void setPhoneCode(String firstName)
    {
        if(phoneCode != null)
        {
            this.phoneCode = phoneCode;
        }
        return;
    }

    public void PrintInfo_City()
    {
        System.out.println("Name: " + name);
        System.out.println("Count lives: " + countLives);
        System.out.println("Postal code: " + postalCode);
        System.out.println("Phone code: " + phoneCode);
    }
}
