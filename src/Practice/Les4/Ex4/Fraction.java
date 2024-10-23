package Practice.Les4.Ex4;

public class Fraction extends Operation
{
    private int numerator;   // Чисельник
    private int denominator; // Знаменник

    public Fraction(int numerator, int denominator)
    {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator()
    {
        return numerator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    public Fraction reduce()
    {
        int gcd = gcd(numerator, denominator); // НСД
        return new Fraction(numerator / gcd, denominator / gcd);
    }

    private int gcd(int a, int b)
    {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    @Override
    public String toString()
    {
        return numerator + "/" + denominator;
    }
}