package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(106, "Sankap");
        map.put(105, "Saman");
        map.put(102, "Sanya");
        map.put(103, "Samantha");
        map.put(1, "Satyajeet");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.print(key + ": " + value + " ");
        }
        System.out.println();
        map.forEach((k, v) -> {
            System.out.print(k + ": " + v + " ");
        });
        System.out.println();
        System.out.println("TreeMap");
        Map<Integer, String> treeMap = new TreeMap<>();
        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            treeMap.put(entry.getKey(), entry.getValue());
        }
        // can also be done as: treeMap.putAll(map);
        System.out.println(treeMap);


    }
}
