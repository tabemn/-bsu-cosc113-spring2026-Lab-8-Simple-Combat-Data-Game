public class GameManager {
  public static void main(String[] args) {
    Character player = new Character("Hero", 100, 20);
    Character enemy1 = new Character("Goblin", 50, 10);
    Character enemy2 = new Character("Orc", 80, 15);
    Potion healingPotion = new Potion("Healing Potion", 30);
    player.displayStatus();
    enemy1.displayStatus();
    enemy2.displayStatus();
    while (player.isAlive() && (enemy1.isAlive() || enemy2.isAlive())) {
      if (enemy1.isAlive()) {
        enemy1.attack(player);
      }
      if (enemy2.isAlive()) {
        enemy2.attack(player);
      }
      if (player.isAlive()) {
        if (enemy1.isAlive()) {
          player.attack(enemy1);
        } else if (enemy2.isAlive()) {
          player.attack(enemy2);
        }
        if (player.getHealth() < 50) {
          healingPotion.use(player);
        }
      }
      player.displayStatus();
      enemy1.displayStatus();
      enemy2.displayStatus();
    }
    if (player.isAlive()) {
      System.out.println("Hero wins!");
    } else {
      System.out.println("Hero defeated!");
    }
  }
}