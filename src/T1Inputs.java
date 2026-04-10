import java.util.Scanner;

public class T1Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter the roll number: ");
//        int rollno = input.nextInt();
//        System.out.println("Your Roll number is " + rollno);
        String fullname = input.nextLine(); //Use .nextline() for whole sentence
        System.out.println("Full name: " + fullname);
        String name = input.next(); // Use .next() for one one word
        System.out.println("First name: " + name);

        float marks = input.nextFloat();
        System.out.println("Float marks" + marks);
    }
}
