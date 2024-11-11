package HomeWork.les7.Models;

import HomeWork.les7.Models.Shop.DepartmentType;
import HomeWork.les7.Models.House.House;
import HomeWork.les7.Models.Shop.Shop;

import java.util.ArrayList;
import java.util.List;

public class Street
{
    private List<Building> buildings;

    public Street() {
        this.buildings = new ArrayList<>();
    }

    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public void removeBuilding(Building building) {
        buildings.remove(building);
    }

    public void displayStreetInfo() {
        System.out.println("Buildings on the street:");
        for (Building building : buildings) {
            building.displayInfo();
        }
    }

    public List<Shop> findShopsNearby(House house, int range, DepartmentType department) {
        List<Shop> nearbyShops = new ArrayList<>();
        int houseIndex = buildings.indexOf(house);

        for (int i = Math.max(0, houseIndex - range); i <= Math.min(buildings.size() - 1, houseIndex + range); i++) {
            Building building = buildings.get(i);
            if (building instanceof Shop) {
                Shop shop = (Shop) building;
                if (shop.getDepartments().contains(department)) {
                    nearbyShops.add(shop);
                }
            }
        }
        return nearbyShops;
    }
}
