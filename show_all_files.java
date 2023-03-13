import java.io.File;

public class show_all_files {
    static void show_files(){
        File directory = new File("/home/apnx-desk02/fileManipulation");
        String[] list = directory.list();
        if (list == null) System.out.println("No Files in the Directory!");
        else {
            System.out.println("Files :");
            for(String s : list) System.out.println(s);
        }
    }
}
