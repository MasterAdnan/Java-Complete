package HashMap;

import java.util.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Difference_between_ConcurrentHashMap_and_SynchronizedMap {
    public static void main(String[] args) {
        System.out.println("Syncronized HashMap :-");
        // Syncronized method in collections class:
        Map<String,String> map1 = new HashMap<>();
        map1.put("1", "Adnan");
        map1.put("2", "Farru");
        map1.put("3", "Addu");
        // Create a syncronized Map:
        Map<String,String> syncmap = Collections.synchronizedMap(map1);
        System.out.println(syncmap);

        System.out.println("\nConcurrent HashMap :-");
        ConcurrentHashMap<String,String> conhash = new ConcurrentHashMap<>();
        conhash.put("A","C");
        conhash.put("B","C++");
        conhash.put("C","Java");
        System.out.println(conhash.get("A"));
//        for (int i=0;i<conhash.size();i++) {
//            System.out.println(conhash.get(i));
//        }
        for (String j: conhash.keySet()) {
            System.out.println(j);
        }


    }
}
