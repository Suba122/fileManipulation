import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n---File Manipulation---\n");
        while(true){
            System.out.print("> ");
            String[] function = sc.nextLine().split(" ");

            switch (function[0]){
                case "show-files":
                    showFiles.show_files();
                case "create":
                    createFile.file_creation(function);
                    break;
                case "read":
                    readFile.read_file(function[1]);
                    break;
                case "delete":
                    deleteFile.delete_file(function);
                    break;
                case "rename":
                    renameFile.rename_file(function[1], function[2]);
                    break;
                case "help":
                    System.out.println("""
                            
                            Show files     > show-files
                            Create a file  > create fileName1 fileName2 ...
                            Read a file    > read fileName
                            Delete a file  > delete fileName1 fileName2 ...
                            Rename a file  > rename oldName newName
                            To exit        > exit
                            """);
                    break;
                case "exit":
                    return;
                default:
                    System.out.println(function[0]+": Command not found\nuse help");
            }
        }
    }
}