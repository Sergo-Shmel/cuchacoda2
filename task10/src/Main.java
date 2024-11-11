import java.util.List;

//Работа с коллекциями: Университет
//Создайте класс Student с полями name, group, grade.
// Создайте класс University, который содержит список студентов и методы для добавления студентов,
// сортировки по имени и фильтрации по успеваемости.

public class Main {
    public static void main(String[] args) {
        University university = new University();

        university.addStudent(new Student("Иван", "Группа 1", 4.5));
        university.addStudent(new Student("Мария", "Группа 2", 5.0));
        university.addStudent(new Student("Петр", "Группа 1", 3.8));
        university.addStudent(new Student("Анна", "Группа 3", 4.2));

        System.out.println("Все студенты:");
        university.displayAllStudents();

        System.out.println("\nСтуденты, отсортированные по имени:");
        List<Student> sortedStudents = university.sortStudentsByName();
        for (Student student : sortedStudents) {
            System.out.println(student);
        }

        System.out.println("\nСтуденты с оценкой 4.0 и выше:");
        List<Student> filteredStudents = university.filterStudentsByGrade(4.0);
        for (Student student : filteredStudents) {
            System.out.println(student);
        }
    }
}