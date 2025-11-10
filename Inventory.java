public class Inventory {
    private Weapon gun;
    private Armor armor;

    public Inventory() {
        this.gun = new Weapon("Fist", 0);
        this.armor = new Armor("Cloth", 0);
    }

    public Weapon getGun() { return gun; }
    public void setGun(Weapon gun) { this.gun = gun; }

    public Armor getArmor() { return armor; }
    public void setArmor(Armor armor) { this.armor = armor; }
}
