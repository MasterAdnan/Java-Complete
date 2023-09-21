package HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSet_Demo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Alpha");
        hs.add("Testing");
        hs.add("Beta");
        hs.add("cal");
        hs.add("dos");
//        hs.add(null);
//        hs.add(null);

        System.out.println(hs);
        System.out.println(hs.contains("cal"));
        System.out.println(hs);
        System.out.println(hs.contains("call"));

        Set<Integer> num1 = new HashSet<>();
        num1.addAll(Arrays.asList(1,3,5,4,2,7,9));

        Set<Integer> num2 = new HashSet<>();
        num2.addAll(Arrays.asList(2,4,6,8,10,1,3));

        // Get the Union
        Set<Integer> union = new HashSet<>(num1);
        union.addAll(num2);
        System.out.println(union);

        // Get the intersection
        Set<Integer> intersection = new HashSet<>(num1);
        intersection.retainAll(num2);
        System.out.println(intersection);

        // Get the difference
        Set<Integer> difference = new HashSet<>(num1);
        difference.removeAll(num2);
        System.out.println(difference);
    }
}
