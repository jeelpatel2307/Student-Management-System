import java.util.HashMap;
import java.util.Map;

class Student {
    private int id;
    private String name;
    private int age;
    private String course;

    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }
}

class StudentManagementSystem {
    private Map<Integer, Student> students;

    public StudentManagementSystem() {
        students = new HashMap<>();
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public Student getStudent(int id) {
        return students.get(id);
    }

    public void removeStudent(int id) {
        students.remove(id);
    }

    public void displayAllStudents() {
        for (Map.Entry<Integer, Student> entry : students.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();

        // Add students
        sms.addStudent(new Student(1, "John Doe", 20, "Computer Science"));
        sms.addStudent(new Student(2, "Jane Smith", 21, "Mathematics"));
        sms.addStudent(new Student(3, "Alice Johnson", 19, "Physics"));

        // Display all students
        sms.displayAllStudents();

        // Retrieve and display a specific student
        System.out.println("\nRetrieving student with ID 2:");
        System.out.println(sms.getStudent(2));

        // Remove a student
        sms.removeStudent(1);

        // Display all students after removal
        System.out.println("\nStudents after removal:");
        sms.displayAllStudents();
    }
}
