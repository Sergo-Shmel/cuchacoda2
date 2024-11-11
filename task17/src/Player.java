public class Player {
    private String name;
    private int health;
    private Weapon weapon;

    public Player(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public void attack(Enemy enemy) {
        System.out.println(name + " атакует " + enemy.getName() + " с помощью " + weapon.getName() + "!");
        enemy.takeDamage(weapon.getDamage());
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " получает " + damage + " урона. Здоровье: " + health);
    }
    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        return name + " (здоровье: " + health + ", оружие: " + weapon + ")";
    }
}
