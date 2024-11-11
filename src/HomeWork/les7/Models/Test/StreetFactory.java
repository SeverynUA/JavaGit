package HomeWork.les7.Models.Test;

import HomeWork.les7.Models.Shop.DepartmentType;
import HomeWork.les7.Models.Hospital.Hospital;
import HomeWork.les7.Models.Hospital.HospitalType;
import HomeWork.les7.Models.House.House;
import HomeWork.les7.Models.House.HouseType;
import HomeWork.les7.Models.School.School;
import HomeWork.les7.Models.School.SchoolType;
import HomeWork.les7.Models.Shop.Shop;
import HomeWork.les7.Models.Shop.ShopType;
import HomeWork.les7.Models.Street;

import java.util.Arrays;

public class StreetFactory
{
    public static Street createTestStreet() {
        Street street = new Street();
        street.addBuilding(new House("101", HouseType.APARTMENT, 50));
        street.addBuilding(new Shop("102", ShopType.SUPERMARKET, Arrays.asList(DepartmentType.GROCERIES, DepartmentType.BAKERY)));
        street.addBuilding(new Hospital("103", HospitalType.GENERAL, 100));
        street.addBuilding(new School("104", SchoolType.LYCEUM));

        return street;
    }
}