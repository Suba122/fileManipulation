import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class write_a_file {
    static void write_file(String filename){
        Scanner sc = new Scanner(System.in);
        try {
            File file = new File("/home/apnx-desk02/fileManipulation/"+filename);
            if(file.exists()){
                System.out.print("""
                        
                        File with given name is already exist.
                        Do you want to override? or
                        Do you want to update? 
                        """);
                String writeOrUpdate = sc.next();
                String line;
                if("override".equalsIgnoreCase(writeOrUpdate)){
                    BufferedWriter writer = new BufferedWriter(new FileWriter("/home/apnx-desk02/fileManipulation/"+filename));
                    System.out.println("Type over to stop writing");

                    while(!(line = sc.nextLine()).equals("over")){
                        writer.write(line+"\n");
                    }
                    writer.close();
                    System.out.println("Writing completed");
                } else if ("update".equalsIgnoreCase(writeOrUpdate)) {
                    FileWriter writer = new FileWriter(file, true);
                    System.out.println("Type over to stop writing");
                    while(!(line = sc.nextLine()).equals("over")){
                        writer.write(line+"\n");
                    }
                    writer.close();
                    System.out.println("File updated successfully.");
                }
                else System.out.println("Invalid input!");
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
