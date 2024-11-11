public class Car {
    private int id;
    private String name;
    private String color;

    public Car(String name, String color) {
        this.id = UniqueID.generateId();
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "ID авто: " + id + "\n Название: " + name + "\n Цвет: " + color;
    }
}
