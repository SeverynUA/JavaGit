package HomeWork.les7.Models.Shop;

import HomeWork.les7.Models.Building;
import HomeWork.les7.Models.TypeBuilding;

import java.util.ArrayList;
import java.util.List;

public class Shop extends Building
{
    private ShopType type;
    private List<DepartmentType> departments;

    public Shop(String address, ShopType type, List<DepartmentType> departments)
    {
        super(address, TypeBuilding.SHOP);
        this.type = type;
        this.departments = departments;
    }

    public ShopType getShopType()
    {
        return type;
    }

    public List<DepartmentType> getDepartments()
    {
        return departments;
    }

    @Override
    public void initializeFromString(String data)
    {
        String[] parts = data.split(";");

        if (parts.length == 3)
        {
            setAddress(parts[0]);

            this.type = ShopType.valueOf(parts[1].toUpperCase());

            String[] departmentNames = parts[2].split(",");
            this.departments = new ArrayList<>();
            for (String department : departmentNames)
            {
                try {
                    this.departments.add(DepartmentType.valueOf(department.toUpperCase()));
                } catch (IllegalArgumentException e)
                {
                    System.out.println("Invalid department type: " + department);
                }
            }
        } else {
            System.out.println("Invalid data format.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Shop Address: " + getAddress() + ", Type: " + type + ", Departments: " + departments);
    }
}
