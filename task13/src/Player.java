public class Player {
    private int id;
    private String name;
    private int score;


    public Player(String name, int score) {
        this.id = UniqueID.generateId();
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "ID игрока: " + id + "\n Имя игрока: " + name + "\n Очки игрока: " + score;
    }
}
