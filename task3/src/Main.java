//3. Полиморфизм: Животные
//Создайте интерфейс Animal с методом makeSound().
// Реализуйте классы Dog, Cat, и Cow, которые реализуют этот интерфейс.
// Продемонстрируйте полиморфизм на примере массива животных.
public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Cow();

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}