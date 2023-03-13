import java.io.File;
import java.util.Scanner;

public class delete_a_file {
    static void delete_file(String filename){
        File file = new File("/home/apnx-desk02/fileManipulation/"+filename);
        if(!(file.exists() && file.isFile())) {
            System.out.println("Invalid input!");
            return;
        }
        System.out.print("Do you want to delete the file for sure?\nType yes to continue ");
        Scanner sc = new Scanner(System.in);
        if(sc.next().equals("yes")){
            if(file.delete()) System.out.println("File deleted successfully.");
            else System.out.println("File deletion failed!");
        }
        else System.out.println("File isn't deleted!");
    }
}
