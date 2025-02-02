public class Student implements Comparable<Student>{
    private String name;
    private String group;
    private double grade;

    public Student(String name, String group, double grade) {
        this.name = name;
        this.group = group;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Студент{" +
                "имя='" + name + '\'' +
                ", группа='" + group + '\'' +
                ", оценка=" + grade +
                '}';
    }


    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }
}
