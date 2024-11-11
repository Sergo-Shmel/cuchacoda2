//4. Абстрактный класс "Транспорт"
//Создайте абстрактный класс Transport с абстрактным методом move().
// Реализуйте классы Car и Bike, которые наследуются от Transport и реализуют метод move().
public class Main {
    public static void main(String[] args) {
        Transport[] transports = new Transport[2];
        transports[0] = new Car();
        transports[1] = new Bike();

        for (Transport transport : transports) {
            transport.move();
        }
    }
}