import HomeWork.Les2.HomeWork_1;
import Practice.Les4.Ex1.Contact;
import Practice.Les4.Ex1.Human;
import Practice.Les4.Ex1.LivePlace;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        //HomeWork_1 homeWork1 = new HomeWork_1();

        Human human1 = new Human("Severyn","Smykalo", "03/05/2004");
        Contact contact1 = new Contact("604 991 2964",human1);
        LivePlace livePlace1 = new LivePlace("Rivne","Ukraine","Kostromska 1",human1);

        human1.setContact(contact1);
        human1.setLivePlace(livePlace1);

        human1.PrintInfo_person();
    }
}