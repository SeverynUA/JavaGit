package HomeWork.les11.Ex3;

import java.util.ArrayList;
import java.util.List;

public class Device
{
    private String name;
    private int yearOfPublish;
    private double price;
    private Color color;
    private Type type;

    public Device(String name, int yearOfPublish, double price, Color color, Type type) {
        if (name == null || name.trim().isEmpty())
        {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.name = name;

        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        if (yearOfPublish < 1900 || yearOfPublish > currentYear) {
            throw new IllegalArgumentException("Year of publish must be between 1900 and the current year.");
        }
        this.yearOfPublish = yearOfPublish;

        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.price = price;

        if (color == null) {
            throw new IllegalArgumentException("Color cannot be null.");
        }
        this.color = color;

        if (type == null) {
            throw new IllegalArgumentException("Type cannot be null.");
        }
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public double getPrice() {
        return price;
    }

    public Color getColor() {
        return color;
    }

    public Type getType() {
        return type;
    }


    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Device{name='" + name + "', yearOfPublish=" + yearOfPublish +
                ", price=" + price + ", color=" + color + ", type=" + type + "}\n";
    }

    public static void main(String[] arg)
    {
        List<Device> devices = new ArrayList<>();
        devices.add(new Device("iPhone 13", 2021, 799.99, Color.Black, Type.Mobile));
        devices.add(new Device("MacBook Pro 14", 2021, 2499.99, Color.White, Type.Laptop));
        devices.add(new Device("Samsung Galaxy S21", 2021, 999.99, Color.Blue, Type.Mobile));
        devices.add(new Device("Dell XPS 13", 2021, 1499.99, Color.White, Type.Laptop));
        devices.add(new Device("Apple Watch Series 7", 2021, 399.99, Color.Green, Type.Watch));
        devices.add(new Device("iPad Pro", 2021, 1099.99, Color.Blue, Type.Tablet));
        devices.add(new Device("Google Pixel 6", 2021, 599.99, Color.Red, Type.Mobile));
        devices.add(new Device("Microsoft Surface Laptop 4", 2021, 1699.99, Color.Black, Type.Laptop));
        devices.add(new Device("Samsung Galaxy Tab S7", 2021, 649.99, Color.Yellow, Type.Tablet));
        devices.add(new Device("Huawei Watch GT 3", 2021, 229.99, Color.Black, Type.Watch));

        DeviceManager deviceManager = new DeviceManager(devices);

        System.out.println(deviceManager.getAllDevices());
        System.out.println();
        System.out.println();

        System.out.println(deviceManager.getDevicesByType(Type.Mobile));
        System.out.println();
        System.out.println();

        System.out.println(deviceManager.getDevicesByColor(Color.Black));
        System.out.println();
        System.out.println();

        System.out.println(deviceManager.getDevicesByPriceRange(100,2000));
        System.out.println();
        System.out.println();

        System.out.println(deviceManager.getDevicesMoreExpansive(199.9));
        System.out.println();
        System.out.println();

        System.out.println(deviceManager.getDevicesByYearRange(2000,2021));
        System.out.println();
        System.out.println();
    }
}

