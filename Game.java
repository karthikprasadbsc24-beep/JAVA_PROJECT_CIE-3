import java.util.Scanner;

public class Game {

    private Player player;
    private Scanner input = new Scanner(System.in);

    // Entry point
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }

    // Start the game
    public void start() {
        printHeader();

        System.out.print("Enter your player name: ");
        String playerName = input.nextLine();

        // Create and set up the player
        player = new Player(playerName);
        player.selectChar();
        player.printInfo();

        System.out.println("\n=== Game Started ===");
        showMainMenu();
    }

    // Print the welcome header
    private void printHeader() {
        System.out.println("===============================================");
        System.out.println("        WELCOME TO THE ADVENTURE GAME!");
        System.out.println("===============================================");
    }

    // Display the main menu
    private void showMainMenu() {
        boolean running = true;

        while (running) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. View Player Info");
            System.out.println("2. Explore");
            System.out.println("3. Exit Game");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    player.printInfo();
                    break;
                case 2:
                    explore();
                    break;
                case 3:
                    System.out.println("\nThank you for playing, " + player.getName() + "!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please select again.");
            }
        }
    }

    // Simulated exploration feature
    private void explore() {
        System.out.println("\nYou venture into the dark forest...");
        System.out.println("You found a small chest and earned 10 gold!");
        System.out.println("Exploration complete! Returning to main menu...");
    }
}
