package Practice.Les4.Ex3;

import java.util.List;

public class Country
{
    private String name;
    private int countLives;
    private String phoneCode;
    private List<String> cities;

    public Country(){}

    public Country(String name,int countLives,List<String> cities, String phoneCode)
    {
        this.name = name;
        this.countLives = countLives;
        this.cities = cities;
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

    public List<String> GetCities()
    {
        return cities;
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


    public void setCities(List<String> cities)
    {
        if(cities != null)
        {
            this.cities = cities;
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

    public void PrintInfo_Country()
    {
        System.out.println("Name: " + name);
        System.out.println("Count lives: " + countLives);

        System.out.println("Cities: ");

        for(String city : cities)
        {
            System.out.println(city + " ");
        }

        System.out.println("Phone code: " + phoneCode);
    }
}