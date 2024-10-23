package HomeWork.les4.Ex6;

import java.time.Year;

public class Car
{
    private String title;
    private String nameOfBrand;
    private int yearCreated;
    private double engine_capacity;

    public Car(String title, String nameOfBrand, int yearCreated, double engine_capacity)
    {
        this.title = title;
        this.nameOfBrand = nameOfBrand;
        setYearCreated(yearCreated);
        if (engine_capacity > 0)
        {
            this.engine_capacity = engine_capacity;
        } else {
            throw new IllegalArgumentException("Кількість обєм має бути більше 0.");
        }
    }

    public void setYearCreated(int yearCreated)
    {
        int currentYear = Year.now().getValue();  // Поточний рік

        // Перевіряємо, чи рік у допустимому діапазоні
        if (yearCreated >= 1900 && yearCreated <= currentYear)
        {
            this.yearCreated = yearCreated;
        } else {
            throw new IllegalArgumentException("Некоректний рік випуску: " + yearCreated);
        }
    }

    public int getYearCreated()
    {
        return yearCreated;
    }

    public String getTitle() {
        return title;
    }

    public void setNameOfBrand(String nameOfBrand)
    {
        if (nameOfBrand != null && !nameOfBrand.isEmpty()) {
            this.nameOfBrand = nameOfBrand;
        }
    }

    public String getNameOfBrand() {
        return nameOfBrand;
    }

    public void setTitle(String title)
    {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        }
    }

    public void setEngine_capacity(double engine_capacity)
    {
        if (engine_capacity > 0)
        {
            this.engine_capacity = engine_capacity;
        }
    }

    public double getEngine_capacity()
    {
        return engine_capacity;
    }


    public void ShowInfo()
    {
        System.out.println("Title: " + title);
        System.out.println("Name of brand: " + nameOfBrand);
        System.out.println("Year created: " + yearCreated);
        System.out.println("Engine capacity: " + engine_capacity);
    }
}
