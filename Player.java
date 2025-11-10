import java.util.Scanner;

public class Player {
    private String name;
    private GameCharacter character;
    private Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar() {
        System.out.println("\nSelect your character:");
        System.out.println("1 - Samurai (Damage: 5, Health: 21, Money: 15)");
        System.out.println("2 - Archer  (Damage: 7, Health: 18, Money: 20)");
        System.out.println("3 - Knight  (Damage: 8, Health: 24, Money: 5)");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                character = new Samurai();
                break;
            case 2:
                character = new Archer();
                break;
            case 3:
                character = new Chevalier();
                break;
            default:
                System.out.println("Invalid choice! Defaulting to Samurai.");
                character = new Samurai();
        }

        System.out.println("\nYou selected: " + character.getName());
    }

    public void printInfo() {
        System.out.println("\n=== Player Information ===");
        System.out.println("Player Name: " + name);
        character.printStats();
        System.out.println("Weapon: " + inventory.getWeapon().getName() +
                           " (Damage +" + inventory.getWeapon().getDamage() + ")");
        System.out.println("Armor: " + inventory.getArmor().getName() +
                           " (Block +" + inventory.getArmor().getBlock() + ")");
    }
}
