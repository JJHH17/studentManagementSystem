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
            System.out.println("'Add' = Adds a new student | 'Remove Name' Removes student based on name | 'Remove ID' Removes student based on ID" +
                    "");
        }
    }
}
