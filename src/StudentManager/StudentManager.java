package StudentManager;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> studentList;
    private int highestID;
    private FileManager fileManager;

    public StudentManager(FileManager fileManager) {
        this.fileManager = fileManager;
        this.studentList = fileManager.readFile();
        // Finds the highest ID in the existing student list
        this.highestID = 0;
        for (Student student : this.studentList) {
            if (student.getID() > this.highestID) {
                this.highestID = student.getID();
            }
        }
    }

    public void addStudent(String firstName, String lastName, int age) {
        this.studentList.add(new Student(firstName, lastName, age, ++this.highestID));
        fileManager.writeFile(this.studentList);
    }

    public void removeStudent(int id) {
        boolean found = false;

        for (int i = 0; i < this.studentList.size(); i++) {
            if (this.studentList.get(i).getID() == id) {
                found = true;
                this.studentList.remove(i);
                System.out.println("Student ID: " + id + " removed.");
                fileManager.writeFile(this.studentList);
                break;
            }
        }
        if (!found) {
            System.out.println("Student ID: " + id + " not found.");
        }
    }

    public void removeStudent(String firstName, String lastName) {
        boolean found = false;

        for (int i = 0; i < this.studentList.size(); i++) {
            Student student = this.studentList.get(i);
            if (student.getName().equalsIgnoreCase(firstName + " " + lastName)) {
                found = true;
                studentList.remove(i);
                System.out.println("Student: " + firstName + " " + lastName + " was removed.");
                fileManager.writeFile(this.studentList);
                break;
            }
        }
        if (!found) {
            System.out.println("Student: " + firstName + " " + lastName + " was not found.");
        }
    }

    public void printStudents() {
        for (Student student : this.studentList) {
            System.out.println(student);
        }
    }

    public void printStudentsByAge(int age) {
        for (Student student : this.studentList) {
            if (student.getAge() == age) {
                System.out.println(student);
            }
        }
    }

    public void printStudentsByAgeRange(int lower, int upper) {
        for (Student student : this.studentList) {
            if (student.getAge() >= lower && student.getAge() <= upper) {
                System.out.println(student);
            }
        }
    }

    public ArrayList<Student> getStudents() {
        return this.studentList;
    }
}
