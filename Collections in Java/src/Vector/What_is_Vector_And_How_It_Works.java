package Vector;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class What_is_Vector_And_How_It_Works {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        v.add(2);
        v.add(4);
        v.add(6);
        v.add(8);
        v.add(10);
        v.add(12);
        v.add(14);
        v.add(16);

        System.out.println(v);
        System.out.println(v.get(2));
        v.remove(3);
        System.out.println(v);

        for (int elm: v) {
            System.out.println(elm);
        }
        for(int i=0; i<v.size(); i++) {
            System.out.println(v.get(i));
        }
        System.out.println("Iterator Traversing :-");
        Iterator<Integer> it = v.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nSort() :-");
        Vector<Integer> vec = new Vector<>();
        vec.add(6);
        vec.add(5);
        vec.add(1);
        vec.add(5);
        vec.add(3);
        vec.add(2);
        vec.add(4);
        Collections.sort(vec);
        System.out.println(vec);

    }
}
