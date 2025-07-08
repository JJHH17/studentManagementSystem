package StudentManager;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class UserInterface {
    private StudentManager school;
    private Scanner scanner;
    private FileManager fileManager;

    public UserInterface(Scanner scanner) {
        this.fileManager = new FileManager();
        this.school = new StudentManager(fileManager);
        this.scanner = scanner;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        fileManager.createFile();

        while (true) {
            System.out.println("'Add' = Adds a new student | 'Remove Name' Removes student based on name | 'Remove ID' Removes student based on ID | 'print all' prints all students | \n" +
                    "'print by age' prints students with a given age | 'print by range' prints students in a given age range | 'quit' exits the program");
            String userInput = scanner.nextLine().strip();

            if (userInput.equalsIgnoreCase("quit")) {
                break;
            }

            switch(userInput.toLowerCase()) {
                case "add":
                    System.out.println("Enter first name:");
                    String firstName = scanner.nextLine().strip();

                    System.out.println("Enter last name:");
                    String lastName = scanner.nextLine().strip();

                    System.out.println("Enter age:");
                    int age = Integer.valueOf(scanner.nextLine().strip());

                    this.school.addStudent(firstName, lastName, age);
                    // Adding students to file
                    this.fileManager.writeFile(this.school.getStudents());
                    break;

                case "remove name":
                    System.out.println("Enter students first name:");
                    String firstNameDelete = scanner.nextLine().strip();

                    System.out.println("Enter last name:");
                    String lastNameDelete = scanner.nextLine().strip();

                    this.school.removeStudent(firstNameDelete, lastNameDelete);
                    break;

                case "remove id":
                    System.out.println("Enter the ID of the student you wish to delete:");
                    int idDelete = Integer.valueOf(scanner.nextLine().strip());

                    this.school.removeStudent(idDelete);
                    break;

                case "print all":
                    this.school.printStudents();
                    break;

                case "print by age":
                    System.out.println("Enter the age you wish to print:");
                    int printedAge = Integer.valueOf(scanner.nextLine().strip());

                    this.school.printStudentsByAge(printedAge);
                    break;

                case "print by range":
                    System.out.println("Enter the minimum age you wish to print:");
                    int minimumAge = Integer.valueOf(scanner.nextLine().strip());

                    System.out.println("Enter the maximum age you wish to print:");
                    int maximumAge = Integer.valueOf(scanner.nextLine().strip());

                    this.school.printStudentsByAgeRange(minimumAge, maximumAge);
                    break;

                default:
                    System.out.println("Please enter a valid entry");
                    continue;
            }
        }
    }
}
