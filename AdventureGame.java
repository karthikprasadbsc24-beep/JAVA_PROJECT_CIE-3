import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        System.out.println("=== Welcome to the Adventure Game ===");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your player name: ");
        String playerName = input.nextLine();

        Player player = new Player(playerName);
        player.selectChar();
        player.printInfo();

        System.out.println("=== Game Started ===");
        input.close();
    }
}
