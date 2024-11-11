//1. Класс "Человек"
//Создайте класс Person с полями name, age, gender.
// Реализуйте методы для вывода информации о человеке и увеличения его возраста.
// Добавьте метод для изменения имени.

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Иван",16,"Мужчина");
        person.Info();

        person.Аge_increase();
        System.out.println(person.getAge());

        person.Rename("Вася");
        System.out.println(person.getName());

        person.Info();
    }
}