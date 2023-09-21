package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayList_Iteration {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("Adnan");
        al.add("Thaseen");
        al.add("Muddu");
        al.add("Afraz");
        al.add("Adnan");
        al.add("Aasim");
        al.add("Tate");

        System.out.println("For Loop :-");
        for (int i=0; i<al.size(); i++) {
            System.out.println(al.get(i));
        }

        System.out.println("\nFor Each Loop :-");
        for (String elm : al) {
            System.out.println(elm);
        }

        // JDK 8 -- Streams with Lambda
        System.out.println("\nStreams with Lambda :-");
        al.stream().forEach(elm -> System.out.println(elm));

        // Iterator
        System.out.println("\nIterator :-");
        Iterator<String> it = al.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
