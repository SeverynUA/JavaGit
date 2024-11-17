package HomeWork.Les9;

import java.util.Objects;

public class User
{
    private String name;
    private int old; // вік
    private String phone;

    // Конструктор
    public User(String name, int old, String phone) {
        this.name = name;
        this.old = old;
        this.phone = phone;
    }

    // Геттери і сеттери
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Перевизначення методу equals для коректної порівняння об'єктів у HashSet
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return old == user.old && Objects.equals(name, user.name) && Objects.equals(phone, user.phone);
    }

//    @Override
//    public int hashCode()
//    {
//        return Objects.hash(name);
//    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, old, phone);
    }

    // Перевизначення toString для зручного виведення інформації про користувача
    @Override
    public String toString() {
        return "User{name='" + name + "', old=" + old + ", phone='" + phone + "'}";
    }
}
