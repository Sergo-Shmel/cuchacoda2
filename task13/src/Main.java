//Генерация уникальных идентификаторов
//Создайте класс UniqueID, который генерирует уникальные идентификаторы для объектов
//каждого созданного класса. Реализуйте этот функционал через статическое поле и метод.
public class Main {
    public static void main(String[] args) {
        Player player = new Player("Lebron James",103);
        Car car = new Car("Mercedes","Red");
        Player player2 = new Player("Bella Brown",90);
        Car car2= new Car("BMW","Blue");

        System.out.println(player);
        System.out.println(player2);
        System.out.println(car);
        System.out.println(car2);
    }
}