//Наследование: Животные и их движения
//Создайте класс Animal с методом move().
// Реализуйте классы Fish, Bird и Dog, которые наследуют Animal и переопределяют метод move()
// (рыба плавает, птица летает, собака бегает).
public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Fish();
        animals[1] = new Bird();
        animals[2] = new Dog();

        for (Animal animal : animals) {
            animal.move();
        }

    }
}