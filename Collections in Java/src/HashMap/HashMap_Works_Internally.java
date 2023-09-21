package HashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class HashMap_Works_Internally {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Adnan", 1);
        map.put("Aasim", 2);
        map.put("Farhan", 3);
        map.put("Hamdan", 4);
        map.put("Peter", 5);

        map.put("Allen", 6);
    }
}
