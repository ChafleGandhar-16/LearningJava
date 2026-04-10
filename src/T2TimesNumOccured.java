import java.util.Scanner;

public class T2TimesNumOccured {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long n = in.nextLong();
        System.out.print("Enter the Digit: ");
        int digit = in.nextInt();
        int count = 0;
        while (n > 0) {
            if (n%10 == digit) {
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}
