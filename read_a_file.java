import java.io.*;

public class read_a_file {
    static void read_file(String filename){
        File file = new File("/home/apnx-desk02/fileManipulation/"+filename);
        if(!file.exists()){
            System.out.println("File doesn't exist!");
            return;
        }
        if(!file.isFile()){
            System.out.println("Not a file!");
            return;
        }
        if(!file.canRead()){
            System.out.println("Can't read the specified file!");
            return;
        }
        try {
            System.out.println();
            System.out.println(filename+":");
            BufferedReader reader = new BufferedReader(new FileReader("/home/apnx-desk02/fileManipulation/"+filename));
            int x;
            while((x = reader.read())!=-1){
                System.out.print((char)x);
            }
            System.out.println();
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
