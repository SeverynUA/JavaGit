package Practice.Les4.Ex1;

public class Contact implements printInfo
{
    private String phone;
    private Human human;

    public Contact(String phone, Human human)
    {
        this.phone = phone;
        this.human = human;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        if(phone != null)
        {
            this.phone = phone;
        }
        return;
    }

    public Human getHuman()
    {
        return human;
    }

    @Override
    public void PrintInfo_person()
    {
        System.out.println("Phone: " + phone);
    }
}

