import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class University {
    private List<Student> students;

    public University() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> sortStudentsByName() {
        List<Student> sortedStudents = new ArrayList<>(students);
        Collections.sort(sortedStudents);
        return sortedStudents;
    }

    public List<Student> filterStudentsByGrade(double minGrade) {
        return students.stream()
                .filter(student -> student.getGrade() >= minGrade)
                .collect(Collectors.toList());
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
