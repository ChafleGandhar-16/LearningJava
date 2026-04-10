import java.util.Scanner;

public class T2Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;

        if (n == 0) {
            System.out.println(a);
        } else if (n == 1){
            System.out.println(b);
        } else {
            for (int i = 2; i <= n; i++) {
                b = a + b;
                a = b - a;
            }
            System.out.println(b);
        }
    }
}
