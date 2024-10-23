package Practice.Les4.Ex4;


public class Operation
{
    // Додавання дробів
    protected Fraction plus(Fraction one_Fraction, Fraction two_Fraction) {
        int newNumerator = one_Fraction.getNumerator() * two_Fraction.getDenominator()
                + two_Fraction.getNumerator() * one_Fraction.getDenominator();
        int newDenominator = one_Fraction.getDenominator() * two_Fraction.getDenominator();
        return new Fraction(newNumerator, newDenominator).reduce();
    }

    // Віднімання дробів
    protected Fraction minus(Fraction one_Fraction, Fraction two_Fraction) {
        int newNumerator = one_Fraction.getNumerator() * two_Fraction.getDenominator()
                - two_Fraction.getNumerator() * one_Fraction.getDenominator();
        int newDenominator = one_Fraction.getDenominator() * two_Fraction.getDenominator();
        return new Fraction(newNumerator, newDenominator).reduce();
    }

    // Множення дробів
    protected Fraction multiply(Fraction one_Fraction, Fraction two_Fraction) {
        int newNumerator = one_Fraction.getNumerator() * two_Fraction.getNumerator();
        int newDenominator = one_Fraction.getDenominator() * two_Fraction.getDenominator();
        return new Fraction(newNumerator, newDenominator).reduce();
    }

    // Ділення дробів
    protected Fraction divide(Fraction one_Fraction, Fraction two_Fraction) {
        int newNumerator = one_Fraction.getNumerator() * two_Fraction.getDenominator();
        int newDenominator = one_Fraction.getDenominator() * two_Fraction.getNumerator();
        if (newDenominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return new Fraction(newNumerator, newDenominator).reduce();
    }
}

