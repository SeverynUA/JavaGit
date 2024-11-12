package HomeWork.Les8;

public class ATM {
    private int countOf_1;
    private int countOf_2;
    private int countOf_5;
    private int countOf_10;
    private int countOf_20;
    private int countOf_50;
    private int countOf_100;
    private int countOf_200;
    private int countOf_500;

    private final int minWithdrawalAmount;      // Мінімальна сума для видачі
    private final int maxBanknotesForWithdrawal; // Максимальна кількість банкнот для видачі

    public ATM() {
        countOf_1 = 100;
        countOf_2 = 100;
        countOf_5 = 100;
        countOf_10 = 100;
        countOf_20 = 100;
        countOf_50 = 100;
        countOf_100 = 100;
        countOf_200 = 100;
        countOf_500 = 100;

        minWithdrawalAmount = 100;          // Мінімальна сума для видачі 100
        maxBanknotesForWithdrawal = 40;     // Максимум 40 банкнот за один раз
    }

    // Метод для завантаження грошей у банкомат
    public void initializeATM(int countOf_1, int countOf_2, int countOf_5, int countOf_10,
                              int countOf_20, int countOf_50, int countOf_100,
                              int countOf_200, int countOf_500)
    {
        this.countOf_1 = countOf_1;
        this.countOf_2 = countOf_2;
        this.countOf_5 = countOf_5;
        this.countOf_10 = countOf_10;
        this.countOf_20 = countOf_20;
        this.countOf_50 = countOf_50;
        this.countOf_100 = countOf_100;
        this.countOf_200 = countOf_200;
        this.countOf_500 = countOf_500;
    }

    public void depost()
    {

    }

    public boolean withdraw(int amount)
    {
        if (amount < minWithdrawalAmount)
        {
            System.out.println("Помилка: сума менша за мінімальну допустиму для видачі.");
            return false;
        }

        int remainingAmount = amount;
        int totalBanknotes = 0;

        int[] denominations = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] banknotes = {countOf_500, countOf_200, countOf_100, countOf_50, countOf_20, countOf_10, countOf_5, countOf_2, countOf_1};
        int[] dispensedBanknotes = new int[denominations.length];

        for (int i = 0; i < denominations.length; i++)
        {
            if (remainingAmount >= denominations[i])
            {
                dispensedBanknotes[i] = Math.min(remainingAmount / denominations[i], banknotes[i]);
                if (totalBanknotes + dispensedBanknotes[i] > maxBanknotesForWithdrawal)
                {
                    dispensedBanknotes[i] = maxBanknotesForWithdrawal - totalBanknotes;
                }
                remainingAmount -= dispensedBanknotes[i] * denominations[i];
                totalBanknotes += dispensedBanknotes[i];
            }
        }

        // Перевірка, чи вдалося видати повну суму
        if (remainingAmount > 0)
        {
            System.out.println("Помилка: недостатньо банкнот для видачі потрібної суми.");
            return false;
        }

        // Оновлення кількості банкнот у банкоматі після видачі
        countOf_500 -= dispensedBanknotes[0];
        countOf_200 -= dispensedBanknotes[1];
        countOf_100 -= dispensedBanknotes[2];
        countOf_50 -= dispensedBanknotes[3];
        countOf_20 -= dispensedBanknotes[4];
        countOf_10 -= dispensedBanknotes[5];
        countOf_5 -= dispensedBanknotes[6];
        countOf_2 -= dispensedBanknotes[7];
        countOf_1 -= dispensedBanknotes[8];

        System.out.println("Успішно видано " + amount + " грн.");
        return true;
    }

    public void displayATMStatus()
    {
        System.out.println("Баланс банкомата:");
        System.out.println("1 грн: " + countOf_1);
        System.out.println("2 грн: " + countOf_2);
        System.out.println("5 грн: " + countOf_5);
        System.out.println("10 грн: " + countOf_10);
        System.out.println("20 грн: " + countOf_20);
        System.out.println("50 грн: " + countOf_50);
        System.out.println("100 грн: " + countOf_100);
        System.out.println("200 грн: " + countOf_200);
        System.out.println("500 грн: " + countOf_500);
        System.out.println("Мінімальна сума для видачі: " + minWithdrawalAmount);
        System.out.println("Максимальна кількість банкнот для видачі: " + maxBanknotesForWithdrawal);
    }

    public int getATMAmount()
    {
        return (countOf_1*1)+(countOf_2*2)+(countOf_5*5)+(countOf_10*10)+(countOf_20*20)+(countOf_50*50)+(countOf_100*100)+(countOf_200*200)+(countOf_500*500);
    }

    public void displayATMAmount()
    {
        System.out.println("Вся сума банкомата: " +
                (countOf_1 * 1) +
                (countOf_2 * 2) +
                (countOf_5 * 5) +
                (countOf_10 * 10) +
                (countOf_20 * 20) +
                (countOf_50 * 50) +
                (countOf_100 * 100) +
                (countOf_200 * 200) +
                (countOf_500 * 500));
    }
}
