//Счетчик объектов
//Создайте класс Counter, который хранит количество созданных объектов данного класса.
// Реализуйте статическое поле для учета количества объектов и метод
// для его увеличения при каждом создании объекта.
public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        System.out.println("Количество созданных объектов: " + Counter.getCount());
    }
}