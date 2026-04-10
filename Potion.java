public class Potion {
    private String name;
    private int healAmount;

    public Potion(String name, int healAmount) {
        this.name = name;
        this.healAmount = healAmount;
    }

    public void use(Character target) {
        target.health += healAmount;
    }
}