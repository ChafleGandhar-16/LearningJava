package T5Arrays;

public class T5Array {
    public static void main(String[] args) {
        //syntax
        //datatype[] variable_name = new datatype[size];
        int[] rollno1 = new int[5]; // 'new' is used to create an object. 'new int[5]' will create a memory in heap memory of size 5
        int[] rollno2 = {15, 25, 48, 13, 71}; //does the same thing as 'new' internally
        int a[]; //can also be written this way
        int b[] = new int[5];

        int[] ros; //declaration of array, ros is getting defined in the stack. defining happens at compile time
        ros = new int[5]; //actually here object is being created in the memory (heap). dynamic memory allocation happens at runtime
        // ros is reference variable stored in stack. It points towards the array present in heap.
        // Arrays are 'generally' stored in contiguous memory. Primitive datatypes (like int, float) are stored in contiguous form, whereas the array Non-primitive datatypes (like String) are just the reference variables to the original memory locations of each Non-primitives scattered across memory.

        int[][] x = new int[3][2]; //2-D array
        int[][] y = new int [3][];
        y[0] = new int[] { 1, 2, 3 }; // each row can have different number of blocks
        y[1] = new int[10];
        y[2] = new int[] {10, 20, 25, 30, 32};

        int[][][] z = new int[2][3][4]; //3-D array
        //refer fig 1,2
    }
}
