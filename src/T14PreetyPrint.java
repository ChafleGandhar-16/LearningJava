import java.util.Arrays;

public class T14PreetyPrint {
    public static void main(String[] args) {
        System.out.println(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(new int[] {1, 2, 3}));
        String a = new String ("Gandhar");

        float b = 34.12845f;
        System.out.printf("%f in 2 decimal places => %.2f. It can also round off\n", b, b);
        System.out.printf("%f => %.2f\n",Math.PI, Math.PI);

        System.out.println('a' + 'b');
        System.out.println("a" + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));
        System.out.println("a " + Arrays.toString(new char[] {100, 120, 14}));
    }
}
