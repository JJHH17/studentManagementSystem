package StudentManager;

import java.util.Scanner;


public class UserInterface {
    private StudentManager school;
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.school = new StudentManager();
        this.scanner = scanner;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("'Add' = Adds a new student | 'Remove Name' Removes student based on name | 'Remove ID' Removes student based on ID");
            String userInput = scanner.nextLine();

            switch(userInput.toLowerCase()) {
                case "add":
                    System.out.println("Enter first name:");
                    String firstName = scanner.nextLine();

                    System.out.println("Enter last name:");
                    String lastName = scanner.nextLine();

                    System.out.println("Enter age:");
                    int age = Integer.valueOf(scanner.nextLine());

                    this.school.addStudent(firstName, lastName, age);

                case "remove name":
                    System.out.println("Enter students first name:");
                    String firstNameDelete = scanner.nextLine();

                    System.out.println("Enter last name:");
                    String lastNameDelete = scanner.nextLine();

                    this.school.removeStudent(firstNameDelete, lastNameDelete);

                case "remove id":
                    System.out.println("Enter the ID of the student you wish to delete:");
                    int idDelete = Integer.valueOf(scanner.nextLine());

                    this.school.removeStudent(idDelete);

                case "print all":
                    this.school.printStudents();

                case "print by age":
                    System.out.println("Enter the age you wish to print:");
                    int printedAge = Integer.valueOf(scanner.nextLine());

                    this.school.printStudentsByAge(printedAge);

            }
        }
    }
}
