package HashMap;

import java.util.*;

public class How_to_convert_HashMap_to_ArrayList {
    public static void main(String[] args) {

        HashMap<String, Integer> compMap = new HashMap<>();
        compMap.put("Amazon", 10000);
        compMap.put("Flipkart", 20000);
        compMap.put("PhonePay", 30000);

        System.out.println("CompMap size is " + compMap.size());

        Iterator it = compMap.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry pairs = (Map.Entry)it.next();
            System.out.println(pairs.getKey() + " = " + pairs.getValue());
        }

        System.out.println("Convert HashMap Keys into ArrayList :-");
        List<String> compList = new ArrayList<>(compMap.keySet());
        for (String i: compList) {
            System.out.println(i);
        }

        System.out.println("Convert hashMap values into ArrayList :-");
        List<Integer> empList = new ArrayList<>(compMap.values());
        for (int j: empList) {
            System.out.println(j);
        }

    }
}