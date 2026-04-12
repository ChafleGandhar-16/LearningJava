package T1Basics;

import java.util.Scanner;

public class T1Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }
}
