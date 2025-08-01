package StudentManager;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private int studentId = 0;

    public Student(String firstName, String lastName, int age, int studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.studentId = studentID;
    }

    @Override
    public String toString() {
        return "Name: " + this.firstName + " " + this.lastName + ", ID: " + this.studentId + ", Age: " + this.age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getID() {
        return this.studentId;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public int getAge() {
        return this.age;
    }
}
