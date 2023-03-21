import java.io.File;

public class deleteFile {
    static void delete_file(String[] filename){
        System.out.println();
        for(int fileName = 1; fileName<filename.length; fileName++) {
            File file = new File("/home/apnx-desk02/fileManipulation/" + filename[fileName]);
            System.out.println();
            if (!(file.exists() && file.isFile())) {
                System.out.println(filename[fileName]+": No such file or directory");
                return;
            }
            if (file.delete()) System.out.println(filename[fileName]+" deleted successfully.");
            else System.out.println("File deletion failed!");
        }
        System.out.println();
    }
}
