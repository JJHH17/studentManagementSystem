package StudentManager;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class FileWrite {

    public void createFile() {
        try {
            File classroom = new File("classroom.txt");
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

    public void writeFile() {
        try {
            FileWriter fileWrite = new FileWriter("../classroom.txt");
            fileWrite.write("This was successful");
            fileWrite.close();
            System.out.println("Wrote to file successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred (File Write)");
            e.printStackTrace();
        }
    }
}
