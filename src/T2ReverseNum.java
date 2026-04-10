import java.util.Scanner;

public class T2ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long n = in.nextLong();
        while (n>0) {
            System.out.print(n % 10);
            n/=10;
        }
    }
}
