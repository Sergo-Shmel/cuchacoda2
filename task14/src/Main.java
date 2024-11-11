// Класс "Точка" и "Прямоугольник"
//Создайте класс Point с координатами x и y. Реализуйте класс Rectangle,
// который содержит две точки (левая верхняя и правая нижняя).
// Реализуйте метод для вычисления площади прямоугольника.
public class Main {
    public static void main(String[] args) {
        Point topLeft = new Point(1, 5);
        Point bottomRight = new Point(6, 2);

        Rectangle rectangle = new Rectangle(topLeft,bottomRight);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
    }
}