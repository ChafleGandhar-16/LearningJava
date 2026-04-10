import java.util.Scanner;
import java.util.Arrays;

public class T5Inputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 41;
        arr[1] = 42;
        arr[2] = 43;
        arr[3] = 44;
        arr[4] = 45;
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);
        int[] arr2 = new int[5];
        for (int i = 0; i<arr.length; i++) {
            arr2[i] = in.nextInt();
        }

        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        for (int num: arr2) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(arr));

    }
}
