package HomeWork.les10;

public class GameConsole
{

    public enum Brand {SONY, MICROSOFT, NINTENDO, OTHER}


    private final Brand brand;
    private final String serial;
    private String model;
    private final Gamepad firstGamepad;
    private final Gamepad secondGamepad;
    private boolean isOn;

    public GameConsole(Brand brand, String serial)
    {
        this.brand = brand;
        this.serial = serial;
        this.isOn = false; // Консоль выключена по умолчанию
        this.firstGamepad = new Gamepad(brand, 1); // Создаем первый джойстик
        this.secondGamepad = new Gamepad(brand, 2); // Создаем второй джойстик
    }

    public Brand getBrand()
    {
        return brand;
    }

    public String getSerial()
    {
        return serial;
    }

    public String getModel()
    {
        return model;
    }

    public Gamepad getFirstGamepad()
    {
        return firstGamepad;
    }

    public Gamepad getSecondGamepad()
    {
        return secondGamepad;
    }

    public boolean isOn()
    {
        return isOn;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setOn(boolean on)
    {
        isOn = on;
    }

    public void powerOn()
    {
        isOn = true;
        System.out.println("Console is now ON.");
    }

    public void powerOff()
    {
        isOn = false;
        System.out.println("Console is now OFF.");
    }

    public class Gamepad
    {
        public enum Color {BLACK, WHITE, RED, BLUE, GREEN}

        private final Brand brand;
        private final String consoleSerial;
        private final int connectedNumber;
        private Color color;
        private double chargeLevel; // Уровень заряда (по умолчанию 100%)
        private boolean isOn;

        public Gamepad(Brand brand, int connectedNumber)
        {
            this.brand = brand;
            this.consoleSerial = GameConsole.this.serial;
            this.connectedNumber = connectedNumber;
            this.chargeLevel = 100.0;
            this.isOn = false; // Джойстик выключен по умолчанию
        }

        public Brand getBrand()
        {
            return brand;
        }

        public String getConsoleSerial()
        {
            return consoleSerial;
        }

        public int getConnectedNumber()
        {
            return connectedNumber;
        }

        public Color getColor()
        {
            return color;
        }

        public double getChargeLevel()
        {
            return chargeLevel;
        }

        public boolean isOn()
        {
            return isOn;
        }

        public void setColor(Color color)
        {
            this.color = color;
        }

        public void setChargeLevel(double chargeLevel) {

            this.chargeLevel = chargeLevel;
        }

        public void setOn(boolean on)
        {
            isOn = on;
        }

        public void powerOn()
        {
            isOn = true;
            System.out.println("Gamepad " + connectedNumber + " is now ON.");
        }

        public void powerOff()
        {
            isOn = false;
            System.out.println("Gamepad " + connectedNumber + " is now OFF.");
        }
    }
}