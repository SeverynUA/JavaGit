package HomeWork.Les2;

import java.util.*;

public class HomeWork_1
{
    public HomeWork_1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a ex: ");
        int ex = sc.nextInt();

        switch (ex)
        {
            case 1:
                Ex1();
                break;

            case 2:
                Ex2();
                break;

            case 3:
                Ex3();
                break;

            case 4:
                Ex4();
                break;

            case 5:
                Ex5();
                break;

            case 6:
                Ex6();
                break;

            case 7:
                Ex7();
                break;

            case 8:
                Ex8();
                break;

            case 9:
                Ex9();
                break;

            default:
                break;
        }
    }

    private static void Ex1()
    {
        System.out.println("""
                “Your time is limited,
                so don’t waste it
                 living someone else’s life”
                 Steve Jobs""");
    }

    private static void Ex2()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int numb = sc.nextInt();

        System.out.print("Введіть відсоток: ");
        double per = sc.nextDouble() / 100.0;

        System.out.println("Результат: " + (numb * per));
    }

    private static void Ex3()
    {
        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[3];

        for(int i = 0;i<3;i++)
        {
            System.out.print("Введіть ціле " + i + " число: ");
            int numb = sc.nextInt();
            numbers[i] = numb;
        }

        int result = (numbers[0] * 100 + numbers[1] * 10 + numbers[2]);
        System.out.println("Результат: " + result);
    }

    private static  void Ex4()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть ціле 6-значне число: ");
        int number = sc.nextInt();

        int numbers_temp[] = new int[6];

        for (int i = 5; i >= 0; i--)
        {
            numbers_temp[i] = number % 10;
            number /= 10;
        }

        int result = 0;
        int multiplier = 1;
        for (int i = 0; i < 6; i++)
        {
            result += numbers_temp[i] * multiplier;
            multiplier *= 10;
        }

        System.out.println("Результат: " + result);
    }

    private static void Ex5()
    {
        Map<List<Integer>, String> myDictionary = createDictionary_Seasons();

        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int number = sc.nextInt();

        String season = getSeasonByMonth(myDictionary, number);

        if (season != null)
        {
            System.out.println("Число " + number + " відноситься до сезону: " + season);
        } else {
            System.out.println("Число " + number + " не знайдено в жодному сезоні.");
        }
    }


    private static void Ex6()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть кількість метрів: ");
        double meters = sc.nextDouble();


        System.out.print("***Введіть в чого перевести: \n" +
                "1.миль2.\n" +
                "2.дюймів\n" +
                "3.ярдів***\n");
        int choise = sc.nextInt();

        switch(choise) {
            case 1:
                double miles = meters / 1609.34;
                System.out.println(meters + " метрів дорівнює " + miles + " миль");
                break;
            case 2:
                double inches = meters / 0.0254;
                System.out.println(meters + " метрів дорівнює " + inches + " дюймів");
                break;
            case 3:
                double yards = meters / 0.9144;
                System.out.println(meters + " метрів дорівнює " + yards + " ярдів");
                break;
        }
    }

    private static void Ex7()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть діапазон: ");

        int firstNumb = sc.nextInt();
        int secondNumb = sc.nextInt();

        if (firstNumb > secondNumb)
        {
            int temp = firstNumb;
            firstNumb = secondNumb;
            secondNumb = temp;
        }

        while (firstNumb <= secondNumb)
        {
            if (!IsEven(firstNumb))
            {
                System.out.print(firstNumb + " ");
            }
            firstNumb++;
        }
    }

    private static void Ex8()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть діапазон: ");

        int firstNumb = sc.nextInt();
        int secondNumb = sc.nextInt();

        if (firstNumb > secondNumb)
        {
            int temp = firstNumb;
            firstNumb = secondNumb;
            secondNumb = temp;
        }

        while (firstNumb <= secondNumb)
        {
            createTable(firstNumb);

            firstNumb++;
        }
    }

    private static void Ex9()
    {
        int size = 10;
        int[] array = new int[size];

        Random random = new Random();

        for (int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(201) - 100;
        }

        // Виводимо масив
        System.out.println("Масив випадкових чисел від 0 до 100:");
        for (int num : array)
        {
            System.out.print(num + " ");
        }

        System.out.print("\n");

        int minus = 0;
        int plus = 0;
        int count_zero = 0;

        for (int num : array)
        {
           if(IsMinus(num))
           {
               minus++;
           }

            if(IsPlus(num))
            {
                plus++;
            }

            count_zero+=countZeros(num);
        }

        System.out.println("Відємних " + minus + '\n' + "Позитвних " + plus + '\n' + "Нулів " + count_zero);
    }

    private static boolean IsMinus (int numb)
    {
        return numb < 0;
    }

    private static boolean IsPlus (int numb)
    {
        return numb >= 0;
    }

    public static int countZeros(long number)
    {
        String numberStr = Long.toString(number);
        int count = 0;

        for (char ch : numberStr.toCharArray()) {
            if (ch == '0') {
                count++;
            }
        }

        return count;
    }

    private static void createTable(int numb)
    {
        System.out.print("\n");
        for(int i = 1;i<=10;i++)
        {
            System.out.print(numb + " * " + i + " = " + (numb*i) + "\n");
        }
    }

    private static boolean IsEven (int numb)
    {
        return numb % 2 == 0;
    }

    private static Map<List<Integer>, String> createDictionary_Seasons()
    {
        Map<List<Integer>, String> dictionary = new HashMap<>() {{
            put(Arrays.asList(1, 2, 12), "Winter");
            put(Arrays.asList(3, 4, 5), "Spring");
            put(Arrays.asList(6, 7, 8), "Summer");
            put(Arrays.asList(9, 10, 11), "Autumn");
        }};
        return dictionary;
    }

    private static String getSeasonByMonth(Map<List<Integer>, String> dictionary, int number)
    {
        for (Map.Entry<List<Integer>, String> entry : dictionary.entrySet())
        {
            if (entry.getKey().contains(number))
            {
                return entry.getValue();
            }
        }
        return null;
    }
}