package StudentManager;

import java.io.File;
import java.io.IOException;

public class FileWriter {
    public FileWriter() {
        try {
            File classroom = new File("../classroom.txt");
            if (classroom.createNewFile()) {
                System.out.println("File created: " + classroom.getName());
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
