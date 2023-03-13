import java.io.File;
import java.util.Scanner;

public class rename_a_file {
    static void rename_file(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the filename you want to rename: ");
        String oldName = sc.next();
        File file = new File("/home/apnx-desk02/fileManipulation/"+oldName);
        if(!file.exists()){
            System.out.println("File doesn't exist!");
            return;
        }
        System.out.print("Enter the new name: ");
        String newName = sc.next();

        File fileRenamed = new File("/home/apnx-desk02/fileManipulation/"+newName);
        if(!(file.isFile() && file.exists())){
            System.out.println("Invalid input!");
            return;
        }
        if(file.renameTo(fileRenamed)) System.out.println("File renamed successfully.");
        else System.out.println("Rename failed!");
    }
}
