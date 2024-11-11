package HomeWork.les7.Models.Hospital;

import HomeWork.les7.Models.Building;
import HomeWork.les7.Models.TypeBuilding;

public class Hospital extends Building
{
    private HospitalType type;
    private int numberOfBeds;

    public Hospital(String address, HospitalType type, int numberOfBeds)
    {
        super(address, TypeBuilding.HOSPITAL);
        this.type = type;
        this.numberOfBeds = numberOfBeds;
    }

    @Override
    public void initializeFromString(String data)
    {

        String[] parts = data.split(",");
        this.type = HospitalType.valueOf(parts[0].trim());
        this.numberOfBeds = Integer.parseInt(parts[1].trim());
    }

    @Override
    public void displayInfo() {
        System.out.println("Hospital Address: " + getAddress() + ", Type: " + type + ", Beds: " + numberOfBeds);
    }
}
