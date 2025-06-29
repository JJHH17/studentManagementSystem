package StudentManager;

import java.util.ArrayList;

public class StudentManager {
    ArrayList<Student> studentList;

    public StudentManager() {
        this.studentList = new ArrayList<>();
    }

    public void addStudent(String firstName, String lastName, int age) {
        this.studentList.add(new Student(firstName, lastName, age));
    }

    public void removeStudent(int id) {
        // Add method to remove student based on ID
    }

    public void removeStudent(String name) {
        // Add method to remove student based on (full) name
    }

    public void printStudents() {
        for (Student student : this.studentList) {
            System.out.println(student);
        }
    }
}
