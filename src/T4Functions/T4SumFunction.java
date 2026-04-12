package T4Functions;

import java.util.Arrays;
import java.util.Scanner;

public class T4SumFunction {
    public static void main(String[] args) {
        sum();
        //the variable that are being passed are called arguments
        int ans = sum(45, 25); //functions with same name can be identified as different as long as they have different arguments types
        System.out.println("Args sum = " + ans);

        variableArgs (1, 2, 10, 20, 30, -100);
        mixture (51, 52, "Gandhar", "Omkar", "Smirat");
    }

//    Syntax for Functions
//    access_specifier return_type name {
//        body
//        return_statement;
//    }

//    sum() function can only be called in main function if and only if sum() is also static.
//    This is because, if you want to call a non-static method, you need to create an object first.
//    But a static method can be called without an object (T4Functions.T4SumFunction.sum())
//    If called in the same class, then no need to mention the class too (sum())
    static void sum() {
        int n, m, sum;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1 and number 2: ");
        n = in.nextInt();
        m = in.nextInt();
        sum = n + m;
        System.out.println("Sum = " + sum);
    }

    static int sum(int n, int m) { //variables that are received in the function are called parameters
        int sum = n + m;
        return sum;
    }

    static void variableArgs (int ...v) { //It takes variable number of args and stores them an array named v
        System.out.println(Arrays.toString(v));
    }
    
    static void mixture (int a, int b, String ...s) {
        System.out.println(a + " " + b + " " + Arrays.toString(s));
    }
}
