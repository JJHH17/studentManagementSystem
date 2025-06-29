package StudentManager;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private int studentId = 0;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.studentId++;
    }


}
