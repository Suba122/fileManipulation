import java.util.Scanner;
public class fileManipulation {
    public static void main(String[] args) {
        while(true){
            String str = """
                
                ---------------------------------------------------------------------------------------------
                --------------------------------- File Manipulation -----------------------------------------
                ---------------------------------------------------------------------------------------------

                1.Create a file
                2.write a file
                3.Read a file
                4.Delete a file
                5.Rename a file
                6.Copy a file
                7.Move a file
                8.Exit
                """;
            Scanner sc = new Scanner(System.in);
            System.out.println(str);
            System.out.print("Enter your choice to continue ");
            int choice = sc.nextInt();
            System.out.println();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the filename: ");
                    create_a_file.file_creation(sc.next());
                }
                case 2 -> {
                    show_all_files.show_files();
                    System.out.print("\nEnter the filename: ");
                    write_a_file.write_file(sc.next());
                }
                case 3 -> {
                    show_all_files.show_files();
                    System.out.print("\nEnter the filename, you want to read: ");
                    read_a_file.read_file(sc.next());
                }
                case 4 -> {
                    show_all_files.show_files();
                    System.out.print("\nEnter the filename, you want to Delete: ");
                    delete_a_file.delete_file(sc.next());
                }
                case 5 -> {
                    show_all_files.show_files();
                    rename_a_file.rename_file();
                }
                case 6 -> {
                    show_all_files.show_files();
                    System.out.println("\nEnter the filename you want to copy: ");
                    copy_a_file.copy_file(sc.next());
                }
                case 7 -> {
                    show_all_files.show_files();
                    move_a_file.move_file();
                }
                case 8 -> {
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}