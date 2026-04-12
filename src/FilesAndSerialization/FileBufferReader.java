package FilesAndSerialization;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileBufferReader {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("G:\\IntelliJ_Idea\\file_handling.txt")); //BufferReader:
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
//Buffer Reader vs. Scanner
//B: Speed is fast
//S: Speed is slow
//B: Reads only text
//S: Reads text and number
//B: Used for large data
//S: Used for small data