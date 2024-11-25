package HomeWork.les11.Ex1;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Stream.generate;

public class StreamAPIInt
{
    public static void main(String[] args)
    {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        int size = 100;

        for (int i = 0; i < size; i++)
        {
            numbers.add(random.nextInt(2001) - 1000); // Числа від -1000 до 1000
        }

        List<Integer> evenNumbers = numbers.stream()
                .filter(StreamAPIInt::isEven)
                .collect(Collectors.toList());

        System.out.println("Парне " + evenNumbers);
        System.out.println();

        List<Integer> No_evenNumbers = numbers.stream()
                .filter(StreamAPIInt::IsNoEven)
                .collect(Collectors.toList());

        System.out.println("Не парне " + No_evenNumbers);
        System.out.println();

        List<Integer> plusNumbers = numbers.stream()
                .filter(StreamAPIInt::IsPlus)
                .collect(Collectors.toList());

        System.out.println("Додатнє " + plusNumbers);
        System.out.println();

        List<Integer> minusNumbers = numbers.stream()
                .filter(StreamAPIInt::IsMinus)
                .collect(Collectors.toList());

        System.out.println("Відємне " + minusNumbers);
        System.out.println();

        List<Integer> twoNumbers = numbers.stream()
                .filter(StreamAPIInt::IsTwoNumbers)
                .collect(Collectors.toList());

        System.out.println("Двох значне " + twoNumbers);
        System.out.println();

        List<Integer> mirrorNumbers = numbers.stream()
                .filter(StreamAPIInt::isMirror)
                .collect(Collectors.toList());

        System.out.println("Дзеркальне " + mirrorNumbers);
        System.out.println();
    }

    private static boolean isMirror(int num)
    {
        String str = String.valueOf(Math.abs(num));
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    private static boolean isEven(int numb)
    {
        return numb % 2 == 0;
    }

    private static boolean IsNoEven(int numb)
    {
        return numb % 2 != 0;
    }

    private static boolean IsPlus(int numb)
    {
        return numb >= 0;
    }

    private static boolean IsMinus(int numb)
    {
        return numb < 0;
    }

    private static boolean IsTwoNumbers(int numb)
    {
        return(numb >= 10 && numb <= 99);
    }
}
