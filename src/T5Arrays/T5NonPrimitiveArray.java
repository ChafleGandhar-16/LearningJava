package T5Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class T5NonPrimitiveArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().split(" ");
        String[] str2 = new String[5];
        for (int i = 0; i < str2.length; i++) {
            str2[i] = in.next();
        }
        for (String j: str) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(str2));
    }
}
