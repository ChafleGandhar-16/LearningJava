import java.util.Scanner;

public class T5TwoDArray {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][]; //In 2D array, defining the number of rows is mandatory, but columns is optional
        arr[0] = new int[3]; //If you don't define the number of columns then you have to explicitly define the size
        arr[1] = new int[5]; //But the advantage is you can have different number of elements in each row
        arr[2] = new int[1];
        for (int[] i:arr) {
            for (int j = 0; j<i.length; j++) {
                i[j] = in.nextInt();
            }
        }
        for (int[] i: arr) {
            for (int j: i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
