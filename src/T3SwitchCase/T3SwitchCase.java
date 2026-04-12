package T3SwitchCase;

import java.util.Scanner;

public class T3SwitchCase {
    public static void main(String[] args) {
        System.out.print("Enter the fruit: ");
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "Mango":
                System.out.println("mango");
                break;
            case "Apple":
                System.out.println("apple");
                break;
            case "Orange":
                System.out.println("orange");
                break;
            default:
                System.out.println("unknown");
        }
        // The above format is the traditional switch case format

        //There is cleaner format available. This format has auto break
        switch (fruit) {
            case "Mango" -> System.out.println("mango");
            case "Apple" -> System.out.println("apple");
            case "Orange" -> System.out.println("orange");
            default -> System.out.println("unknown");
        }

        //What if we don't want to use auto break;
        switch (fruit) {
            case "Mango", "Watermelon", "Muskmelon" -> { // Curly braces can be used for multiple lines of code
                System.out.println("Summer Fruit");
                System.out.println("My favourite Season");
            }
            case "Apple", "Orange", "Berry" -> System.out.println("Winter Fruit");
            default -> System.out.println("unknown");
        }

    }
}