//Создание игры с использованием ООП
//Реализуйте классы для небольшой текстовой игры, такие как Player, Enemy, Weapon,
// с полями и методами, описывающими их поведение.
public class Main {
    public static void main(String[] args) {
        Weapon sword = new Weapon("Меч", 10);
        Weapon bow = new Weapon("Лук", 8);

        Player player = new Player("Герой", 50, sword);
        Enemy enemy = new Enemy("Злодей", 40, bow);

        System.out.println("Игрок: " + player);
        System.out.println("Враг: " + enemy);

        while (player.isAlive() && enemy.isAlive()) {
            player.attack(enemy);
            if (enemy.isAlive()) {
                enemy.attack(player);
            }
        }

        if (player.isAlive()) {
            System.out.println("Игрок " + player.getName() + " победил!");
        } else {
            System.out.println("Враг " + enemy.getName() + " победил!");
        }
    }
}