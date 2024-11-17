import HomeWork.Les8.ATM;
import HomeWork.Les8.Bank;
import HomeWork.Les9.ClassList;
import HomeWork.Les9.ClassMap;
import HomeWork.Les9.ClassSet;
import HomeWork.Les9.User;
import HomeWork.les7.Models.Building;
import HomeWork.les7.Models.School.School;
import HomeWork.les7.Models.School.SchoolType;
import HomeWork.les7.Models.Shop.DepartmentType;
import HomeWork.les7.Models.Shop.Shop;
import HomeWork.les7.Models.Shop.ShopType;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args)
    {
        //ClassList classlist = new ClassList();
        //ClassSet classset = new ClassSet();
        //ClassMap classmap = new ClassMap();

        User user1 = new User("Alice", 25, "123-456-789");
        User user2 = new User("Bob", 30, "987-654-321");
        User user3 = new User("Bob", 30, "987-123-321");

        Set<User> userSet = new HashSet<>();

        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);

        for (User user : userSet) {
            System.out.println(user);
        }
        System.out.println("\n");
    }
}
