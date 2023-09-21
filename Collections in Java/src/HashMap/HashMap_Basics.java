package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_Basics {
    public static void main(String[] args) {
//        no order - no index
//        Store values -- key-value <k,v>
//        Key cannot be duplicate
//        can store n number of null values but only one null key
//        hashmap is not thread safe - un synchronized
//
//                Key , Value
//        HashMap<String, String> capitalMap = new HashMap<>();
//
//        capitalMap.put("India", "Chennai");
//        capitalMap.put("India", "New Delhi"); // -->the output will exist only recent value
//        capitalMap.put("USA", "Wahington DC");
//        capitalMap.put("UK", "London");
//        capitalMap.remove("India");
//
////        System.out.println(capitalMap.get("India"));
////        System.out.println(capitalMap.get("UK"));
//
//        //if you give null value then
////        capitalMap.put(null, "Berlin");
////        System.out.println(capitalMap.get(null));
////
////        capitalMap.put(null, null);
////
////        //Iterator : over the keys by using keyset()
////        Iterator it = capitalMap.keySet().iterator();
////
////        while (it.hasNext()) {
////            String key = (String)it.next();
////            String value = capitalMap.get(key);
////            System.out.println("Key = " + key + ", Value = " + value);
////        }
//
//        //Iterator : over the set (pair) : by using entryset()
////        Iterator<Entry<String, String>> it1 =  capitalMap.entrySet().iterator();
//        Iterator <Map.Entry<String, String >> it1 = capitalMap.entrySet().iterator();
//
//        while(it1.hasNext()) {
//            Map.Entry <String, String> entry = it1.next();
//            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
//        }
//
//        //Iterator hashmap using java 8 for each & lambda :
//        capitalMap.forEach((k, v) -> System.out.println("Key = " + k + ", value = " + v));

        HashMap<String, String> capitalMap = new HashMap<>();
        capitalMap.put("India", "New Delhi");
        capitalMap.put("UK", "London");

        System.out.println(capitalMap.get("India"));


        //Iterator : over of key
        Iterator<String> it = capitalMap.keySet().iterator();

        while (it.hasNext()) {
            String key = it.next();
            String value = capitalMap.get(key);
            System.out.println("Key is " + key + ", value is " + value);
        }
        System.out.println("-----");

//        Iterator : over of set

//        Iterator<String> it = capitalMap.keySet().iterator();
        Iterator <Map.Entry<String, String>> it2 = capitalMap.entrySet().iterator();

        while (it2.hasNext()) {
            Map.Entry<String, String> entry =  it2.next();
            System.out.println("key is " + entry.getKey() + ",value is " + entry.getValue());
        }
        System.out.println("-----");

//        //Iterator hashmap using java 8 for each & lambda :
//        capitalMap.forEach((k,v) ->System.out.println(k,v));
        capitalMap.forEach((k,v) -> System.out.println("key is " + k + ", v is " + v));
    }
}