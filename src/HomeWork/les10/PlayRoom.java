package HomeWork.les10;

import java.util.Arrays;
import java.util.Comparator;

public class PlayRoom
{
    public static void main(String[] args)
    {
        Game.GameDisk[] physicalGames = new Game.GameDisk[]{
                Game.GameDisk.getDisk("The Witcher 3", Game.Genre.RPG, "Epic RPG with stunning visuals"),
                Game.GameDisk.getDisk("FIFA 23", Game.Genre.SPORT, "Latest football simulation game"),
                Game.GameDisk.getDisk("Gran Turismo 7", Game.Genre.RACE, "High-performance racing game"),
                Game.GameDisk.getDisk("God of War", Game.Genre.ACTION, "Action-packed mythology adventure")
        };

        Game.VirtualGame[] virtualGames = new Game.VirtualGame[]{
                Game.VirtualGame.getVirtualGame("Cyberpunk 2077", Game.Genre.RPG),
                Game.VirtualGame.getVirtualGame("Fortnite", Game.Genre.ACTION),
                Game.VirtualGame.getVirtualGame("Forza Horizon 5", Game.Genre.RACE),
                Game.VirtualGame.getVirtualGame("Minecraft", Game.Genre.ADVENTURE)
        };
        virtualGames[0].setRating(4);
        virtualGames[1].setRating(5);
        virtualGames[2].setRating(2);
        virtualGames[3].setRating(1);

        // Сортуємо масив з віртуальними іграми по рейтинг
        Arrays.sort(virtualGames, (game1, game2) -> Integer.compare(game2.getRating(), game1.getRating()));

        // Сортуємо масив з фізичними іграми по жанру
        Arrays.sort(physicalGames, (game1, game2) -> game1.getData().getGenre().compareTo(game2.getData().getGenre()));

        System.out.println("Virtual Games sorted by rating:");
        for (Game.VirtualGame virtualGame : virtualGames) {
            System.out.println(virtualGame.getData().getName() + " - Rating: " + virtualGame.getRating());
        }

        System.out.println("\nPhysical Games sorted by genre:");
        for (Game.GameDisk physicalGame : physicalGames) {
            System.out.println(physicalGame.getData().getName() + " - Genre: " + physicalGame.getData().getGenre());
        }
    }
}
