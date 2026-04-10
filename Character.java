public class Character {
    private String name;
    private int attackPower;
    private boolean isAlive;
    protected int health;

    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.isAlive = true;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            health = 0;
            isAlive = false;
        }
    }

    public void attack(Character target) {
        target.takeDamage(attackPower);
    }

    public void displayStatus() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Alive: " + isAlive);
    }
}