package HomeWork.les7.Models;

import HomeWork.les7.Models.Test.StreetFactory;

import java.util.Scanner;

public class MainMenu
{
    private static Street street = StreetFactory.createTestStreet();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Display street info");
            System.out.println("2. Add new building");
            System.out.println("3. Find nearby shops with department");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> street.displayStreetInfo();
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid option, please try again.");
            }
        }
    }
}
