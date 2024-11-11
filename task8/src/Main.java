//Площадь фигур
//Создайте абстрактный класс Shape с абстрактным методом getArea().
// Реализуйте классы Circle и Rectangle, которые наследуют от
// Shape и вычисляют площадь круга и прямоугольника соответственно.
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
    }
}