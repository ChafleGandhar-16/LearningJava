package FilesAndSerialization;

import java.io.File;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) throws Exception {
        File f = new File("G:\\IntelliJ_Idea\\Reading_Data.txt");
        Scanner in = new Scanner(f);

        while (in.hasNextLine()) {
            String line = in.nextLine();
            String[] words = line.split(",");
            int i = 0;
            while (i<3) {
                System.out.print(words[i] + "\t");
                i++;
            }
            System.out.println();
        }

        while(in.hasNextLine()) {
            String line = in.nextLine();
            String[] words = line.split(",");
            if (words[2].equals("Akola")) {
                int i = 0;
                while (i<3) {
                    System.out.print(words[i] + "\t");
                    i++;
                }
                System.out.println();
            }
        }
    }
}
