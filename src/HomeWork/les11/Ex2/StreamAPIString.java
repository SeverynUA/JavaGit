package HomeWork.les11.Ex2;

import HomeWork.les11.Ex1.StreamAPIInt;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamAPIString {
    public static void main(String[] arg) {
        List<String> listOfProducts = List.of(
                "Milk", "Cheese", "Bread", "Sugar", "Meat", "Mushroom",
                "Eggs", "Butter", "Carrots", "Tomatoes", "Potatoes", "Onions",
                "Garlic", "Apples", "Bananas", "Cheese", "Peaches", "Grapes",
                "Rice", "Pasta", "Flour", "Oil", "Salt", "Pepper",
                "Chicken", "Fish", "Cheese", "Cucumber", "Spinach", "Cabbage"
        );

        System.out.println("Показать все продукты: " + listOfProducts);

        List<String> fifeSymbols = listOfProducts.stream()
                .filter(StreamAPIString::IsFifeSymbols) // Виклик методу isEven
                .collect(Collectors.toList());

        System.out.println("Показать все продукты с названием меньше пяти символов: " + fifeSymbols);

        CountOfEl_inList(listOfProducts);
        NewList_setLetter(listOfProducts);
        ShowMilkCategory(listOfProducts);

    }

    private static boolean IsFifeSymbols(String el) {
        return el.getBytes(StandardCharsets.UTF_8).length < 5;
    }

    private static void CountOfEl_inList(List<String> list) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть продукт на англ: ");
        String userInput = scanner.nextLine();

        List<String> fifeSymbols = list.stream()
                .filter(n -> n.equals(userInput)) // Виклик методу isEven
                .collect(Collectors.toList());

        System.out.println("Повнторяється: " + fifeSymbols.size());
    }

    private static void NewList_setLetter(List<String> list) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть літеру на англ: ");
        String userInput = scanner.nextLine();

        List<String> filteredList = list.stream()
                .filter(n -> n.startsWith(userInput)) // Перевірка, чи рядок починається на "Ф"
                .collect(Collectors.toList());

        System.out.println(" которые начинаются на заданную букву: " + filteredList);
    }

    private static void ShowMilkCategory(List<String> list)
    {
        List<String> filteredList = list.stream()
                .filter(StreamAPIString::CheckEl_MilkCategory) // Перевірка, чи рядок починається на "Ф"
                .collect(Collectors.toList());
        System.out.println("Показать все продукты из категории «Молоко>: " + filteredList);
    }

    private static boolean CheckEl_MilkCategory(String s)
    {
        List<String> milkCategory = List.of("Milk","Butter","Cheese");

        for (String el : milkCategory)
        {
            if(el.equals(s)){return true;}
        }
        return false;
    }
}