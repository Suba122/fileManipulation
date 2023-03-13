import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

@SuppressWarnings("all")
public class move_a_file {
    static void move_file(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the filename you want to move ");
        String filename = sc.next();
        File file = new File("/home/apnx-desk02/fileManipulation/"+filename);
        if(!file.exists()) {
            System.out.println("File doesn't exist!");
            return;
        }
        System.out.print("Enter the destination path ");
        String path = sc.next();
        if(file.renameTo(new File(path+filename))){
            System.out.println("File moved successfully.");
            file.delete();
        }
        else System.out.println("Move operation failed!");
    }
}
