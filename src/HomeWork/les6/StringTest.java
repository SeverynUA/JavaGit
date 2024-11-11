package HomeWork.les6;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args)
    {
        // Створення різних строк
        // 1) Літерал
        String strLiteral = "Hello World";

        // 2) new
        String strNew = new String("Hello World");

        // 3) Масив символів
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String strFromChars = new String(chars);

        // 4) З байтів
        byte[] bytes = {72, 101, 108, 108, 111}; // ASCII для "Hello"
        String strFromBytes = new String(bytes);

        // 5) За допомогою StringBuilder
        StringBuilder sb = new StringBuilder("Hello World");
        String strFromSB = sb.toString();

        // Робота з строкою "Апельсин,Яблоко,Гранат,Груша"
        String fruits = "Апельсин,Яблоко,Гранат,Груша";

        // Використання методу split
        String[] fruitArray = fruits.split(",");

        // Знаходження найдовшого слова
        String longestFruit = "";
        for (String fruit : fruitArray) {
            if (fruit.length() > longestFruit.length()) {
                longestFruit = fruit;
            }
        }
        System.out.println("Саме довге назва фрукта: " + longestFruit.toLowerCase());

        // Скорочений варіант назви
        for (String fruit : fruitArray) {
            String shortName = fruit.substring(0, 3);
            System.out.println("Скорочена назва фрукта: " + shortName);
        }

        // Робота з строкою "   Я_новая_строка      "
        String spacedString = "   Я_новая_строка      ";

        // Прибирання пробілів на початку та в кінці
        String trimmedString = spacedString.trim();

        // Заміна символів '_' на пробіли
        String finalString = trimmedString.replace('_', ' ');

        System.out.println("Остаточний варіант: " + finalString);

        // Використання Scanner для вводу тексту
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть текст:");
        String userInput = scanner.nextLine();
        System.out.println("Ви ввели: " + userInput);

        // Перевірки
        if (userInput.startsWith("Запуск")) {
            System.out.println("Запускаємо процес");
        }
        if (userInput.endsWith("завершен")) {
            System.out.println("Процес завершено");
        }
        if (userInput.toLowerCase().contains("ошибка")) {
            System.out.println("Произошла ошибка");
        }

        // Використання StringBuilder
        StringBuilder sbAll = new StringBuilder();
        sbAll.append(strLiteral).append("\n")
                .append(strNew).append("\n")
                .append(strFromChars).append("\n")
                .append(strFromBytes).append("\n")
                .append(strFromSB).append("\n")
                .append(longestFruit).append("\n")
                .append(finalString).append("\n")
                .append(userInput).append("\n");

        // Зворотне сортування
        sbAll.reverse();

        // Вивід результату
        System.out.println("Зворотний рядок:\n" + sbAll.toString());

        scanner.close();
    }
}
