public abstract class GameCharacter {
    private String name;
    private int damage;
    private int health;
    private int money;

    public GameCharacter(String name, int damage, int health, int money) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.money = money;
    }

    // Getters
    public String getName() { return name; }
    public int getDamage() { return damage; }
    public int getHealth() { return health; }
    public int getMoney() { return money; }
}
