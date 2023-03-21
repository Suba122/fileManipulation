import java.io.File;

public class renameFile {
    static void rename_file(String oldName, String newName){
        System.out.println();
        File file = new File("/home/apnx-desk02/fileManipulation/"+oldName);
        if(!file.exists()){
            System.out.println("File doesn't exist!");
            return;
        }
        File fileRenamed = new File("/home/apnx-desk02/fileManipulation/"+newName);
        if(!(file.isFile() && file.exists())){
            System.out.println("Invalid input!");
            return;
        }
        if(file.renameTo(fileRenamed)) System.out.println("File renamed successfully.");
        else System.out.println("Rename failed!");
        System.out.println();
    }
}
