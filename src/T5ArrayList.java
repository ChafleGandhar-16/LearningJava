import java.util.ArrayList;
import java.util.Scanner;

public class T5ArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(32);
        list.add(18);
        list.add(61);
        list.add(1);
        list.add(67);
        list.add(41);
        list.add(50);
        list.add(39);
        list.add(91);
        list.add(20);
        list.add(19);
        list.add(24);
        list.add(37);
        list.add(46);
        list.add(59); //Doesn't matter if the capacity is exceeded

        System.out.println(list); //No need for Arrays.toString()
        System.out.println("Does the list contain 19: " + list.contains(19));
        list.add(3, 16);
        System.out.println(list);
        list.set(6, 50);
        System.out.println(list);
        int val = list.get(6); //list[6] isn't possible here, we have to compulsorily use .get() method
        System.out.println("Value at index 6: " + val);
        for (int i = 0; i<list.size(); i++) System.out.print(list.get(i) + " ");
        System.out.println();
        list.remove(10);
        System.out.println(list);
        // When a certain amount of ArrayList is full then java creates a new list with increased capacity by certain amount and the entire list is copy-pasted and the previous list is deleted
        //2D ArrayList can also be formed

        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
        // Initially the 2D list would be null so Initialisation is needed
        //Initialisation
        int row = 2;
        int col = 3;
        for (int i = 0; i < row; i++) list1.add(new ArrayList<>());
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                list1.get(i).add(in.nextInt());
            }
        }
        for (ArrayList<Integer> l: list1) {
            for (int i: l) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}











