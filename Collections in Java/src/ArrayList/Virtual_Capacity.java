package ArrayList;

import java.util.ArrayList;

public class Virtual_Capacity {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(22); // -->VC = Virtual Capacity is 22 always the default capacity is 10.
        System.out.println(al.size()); // -->PC = Physical Capacity is 0
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al.size()); // -->PC = Physical Capacity is 5

        al.add(6);
        al.add(7);
        al.add(8);
        al.add(9);
        al.add(10);
        al.add(11);
        al.add(12);
        al.add(13);
        al.add(14);
        al.add(15);
        System.out.println(al.size()); // -->PC = Physical Capacity is 15


    }
}
