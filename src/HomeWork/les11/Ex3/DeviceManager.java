package HomeWork.les11.Ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DeviceManager
{
    private List<Device> listDevice;

    public DeviceManager()
    {
        listDevice = new ArrayList<>();
    }

    public DeviceManager(List<Device> listDevice)
    {
        this.listDevice = listDevice;
    }

    public void addDevice(Device device)
    {
        if (device == null) {
            throw new IllegalArgumentException("Device cannot be null.");
        }
        listDevice.add(device);
    }


    public List<Device> getAllDevices() {
        return new ArrayList<>(listDevice);
    }

    public List<Device> getDevicesByType(Type type)
    {
        List<Device> filteredDevices = new ArrayList<>();
        for (Device device : listDevice) {
            if (device.getType() == type) {
                filteredDevices.add(device);
            }
        }
        return filteredDevices;
    }

    public List<Device> getDevicesByColor(Color color)
    {
        List<Device> filteredDevices = new ArrayList<>();
        for (Device device : listDevice) {
            if (device.getColor() == color)
            {
                filteredDevices.add(device);
            }
        }
        return filteredDevices;
    }

    public List<Device> getDevicesByPriceRange(double minPrice, double maxPrice)
    {
        List<Device> filteredDevices = new ArrayList<>();
        for (Device device : listDevice) {
            if (device.getPrice() >= minPrice && device.getPrice() <= maxPrice)
            {
                filteredDevices.add(device);
            }
        }
        return filteredDevices;
    }

    public List<Device> getDevicesByYearRange(double minYear, double maxYear)
    {
        List<Device> filteredDevices = new ArrayList<>();
        for (Device device : listDevice) {
            if (device.getYearOfPublish() >= minYear && device.getYearOfPublish() <= maxYear)
            {
                filteredDevices.add(device);
            }
        }
        return filteredDevices;
    }

    public List<Device> getDevicesMoreExpansive(double price)
    {
        List<Device> filteredDevices = new ArrayList<>();
        for (Device device : listDevice) {
            if (device.getPrice() > price)
            {
                filteredDevices.add(device);
            }
        }
        return filteredDevices;
    }
}
