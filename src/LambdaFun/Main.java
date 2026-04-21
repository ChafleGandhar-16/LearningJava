package LambdaFun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) {
        AddInt summation = (a, b) -> a + b;
        System.out.println(summation.add(10, 20));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(10);
        list.add(20);
        list.add(29);
        list.add(8);
        list.add(29);
        list.add(2);

        SortList sort = (arr) -> {
            for (int i = 0; i < arr.size(); i++) {
                for (int j = 0; j < arr.size(); j++) {
                    if (arr.get(i) <= arr.get(j)) {
                        Integer temp = arr.get(i);
                        arr.set(i, arr.get(j));
                        arr.set(j, temp);
                    }
                }
            }
        };
        sort.sort(list);
        System.out.println(list);

        List<String> list1 = new ArrayList<>(Arrays.asList("pratap", "pratik", "amol", "samir", "aryan", "mit"));
        list1.stream().filter(emp -> emp.startsWith("p")).forEach(System.out::println);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> evenNums = list2.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNums);

        Gandhar arya = new Arya();
        Gandhar.m2();

        String s = "Hello World    ";
        Optional<String> optional = Optional.ofNullable(s);
        System.out.println(optional.isPresent()); //false
        System.out.println(optional.get());
        System.out.println(s.substring(1, 3));
        System.out.println(s);
        System.out.println(s.trim());
    }

}
