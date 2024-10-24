package HomeWork.les4.Ex6;

import HomeWork.les4.Ex5.Book;

import java.time.Year;
import java.util.Scanner;

public class Car
{
    private String title;
    private String nameOfBrand;
    private int yearCreated;
    private double engine_capacity;

    public Car()
    {
        Menu();
    }

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

    private void ShowInfo()
    {
        System.out.println("Title: " + title);
        System.out.println("Name of brand: " + nameOfBrand);
        System.out.println("Year created: " + yearCreated);
        System.out.println("Engine capacity: " + engine_capacity);
    }

    public void Menu()
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Створити нову машину");
        System.out.println("0. Вийти");

        int choice = sc.nextInt();;

        switch (choice)
        {
            case 1:

                Car car = СreateCar();
                System.out.println("Нова авто створено.");
                Menu(car);
                break;
            case 2:
                break;
            default: return;
        }
        return;
    }

    public void Menu(Car car)
    {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n=== Меню ===");
            System.out.println("1. Показати інформацію про авто");
            System.out.println("2. Редагувати назву авто");
            System.out.println("3. Редагувати бренд авто");
            System.out.println("4. Редагувати рік випуску");
            System.out.println("5. Редагувати обєм двигуна");
            System.out.println("0. Вийти");

            System.out.print("Оберіть дію: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice)
            {
                case 1:
                    car.ShowInfo();
                    break;
                case 2:
                    System.out.print("Введіть нову назву авто: ");
                    String newTitle = sc.nextLine();
                    car.setTitle(newTitle);
                    break;
                case 3:
                    System.out.print("Введіть нового бренда: ");
                    String nameOfBrand = sc.nextLine();
                    car.setNameOfBrand(nameOfBrand);
                    break;
                case 4:
                    System.out.print("Введіть новий рік випуску: ");
                    int yearCreated = sc.nextInt();
                    car.setYearCreated(yearCreated);
                    break;
                case 5:
                    System.out.print("Введіть новий обєм двигуна: ");
                    double engine_capacity = sc.nextDouble();
                    car.setEngine_capacity(engine_capacity);
                    break;
                case 0:
                    System.out.println("Вихід з меню.");
                    break;
                default:
                    System.out.println("Некоректний вибір. Спробуйте ще раз.");
            }
        }
    }

    private Car СreateCar()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть назву книги: ");
        String title = sc.nextLine();

        System.out.print("Введіть назва бренду: ");
        String nameOfBrand = sc.nextLine();

        System.out.print("Введіть рік випуску: ");
        int yearCreated = sc.nextInt();

        System.out.print("Введіть обєм двигуна: ");
        double engine_capacity = sc.nextDouble();

        return new Car(title,nameOfBrand,yearCreated,engine_capacity);
    }
}
