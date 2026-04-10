import java.util.Arrays;

public class T4ChangeValue {
    static int x = 100; //x will be available in every function in this class (only static variables can be used in static functions)
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        changeVal (arr);
        changeInt(arr[2]);//The array is passed
        System.out.println(Arrays.toString(arr));

        {
            int a = 10;
            System.out.println(a); //Block Scoping
        }
        int a = 15;
        System.out.println(a);

        System.out.println(x);
        int x = 200; //This is known as shadowing. The class variable x is shadowed.
        System.out.println(x);
    }

    static void changeVal (int[] array) {
        array[0] = 10;
        array[1] = 20; //The original array will be changed as array are passed by reference
    }

    static void changeInt (int ind3) {
        ind3 = 30;
    }

    //In java, functions can return on a single value unlike py functions that can return multiple values
}

