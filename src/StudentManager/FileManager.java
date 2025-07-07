package StudentManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
    private final String FILENAME = "classroom.txt"; // File constant for reading and writing

    public void createFile() {
        try {
            File classroom = new File("classroom.txt");
            if (classroom.createNewFile()) {
                System.out.println("File created: " + classroom.getName());
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void writeFile(ArrayList<Student> students) {
        try (FileWriter fileWrite = new FileWriter(FILENAME)){
            // Adding students to file
            for (Student student : students) {
                fileWrite.write(String.format("%s,%s,%d,%d\n",
                        student.getFirstName(),
                        student.getFirstName(),
                        student.getAge(),
                        student.getID()));
            }
            System.out.println("Wrote to file successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred (File Write)");
            e.printStackTrace();
        }
    }

    public ArrayList<Student> readFile() {
        ArrayList<Student> students = new ArrayList<>();
        try (Scanner fileScanner = new Scanner (new File(FILENAME))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    students.add(new Student(
                            parts[0], // Firstname
                            parts[1], // Lastname
                            Integer.parseInt(parts[2]), // Age
                            Integer.parseInt(parts[3]) // id
                    ));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No existing file found.");
        }
        return students;
    }
}
