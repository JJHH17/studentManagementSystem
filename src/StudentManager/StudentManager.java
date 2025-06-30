package StudentManager;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> studentList;
    private int studentID = 0;

    public StudentManager() {
        this.studentList = new ArrayList<>();
    }

    public void addStudent(String firstName, String lastName, int age) {
        this.studentList.add(new Student(firstName, lastName, age, ++this.studentID));
    }

    public void removeStudent(int id) {
        boolean found = false;

        for (Student student : this.studentList) {
            if (student.getID() == id) {
                found = true;
                this.studentList.remove(student);
                System.out.println("Student ID: " + id + " was removed.");
                break;
            }
        }

        if (!found) {
            System.out.println("Student ID: " + id + " not found.");
        }
    }

    public void removeStudent(String firstName, String lastName) {
        boolean found = false;

        for (Student student : this.studentList) {
            if (student.getName().equalsIgnoreCase(firstName + " " + lastName)) {
                found = true;
                this.studentList.remove(student);
                break;
            }
        }

        if (!found) {
            System.out.println("Student name: " + firstName + " " + lastName + " not found.");
        }
    }

    public void printStudents() {
        for (Student student : this.studentList) {
            System.out.println(student);
        }
    }

    public String printStudentsByAge(int age) {
        return null;
    }

    public String printStudentsByAgeRange(int lower, int upper) {
        return null;
    }
}
