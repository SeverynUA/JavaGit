package HomeWork.les12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class WorkWithFiles
{
    public static void main(String[] arg)
    {
        //CheckTwoFiles();
        //CheckMaxRow();
        //NumbersArrayToFile();
        SortArrayFile();

    }

    private static void SortArrayFile()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть шлях першого файлу: ");
        String userInput_file = scanner.nextLine();

        //File file = new File(userInput_file);

        File file = new File("src/HomeWork/les12/test","arrayNumb.txt");
        RandomArrayToFile(file,1,10,10,0,100);

        if (file.exists())
        {
            System.out.println("Файл існує: " + file.getAbsolutePath());
        } else
        {
            System.out.println("Файл не знайдено: " + file.getAbsolutePath());
        }

        try
        {
            String content_file1;

            System.out.println("\nЧитаємо файл за допомогою Files:");
            content_file1 = Files.readString(file.toPath());
            System.out.println(content_file1);

            String[] elements = content_file1.trim().split("\\s+");


            int[]arrayNumb = new int[elements.length];

            for(int i = 0;i<arrayNumb.length;i++)
            {
                arrayNumb[i] = Integer.parseInt(elements[i]);
            }

            int[]arraySortEven = ArraySortByEven(arrayNumb);
            int[]arraySortNotEven = ArraySortByNotEven(arrayNumb);
            int[]arraySortFlip = ArraySortByFlip(arrayNumb);

            String input = Arrays.toString(arrayNumb) + "\n" + Arrays.toString(arraySortEven) + "\n" + Arrays.toString(arraySortNotEven) + "\n" + Arrays.toString(arraySortFlip);

            WriteFile(file,input);
        } catch (IOException e)
        {
            System.out.println("Помилка читання файлу!");
        }

        try {
            String content_file1;

            System.out.println("\nЧитаємо файл за допомогою Files:");
            content_file1 = Files.readString(file.toPath());
            System.out.println(content_file1);
        }catch (IOException e)
        {
            System.out.println("Помилка читання файлу!");
        }
    }

    private static void WriteFile(File file , String input)
    {
        if (file.exists())
        {
            System.out.println("Файл існує: " + file.getAbsolutePath());
        } else
        {
            System.out.println("Файл не знайдено: " + file.getAbsolutePath());
        }


        try (FileWriter writer = new FileWriter(file.getPath()))
        {
            writer.write(input);
            System.out.println("Дані записані у файл " + file.getPath());
        } catch (IOException e)
        {
            System.err.println("Помилка запису у файл: " + e.getMessage());
        }
    }

    private static int[] ArraySortByEven(int[] array)
    {
        if(array != null)
        {
            int[]arraySort = new int[array.length];

           for(int i = 0;i<array.length;i++)
           {
               if (array[i] % 2 == 0)
               {
                   arraySort[i] = array[i];
               }
           }

           return arraySort;
        }

        return null;
    }

    private static int[] ArraySortByNotEven(int[] array)
    {
        if(array != null)
        {
            int[]arraySort = new int[array.length];

            for(int i = 0;i<array.length;i++)
            {
                if (array[i] % 2 != 0)
                {
                    arraySort[i] = array[i];
                }
            }

            return arraySort;
        }

        return null;
    }

    private static int[] ArraySortByFlip(int[] array)
    {
        if (array != null)
        {
            int[] arraySort = new int[array.length];

            int j = 0;
            for (int i = array.length - 1; i >= 0; i--)
            {
                arraySort[j] = array[i];
                j++;
            }
            return arraySort;
        }

        return null;
    }


    private static void CheckTwoFiles()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть шлях першого файлу: ");
        String userInput_file1 = scanner.nextLine();

        System.out.print("Введіть шлях другого файлу: ");
        String userInput_file2 = scanner.nextLine();

        //File file1 = new File(userInput_file1);
        //File file2 = new File(userInput_file2);

        //test
        File file1 = new File("src/HomeWork/les12/test","one.txt");
        File file2 = new File("src/HomeWork/les12/test","second.txt");

        if (file1.exists())
        {
            System.out.println("Файл існує: " + file1.getAbsolutePath());
        } else
        {
            System.out.println("Файл не знайдено: " + file1.getAbsolutePath());
        }

        if (file2.exists())
        {
            System.out.println("Файл існує: " + file2.getAbsolutePath());
        } else
        {
            System.out.println("Файл не знайдено: " + file2.getAbsolutePath());
        }

        try
        {
            String content_file1 , content_file2;

            System.out.println("\nЧитаємо файл за допомогою Files:");
            content_file1 = Files.readString(file1.toPath());
            System.out.println(content_file1);

            System.out.println("\nЧитаємо файл за допомогою Files:");
            content_file2 = Files.readString(file2.toPath());
            System.out.println(content_file2);

            String differences = findUniqueCharacters(content_file1, content_file2);

            System.out.println(differences);

        } catch (IOException e)
        {
            System.out.println("Помилка читання файлу!");
        }
    }

    private static String findUniqueCharacters(String str1, String str2) {
        // Перетворення рядків на множини символів
        Set<Character> set1 = str1.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        Set<Character> set2 = str2.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());

        // Знайти різницю між множинами
        Set<Character> uniqueToSet1 = new HashSet<>(set1);
        uniqueToSet1.removeAll(set2); // Символи, які є лише в str1

        Set<Character> uniqueToSet2 = new HashSet<>(set2);
        uniqueToSet2.removeAll(set1); // Символи, які є лише в str2

        // Об'єднати всі унікальні символи
        uniqueToSet1.addAll(uniqueToSet2);

        // Повернути результат як рядок
        return uniqueToSet1.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    private static void CheckMaxRow()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть шлях файлу: ");
        //File file1 = new File(userInput_file1);

        //test
        File file1 = new File("src/HomeWork/les12/test","one.txt");

        if (file1.exists())
        {
            System.out.println("Файл існує: " + file1.getAbsolutePath());
        } else
        {
            System.out.println("Файл не знайдено: " + file1.getAbsolutePath());
        }

        try
        {
            String content_file1;

            System.out.println("\nЧитаємо файл за допомогою Files:");
            content_file1 = Files.readString(file1.toPath());
            System.out.println(content_file1);

            String[] rows = content_file1.split(" ");

            String resault = SearchMaxRow(rows);

            System.out.println(resault);
        } catch (IOException e)
        {
            System.out.println("Помилка читання файлу!");
        }
    }

    private static String SearchMaxRow(String[] rows)
    {
        int max = 0 , index = 0;
        for(int i = 0;i<rows.length;i++)
        {
            if(rows[i].length() > max)
            {
                index = i;
                max = rows[i].length();
            }
        }
        return "Максимальна довжина рядка: " + max + '\n' + rows[index];
    }

    private static void NumbersArrayToFile()
    {
        File file = new File("src/HomeWork/les12/test","arrayNumb.txt");
        RandomArrayToFile(file,7,5,10,0,100);

        if (file.exists())
        {
            System.out.println("Файл існує: " + file.getAbsolutePath());
        } else
        {
            System.out.println("Файл не знайдено: " + file.getAbsolutePath());
        }

        try
        {
            String content_file1;

            System.out.println("\nЧитаємо файл за допомогою Files:");
            content_file1 = Files.readString(file.toPath());
            System.out.println(content_file1);

            String[] rows = content_file1.split("\n");

            int[]arrayMax = new int[rows.length];
            int[]arrayMin = new int[rows.length];

            for(int i = 0;i<arrayMax.length;i++)
            {
                arrayMax[i] = SearchMaxNumbFromRow(rows[i]);
                arrayMin[i] = SearchMinNumbFromRow(rows[i]);
            }

            for (int i = 0;i<arrayMax.length;i++)
            {
                System.out.println("Рядок " + i + " Максимальне " +  arrayMax[i]);
                System.out.println("Рядок " + i + " Мінімальне " +  arrayMin[i]);
            }

            String fromAllMax = SearchMaxNumbFromArray(arrayMax);
            String fromAllMin = SearchMinNumbFromArray(arrayMin);
            System.out.println(fromAllMax);
            System.out.println(fromAllMin);


        } catch (IOException e)
        {
            System.out.println("Помилка читання файлу!");
        }
    }

    private static int SearchMaxNumbFromRow(String row)
    {
        int max = Integer.MIN_VALUE;;

        if (row != null) {
            String[] elements = row.trim().split("\\s+");

            for (String el : elements) {
                int value = Integer.parseInt(el);
                if (value > max) {
                    max = value;
                }
            }
        }

        return max;
    }

    private static String SearchMaxNumbFromArray(int[] array)
    {
        int max = Integer.MIN_VALUE;
        int index = 0;

        if (array != null)
        {
            for(int i = 0;i<array.length;i++)
            {
                if(array[i] > max)
                {
                    max = array[i];
                    index = i;
                }
            }
        }

        return "Максимальне " + max + " Індекс рядку " +index;
    }

    private static int SearchMinNumbFromRow(String row)
    {
        int min = Integer.MAX_VALUE;;

        if (row != null) {
            String[] elements = row.trim().split("\\s+");

            for (String el : elements) {
                int value = Integer.parseInt(el);
                if (value < min) {
                    min = value;
                }
            }
        }

        return min;
    }

    private static String SearchMinNumbFromArray(int[] array)
    {
        int min = Integer.MAX_VALUE;
        int index = 0;

        if (array != null)
        {
            for(int i = 0;i<array.length;i++)
            {
                if(array[i] < min)
                {
                    min = array[i];
                    index = i;
                }
            }
        }

        return "Мінімальне " + min + " Індекс рядку " +index;
    }

    private static void RandomArrayToFile(File file , int lines , int minEl , int maxEl, int minVal, int maxVal)
    {
        int numLines = lines;       // Кількість рядків
        int minElements = minEl;    // Мінімальна кількість чисел у рядку
        int maxElements = maxEl;    // Максимальна кількість чисел у рядку
        int minValue = minVal;       // Мінімальне значення чисел
        int maxValue = maxVal;     // Максимальне значення чисел

        Random random = new Random();

        try (FileWriter writer = new FileWriter(file.getPath())) {
            for (int i = 0; i < numLines; i++) {
                int numElements = random.nextInt(maxElements - minElements + 1) + minElements;
                StringBuilder line = new StringBuilder();

                for (int j = 0; j < numElements; j++) {
                    int randomNumber = random.nextInt(maxValue - minValue + 1) + minValue;
                    line.append(randomNumber).append(" ");
                }

                writer.write(line.toString().trim() + "\n");
            }
            System.out.println("Дані записані у файл " + file.getPath());
        } catch (IOException e)  {
            System.err.println("Помилка запису у файл: " + e.getMessage());
        }
    }
}
