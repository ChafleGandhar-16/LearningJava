package Collection;

import java.util.*;

public class List {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Aryan");
        list.add("Aryan");
        list.add('y');
        list.add(69);
        list.add(true);
        list.add(null);

        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }

        System.out.println("\n" + list.toString() + "\n");

        for (Object o: list) System.out.print(o + " ");
        System.out.println();

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        LinkedList linkedList = new LinkedList();

        linkedList.add("Anushka");
        linkedList.add('Z');
        linkedList.add("🔥🔥");
        linkedList.add(10.75f);
        linkedList.add(null);
        linkedList.add(true);
        linkedList.add("🔥🔥");

        for (Object o: linkedList) {
            System.out.print(o + " ");
        }
        System.out.println();

        LinkedList<Integer> nums = new LinkedList<> ();
        nums.add(10685);
        nums.add(16786);
        nums.add(16852);
        nums.add(36759);
        nums.add(342269);
        nums.add(648);

        nums.removeIf(x -> x%2==1);

        for (Object o: nums) {
            System.out.print(o + " ");
        }
        LinkedList<String> l1 = new LinkedList<> ();
        LinkedList<String> l2 = new LinkedList<> ();
        l1.add("tiger");
        l1.add("cat");
        l1.add("dog");
        l2.add("cat");
        l2.add("dog");
        l2.add("horse");

        Stack<Integer> stack = new Stack<>();
        stack.push(352);
        stack.push(104);
        stack.push(8610);
        stack.push(8105);
        stack.push(461);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.toString());
    }
}
