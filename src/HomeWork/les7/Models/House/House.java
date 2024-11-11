package HomeWork.les7.Models.House;

import HomeWork.les7.Models.Building;
import HomeWork.les7.Models.TypeBuilding;

public class House extends Building
{
    private HouseType houseType;
    private int numberOfResidents;

    public House(String address, HouseType houseType, int numberOfResidents)
    {
        super(address, TypeBuilding.HOUSE);
        this.houseType = houseType;
        this.numberOfResidents = numberOfResidents;
    }

    public HouseType getHouseType()
    {
        return houseType;
    }

    @Override
    public void initializeFromString(String data) {
        String[] parts = data.split(",");
        this.houseType = HouseType.valueOf(parts[0].trim());
        this.numberOfResidents = Integer.parseInt(parts[1].trim());
    }

    @Override
    public void displayInfo() {
        System.out.println("House Address: " + getAddress() + ", Type: " + houseType + ", Residents: " + numberOfResidents);
    }
}
