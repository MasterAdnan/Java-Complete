package HashMap;

import java.util.HashMap;

public class How_HashTable_works_Internally_HashTable_VS_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Naveen", 100);
        map.put("Tom", 200);
        map.put("Lisa", 300);
        map.put("Peter", 400);
        map.put("Robby", 500);

        System.out.println(map.get("Naveen"));
        System.out.println(map.get("Tom"));
        System.out.println(map.get("Peter"));
    }
}
