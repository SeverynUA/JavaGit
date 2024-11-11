package HomeWork.les7.Models.School;

import HomeWork.les7.Models.Building;
import HomeWork.les7.Models.TypeBuilding;

import java.util.Random;

public class School extends Building
{
    private SchoolType accreditationLevel;
    private int numberOfStudents;

    public School(String address, SchoolType accreditationLevel)
    {
        super(address, TypeBuilding.SCHOOL);  // Додаємо TypeBuilding.SCHOOL
        this.accreditationLevel = accreditationLevel;
        this.numberOfStudents = getRandomStudentCount(accreditationLevel);
    }

    private int getRandomStudentCount(SchoolType accreditationLevel)
    {
        Random random = new Random();
        switch (accreditationLevel) {
            case ELEMENTARY: return random.nextInt(200) + 100; // 100-300 students
            case GYMNASIUM: return random.nextInt(300) + 300; // 300-600 students
            case LYCEUM: return random.nextInt(400) + 600; // 600-1000 students
            default: return 0;
        }
    }

    @Override
    public void initializeFromString(String data) {
        String[] parts = data.split(";");

        if (parts.length == 3) {

            setAddress(parts[0]);

            this.accreditationLevel = SchoolType.valueOf(parts[1].toUpperCase());

            try {
                this.numberOfStudents = Integer.parseInt(parts[2]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number of students.");
            }
        } else {
            System.out.println("Invalid data format.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("School Address: " + getAddress() + ", Accreditation Level: " + accreditationLevel + ", Students: " + numberOfStudents);
    }
}
