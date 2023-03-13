import java.io.*;
import java.util.Scanner;

public class copy_a_file {
    static void copy_file(String filename){
        File file = new File("/home/apnx-desk02/fileManipulation/"+filename);
        if(!file.exists()){
            System.out.println("File doesn't exist!");
            return;
        }
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("/home/apnx-desk02/fileManipulation/"+filename.substring(0,filename.length()-4)+"-copy.txt"));
            BufferedReader reader = new BufferedReader(new FileReader("/home/apnx-desk02/fileManipulation/"+filename));
            String line;
            while((line= reader.readLine())!=null){
                writer.write(line);
            }
            System.out.println("Copied successfull.");
        } catch (IOException e) {
            System.out.println("Copy failed!");
        }
    }
}
