import HomeWork.les7.Models.Building;
import HomeWork.les7.Models.School.School;
import HomeWork.les7.Models.School.SchoolType;
import HomeWork.les7.Models.Shop.DepartmentType;
import HomeWork.les7.Models.Shop.Shop;
import HomeWork.les7.Models.Shop.ShopType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        // Створення будівель
        List<Building> buildings = new ArrayList<>();

        // Створення шкіл
        School school = new School("123 School Ave", SchoolType.GYMNASIUM);
        buildings.add(school);

        // Створення магазинів
        List<DepartmentType> departments = new ArrayList<>();
        departments.add(DepartmentType.GROCERIES);
        departments.add(DepartmentType.CLOTHING);
        Shop shop = new Shop("456 Shop St", ShopType.SUPERMARKET, departments);
        buildings.add(shop);

        // Виведення інформації про всі будівлі
        System.out.println("Initial Buildings:");
        for (Building building : buildings) {
            building.displayInfo();
        }

        // Зміна адреси для школи
        school.setAddress("789 New School Ave");
        System.out.println("\nAfter Changing School Address:");
        school.displayInfo();

        // Видалення магазину з колекції
        buildings.remove(shop);
        System.out.println("\nAfter Removing the Shop:");
        for (Building building : buildings) {
            building.displayInfo();
        }
    }
}
