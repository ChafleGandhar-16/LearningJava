import java.util.Scanner;

public class T1TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat(); //Asking for something bigger and giving something smaller will work ✅
                                       //float num = input.nextInt();✅
                                       //int num = input.nextFloat();❌
        System.out.println(num);

        //Type Casting

        int n = (int)(72.845);
        System.out.println(n);

        // automatic type promotion in expressions

        int a = 257;
        byte b = (byte)(a); // o/p: 257%256 = 1
        System.out.println(a + " " + b);
        byte x = 40;
        byte y = 50;
        byte z = 100;
        int res = x * y / z; //int the intermidiate step of x * y, the result easily excceds 2000 way over the 256 limit of byte but java automatically promotes byte to int to perform the calculations
        System.out.println(res);

        // y = y * 2 gives an error as java has promoted y * 2 into int but then int is assigned to a byte and the rule says smaller can't accomodate bigger
        int number = 'a'; //Smaller is promoted to a bigger
        System.out.println(number);

        //All byte short and char are promoted to int
        //Any calculation that involves float, long, double will be promoted to float, long, double resp.

        System.out.println((char)(67));
    }
}
