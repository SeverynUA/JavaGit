package HomeWork.les6;

public class WrapperTest
{
    public static void main(String[] args)
    {
        // Ex 2.1
        Integer i1 = 10;                       // Автоупаковка
        Integer i2 = Integer.valueOf(10);      // Метод valueOf
        //Integer i3 = new Integer(10);
        Integer i4 = Integer.parseInt("10");   // Парсинг із рядка

        Double d1 = 10.5;
        Double d2 = Double.valueOf(10.5);
        //Double d3 = new Double(10.5);
        Double d4 = Double.parseDouble("10.5");

        Boolean b1 = true;
        Boolean b2 = Boolean.valueOf(true);
        //Boolean b3 = new Boolean(true);
        Boolean b4 = Boolean.parseBoolean("true");

        Character c1 = 'A';
        Character c2 = Character.valueOf('A');
        //Character c3 = new Character('A');
        Character c4 = Character.valueOf("A".charAt(0));

        // Ex 3.2 - Примітиви з Double
        Double doubleValue = 123.45;
        byte byteValue = doubleValue.byteValue();
        short shortValue = doubleValue.shortValue();
        int intValue = doubleValue.intValue();
        float floatValue = doubleValue.floatValue();
        long longValue = doubleValue.longValue();

        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Int: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Long: " + longValue);

        // Ex 4 - Перевірка NaN і Infinity
        Double nonZeroValue = 10.0;
        Double zeroValue = 0.0;

        Double nanValue = nonZeroValue / zeroValue;   // Створення NaN
        Double infinityValue = zeroValue / zeroValue; // Створення Infinity

        System.out.println("nanValue: " + nanValue);
        System.out.println("infinityValue: " + infinityValue);

        if (nanValue.isNaN()) {
            System.out.println("Переменная nanValue = NaN");
        } else if (nanValue.isInfinite()) {
            System.out.println("Переменная nanValue = Infinity");
        }

        if (infinityValue.isNaN()) {
            System.out.println("Переменная infinityValue = NaN");
        } else if (infinityValue.isInfinite()) {
            System.out.println("Переменная infinityValue = Infinity");
        }

        // Ex 5 - Сравнение Long
        Long long1 = 120L;
        Long long2 = 120L;
        System.out.println("Сравнение long1 и long2 (значение 120): " + (long1 == long2));

        long1 = 1200L;
        long2 = 1200L;
        System.out.println("Сравнение long1 и long2 (значение 1200): " + (long1 == long2));
    }
}

