package ArrayList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Compare_ArrayList {
    public static void main(String[] args) {

        //1) Sort and then equal
        ArrayList<String> al1 = new ArrayList<>(Arrays.asList("A","B","C","D","F"));
        ArrayList<String> al2 = new ArrayList<>(Arrays.asList("A","B","C","D","E"));
        ArrayList<String> al3 = new ArrayList<>(Arrays.asList("B","A","D","C","F"));
        ArrayList<String> al4 = new ArrayList<>(Arrays.asList("B","A","D","E","F"));

//        Collections.sort(al1);
//        Collections.sort(al2);
//        System.out.println(al1.equals(al2));
//
//        Collections.sort(al3);
//        System.out.println(al1.equals(al3));
//
//        Collections.sort(al4);
//        System.out.println(al1.equals(al4));

//        2) Compare two list - Find out the additiona element:
        ArrayList<String> al5 = new ArrayList<>(Arrays.asList("A","B","C","D","F"));
        ArrayList<String> al6 = new ArrayList<>(Arrays.asList("A","B","C","D","E"));

//        al5.removeAll(al6);
//        System.out.println(al5); // output : [F]

//        3) find out the missing element:
//        al6.removeAll(al5);
//        System.out.println(al6); // output : [E]

//        4) Find out the common element:
        ArrayList<String> al7 = new ArrayList<>(Arrays.asList("A","B","C","D","F"));
        ArrayList<String> al8 = new ArrayList<>(Arrays.asList("A","B","C","D","E"));

//        al7.retainAll(al8);
//        System.out.println(al7);
    }
}
