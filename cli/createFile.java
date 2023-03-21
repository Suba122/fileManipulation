import java.io.File;
import java.io.IOException;

public class createFile {
    static void file_creation(String[] filename){
        System.out.println();
        for(int fileName = 1; fileName<filename.length; fileName++){
            File file = new File("/home/apnx-desk02/fileManipulation/"+filename[fileName]);
            try {
                if(file.createNewFile()) System.out.println(filename[fileName]+" created.");
                else{
                    System.out.println(filename[fileName]+" is already exist");
                }
            } catch (IOException e) {
                System.out.println("Invalid Input!");
            }
        }
        System.out.println();
    }
}
