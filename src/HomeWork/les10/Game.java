package HomeWork.les10;

public class Game
{

    // Перечисление для жанра игры
    public enum Genre {
        ACTION, SPORT, RACE, RPG, ADVENTURE
    }

    // Перечисление для типа носителя
    public enum Type {
        VIRTUAL, PHYSICAL
    }

    // Поля класса Game
    private final String name; // Название игры (неизменяемое)
    private final Genre genre; // Жанр игры (неизменяемое)
    private final Type type;   // Тип носителя (неизменяемое)

    // Приватный конструктор
    private Game(String name, Genre genre, Type type) {
        this.name = name;
        this.genre = genre;
        this.type = type;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public Genre getGenre() {
        return genre;
    }

    public Type getType() {
        return type;
    }

    // Вложенный статический класс GameDisk
    public static class GameDisk
    {

        private final String description; // Описание игры (неизменяемое)
        private final Game data;          // Экземпляр Game (неизменяемое)

        // Приватный конструктор
        private GameDisk(String name, Genre genre, String description) {
            this.description = description;
            this.data = new Game(name, genre, Type.PHYSICAL); // Тип PHYSICAL фиксирован
        }

        // Геттеры
        public String getDescription() {
            return description;
        }

        public Game getData()
        {
            return data;
        }

        // Статический метод для создания экземпляра GameDisk
        public static GameDisk getDisk(String name, Genre genre, String description)
        {
            return new GameDisk(name, genre, description);
        }
    }

    public static class VirtualGame
    {
        private int rating;
        private final Game data;

        public VirtualGame(String name, Genre genre)
        {
            this.data = new Game(name,genre,Type.VIRTUAL);
        }

        public int getRating()
        {
            return rating;
        }

        public Game getData()
        {
            return data;
        }

        public void setRating(int rating)
        {
            if (rating < 0 || rating > 5) {
                throw new IllegalArgumentException("Rating must be between 0 and 5");
            }
            this.rating = rating;
        }

        public static VirtualGame getVirtualGame(String name, Genre genre)
        {
            return new VirtualGame(name,genre);
        }
    }
}

