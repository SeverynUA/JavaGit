import HomeWork.Les8.ATM;
import HomeWork.Les8.Bank;
import HomeWork.les7.Models.Building;
import HomeWork.les7.Models.School.School;
import HomeWork.les7.Models.School.SchoolType;
import HomeWork.les7.Models.Shop.DepartmentType;
import HomeWork.les7.Models.Shop.Shop;
import HomeWork.les7.Models.Shop.ShopType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Bank bank = new Bank();
        bank.displayAllATMStatus();

        ATM atm1 = bank.getATM(1);

        atm1.withdraw(12345);
        atm1.displayATMStatus();

        bank.displayAllATMAmount();

        atm1.deposit();
        atm1.displayATMStatus();
    }
}
