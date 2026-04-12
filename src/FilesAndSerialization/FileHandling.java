package FilesAndSerialization;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws Exception {
        File f = new File("G:\\IntelliJ_Idea\\file_handling.txt");
        f.createNewFile(); //Won't create multiple files
        FileWriter fw = new FileWriter(f, true); // true must be added otherwise the data will be overwritten while using 'write'
        fw.write("\nOhayo Gosaimasu");
        fw.write("\nWatashi no namae wa ____\n");
        fw.write("Yoroshiku Onegaishimasu!!");
        Scanner in = new Scanner(f);
        while (in.hasNextLine()) {
            System.out.println(in.nextLine());
        }
        System.out.println(" Path: " + f.getPath());
        System.out.println("Parent: " + f.getParent()); //Gives parent folder location
        fw.close(); //Must be written otherwise there will be no output written in the file
    }
}
