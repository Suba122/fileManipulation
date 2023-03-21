import java.io.File;

public class showFiles {
    static void show_files(){
        System.out.println();
        File directory = new File("/home/apnx-desk02/fileManipulation");
        String[] list = directory.list();
        if (list == null) System.out.println("No Files in the Directory!");
        else {
            System.out.println("Files :");
            System.out.println();
            for(String s : list) System.out.println(s);
        }
        System.out.println();
    }
}
