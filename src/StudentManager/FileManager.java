package StudentManager;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;

public class FileManager {

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
        try {
            FileWriter fileWrite = new FileWriter("classroom.txt");
            // Adding students to file
            for (Student student : students) {
                fileWrite.write(student.toString() + "\n");
            }

            fileWrite.close();
            System.out.println("Wrote to file successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred (File Write)");
            e.printStackTrace();
        }
    }
}
