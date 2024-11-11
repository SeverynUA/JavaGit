package HomeWork.les7.Models;

public abstract class Building {
    private String address;
    private TypeBuilding type;

    public Building(String address, TypeBuilding type) {
        this.address = address;
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public TypeBuilding getType() {
        return type;
    }

    public abstract void initializeFromString(String data);

    public abstract void displayInfo();
}