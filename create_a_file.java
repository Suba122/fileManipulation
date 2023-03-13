import java.io.File;
import java.io.IOException;

public class create_a_file {
    static void file_creation(String filename){
        File file = new File("/home/apnx-desk02/fileManipulation/"+filename);
        try {
            if(file.createNewFile()) System.out.println("File Created.");
            else{
                System.out.println("File already exist with the given name!");
            }
        } catch (IOException e) {
            System.out.println("Invalid Input!");
        }
    }
}
