package HashMap;

import java.util.*;

public class Compare_Two_HashMap {
    public static void main(String[] args) {
//        HashMap<Integer, String> Hm = new HashMap<>();
//        Hm.put(1,"A");
//        Hm.put(2,"B");
//        Hm.put(3,"C");
//
//        HashMap<Integer,String> Hm2 = new HashMap<>();
//        Hm2.put(3,"C");
//        Hm2.put(1,"A");
//        Hm2.put(2,"B");
//
//        HashMap<Integer,String> Hm3 = new HashMap<>();
//        Hm3.put(3,"C");
//        Hm3.put(1,"A");
//        Hm3.put(2,"B");
//        Hm3.put(3,"D");
//
//
//        System.out.println(Hm.equals(Hm2));
//        System.out.println(Hm.equals(Hm3));
//
//        // Compare hashmap for the same keys: KeySet():
//        System.out.println(Hm.keySet().equals(Hm2.keySet()));

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1,"A");
        hm.put(2,"B");
        hm.put(3,"C");

        HashMap<Integer, String> hm2 = new HashMap<>();
        hm2.put(1,"A");
        hm2.put(2,"B");
        hm2.put(3,"C");

        HashMap<Integer, String> hm3 = new HashMap<>();
        hm3.put(1,"A");
        hm3.put(2,"B");
        hm3.put(3,"C");
        hm3.put(3,"D");

        System.out.println(hm.equals(hm2));
        System.out.println(hm.equals(hm3));
        System.out.println();

        // 2)  Compare HashMap for the sameKey : keyset()
        System.out.println(hm.keySet().equals(hm2.keySet()));
        System.out.println(hm.keySet().equals(hm3.keySet()));
        System.out.println();

        // 3)  Find out the extra keys :
        HashMap<Integer, String> hm4 = new HashMap<>();
        hm4.put(1,"A");
        hm4.put(2,"B");
        hm4.put(3,"C");
        hm4.put(4,"D");
        hm4.put(5,"E");
        // Combine the keys from both the Maps : Using HashSet
        HashSet<Integer> combineKeys = new HashSet<>();
        combineKeys.addAll(hm4.keySet());
        combineKeys.removeAll(hm.keySet());
        System.out.println(combineKeys);
        System.out.println();


        // 4) Compare Maps by Values
        HashMap<Integer, String> hm5 = new HashMap<>();
        hm5.put(1,"A");
        hm5.put(2,"B");
        hm5.put(3,"C");

        HashMap<Integer,String> hm6 = new HashMap<>();
        hm6.put(4,"A");
        hm6.put(5,"B");
        hm6.put(6,"C");

        HashMap<Integer,String> hm7 = new HashMap<>();
        hm7.put(1,"A");
        hm7.put(2,"B");
        hm7.put(3,"C");
        hm7.put(4,"D");

        HashMap<Integer, String> hmap5 = new HashMap<>();
        hm5.put(1,"A");
        hm5.put(2,"B");
        hm5.put(3,"C");

        HashMap<Integer,String> hmap6 = new HashMap<>();
        hm6.put(4,"A");
        hm6.put(5,"B");
        hm6.put(6,"C");

        HashMap<Integer,String> hmap7 = new HashMap<>();
        hm7.put(1,"A");
        hm7.put(2,"B");
        hm7.put(3,"C");
        hm7.put(4,"D");

        // 1. Duplicates are not allowed in ArrayList
        System.out.println(new ArrayList<>(hm5.values()).equals(new ArrayList<>(hm6.values())));
        System.out.println(new ArrayList<>(hm6.values()).equals(new ArrayList<>(hm7.values())));
        System.out.println();

        // 2. Duplicates are allowed in HashSet
        System.out.println(new HashSet<>(hmap5.values()).equals(new HashSet<>(hmap6.values())));
        System.out.println(new HashSet<>(hmap5.values()).equals(new HashSet<>(hmap7.values())));




    }
}