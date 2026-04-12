package T2ConditionAndLoops;

import java.util.Scanner;

public class T2CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        // What is next()?
        System.out.println(input.next()); //There is no such thing as nextChar, next itself takes the String as input
        //What is trim()?
        System.out.println(input.next().trim()); //Removes all the spaces before and after the String
        //What is charAt()?
        System.out.println(input.next().charAt(3)); //Gives the character at 3rd index
    }
}
