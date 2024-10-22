package Practice.Les4.Models;

public class LivePlace implements printInfo
{
    private String town;
    private String country;
    private String address;
    private Human human;

    public LivePlace(String town, String country, String address, Human human)
    {
        this.town = town;
        this.country = country;
        this.address = address;
        this.human = human;
    }

    public String getTown()
    {
        return town;
    }

    public String getCountry()
    {
        return country;
    }

    public String getAddress()
    {
        return address;
    }

    public Human getHuman()
    {
        return human;
    }

    @Override
    public void PrintInfo_person() {
        System.out.println("Town: " + town);
        System.out.println("Country: " + country);
        System.out.println("Address: " + address);
        human.PrintInfo_person();
    }
}
