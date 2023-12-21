import java.util.ArrayList;
import java.util.List;

// Define a generic class for game rentals
class GameRental<T extends Game> {
    private List<T> rentedGames = new ArrayList<>();

    // Rent a game
    public void rentGame(T game) {
        rentedGames.add(game);
        System.out.println(game.getTitle() + " rented successfully!");
    }

    // Return a rented game
    public void returnGame(T game) {
        rentedGames.remove(game);
        System.out.println(game.getTitle() + " returned successfully!");
    }

    // Display the list of rented games
    public void displayRentedGames() {
        System.out.println("Rented Games:");
        for (T game : rentedGames) {
            System.out.println("- " + game.getTitle());
        }
    }
}

// Define a generic interface for games
interface Game {
    String getTitle();
}

// Create a concrete class for PC games
class PCGame implements Game {
    private String title;

    public PCGame(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}

public class Lab_Exercise_6 {
    public static void main(String[] args) {
        // Create a GameRental for PC games
        GameRental<PCGame> pcGameRental = new GameRental<>();

        // Create some PC games
        PCGame game1 = new PCGame("AC1");
        PCGame game2 = new PCGame("AC2");

        // Rent and return PC games
        pcGameRental.rentGame(game1);
        pcGameRental.rentGame(game2);
        pcGameRental.displayRentedGames();

        pcGameRental.returnGame(game1);
        pcGameRental.displayRentedGames();
    }
}
