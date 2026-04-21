package Collection;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        Integer a = (Integer)o1;
        Integer b = (Integer)o2;
        return b.compareTo(a); //can also be written as: -a.compareTo(b);
    }
}

public class Trees {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(new MyComparator());
        treeSet.add(346);
        treeSet.add(1927);
        treeSet.add(32);
        treeSet.add(963);
        treeSet.add(-1686);
        System.out.println(treeSet);
    }
}
