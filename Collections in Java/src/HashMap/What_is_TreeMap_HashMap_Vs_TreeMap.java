package HashMap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class What_is_TreeMap_HashMap_Vs_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1000, "Addu");
        map.put(2000, "add");
        map.put(1999, "ad");
        map.put(1970, "a");
        map.put(2999, "adnan");
        map.put(3000, "adnan1");
        map.put(3010, "farr");
        map.put(3009, "farr1");

        System.out.println(map);

        System.out.println("-----------");
        map.forEach((key,value) -> System.out.println("Key = " + key + "," + "Value = " + value));

        System.out.println("-----------");
        System.out.println(map.firstKey());
        System.out.println(map.values());

        System.out.println("-----------");
//        System.out.println(map.headMap(3000).keySet());
        Set<Integer> keyslessthan3k = map.headMap(2990).keySet();
        System.out.println(keyslessthan3k);

        System.out.println("-----------");
        Set<Integer> keysGreaterthan3k = map.tailMap(3000).keySet();
        System.out.println(keysGreaterthan3k);

        System.out.println("-----------");
        TreeMap<String, Integer> userMap = new TreeMap<>();
        userMap.put("Daddy", 100);
        userMap.put("Apple", 200);
        userMap.put("Gandhi", 300);
        userMap.put("Flying soccer", 400);
        userMap.put("Eleven", 500);
        userMap.put("Banana", 600);
        userMap.put("Cumcumber", 700);
        System.out.println(userMap);

        userMap.forEach( (key, value) -> System.out.println("Key = " + key + "," + "Value = " + value));

        System.out.println("--------");
        TreeMap<Integer, String> map1 = new TreeMap<>(Comparator.reverseOrder());
        map1.put(1000, "Addu");
        map1.put(2000, "add");
        map1.put(1999, "ad");
        map1.put(1970, "a");
        map1.put(2999, "adnan");
        map1.put(3000, "adnan1");
        map1.put(3010, "farr");
        map1.put(3009, "farr1");

        System.out.println(map1);

    }
}