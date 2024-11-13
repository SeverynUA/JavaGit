package HomeWork.Les8;

import java.util.ArrayList;
import java.util.List;

public class Bank
{
    private List<ATM> atms;

    public Bank()
    {
        this.atms = new ArrayList<>();
        initializeATMs();
    }

    private void initializeATMs()
    {
        for (int i = 0; i < 5; i++)
        {
            atms.add(new ATM());
        }
    }

    public ATM getATM(int index)
    {
        if (index >= 0 && index < atms.size())
        {
            return atms.get(index);
        } else
        {
            throw new IndexOutOfBoundsException("Невірний індекс банкомата.");
        }
    }

    public void displayAllATMStatus()
    {
        for (int i = 0; i < atms.size(); i++)
        {
            System.out.println("Статус банкомата #" + (i + 1) + ":");
            atms.get(i).displayATMStatus();
        }
    }

    public void displayAllATMAmount()
    {
        int total = 0;
        for (int i = 0; i < atms.size(); i++)
        {
           total += atms.get(i).getATMAmount();
        }
        System.out.println("Статус мережі банкоматів сума " + total);
    }
}
