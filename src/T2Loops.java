import java.util.Scanner;

public class T2Loops {
    public static void main(String[] args) {
        //for loop
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 1; i<=num; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n");

        // While Loop
        int i = 1;
        while (i <= num) {
            System.out.print(i + " ");
            i++;
        }
        System.out.print("\n");
        // Do While
        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i<=num);

        System.out.print("\n");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        // Find the largest between 3 numbers;
        //The classic if, else if, else is also the option, but instead we use Math
        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);

    }


}
