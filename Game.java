public class Game {
    public static void main(String[] args) {
        System.out.println("=== Welcome to the Adventure Game ===");

        // Create a new player and ask for name
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter your player name: ");
        String playerName = input.nextLine();

        // Create a player object
        Player player = new Player(playerName);

        // Select character
        player.selectChar();

        // Display info about the chosen character
        player.printInfo();

        System.out.println("=== Game Started ===");
    }
}
