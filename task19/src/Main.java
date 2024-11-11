//Наследование: Электроника
//Создайте класс Device с полем brand и методами turnOn() и turnOff().
// Реализуйте классы Smartphone и Laptop, которые наследуют от Device и
// добавляют уникальные методы, например, takePhoto() для смартфона.
public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Apple");
        Laptop laptop = new Laptop("Dell");

        smartphone.turnOn();
        laptop.turnOn();

        smartphone.takePhoto();
        laptop.openBrowser();

        smartphone.turnOff();
        laptop.turnOff();
    }
}