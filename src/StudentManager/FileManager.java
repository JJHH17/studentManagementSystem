package StudentManager;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;

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
}
