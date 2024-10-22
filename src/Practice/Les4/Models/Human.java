package Practice.Les4.Models;

import java.util.Date;

public class Human implements printInfo
{
    private String name;
    private Date birthday;

    public Human(String name, Date birthday)
    {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName()
    {
        return name;
    }

    public Date getBirthday()
    {
        return birthday;
    }

    @Override
    public void PrintInfo_person()
    {
        System.out.println("Name: " + name);
        System.out.println("Birthday: " + birthday);
    }
}
