//1. Класс "Человек"
//Создайте класс Person с полями name, age, gender.
// Реализуйте методы для вывода информации о человеке и увеличения его возраста.
// Добавьте метод для изменения имени.
public class Person {
   private String name;
   private int age;
   private String gender;

   public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void Info(){
       System.out.println("Name: " + name);
       System.out.println("Age: " + age);
       System.out.println("Gender: " + gender);
    }

    public void Аge_increase(){
       age++;
    }

    public void Rename (String new_name){
        this.name = new_name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
       return age;
    }

    public String getGender() {
        return gender;
    }
}