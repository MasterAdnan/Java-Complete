package LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.SplittableRandom;
import java.util.stream.Collectors;

public class LinkedList_various_features_and_methods {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        System.out.println("Size() :-");
        System.out.println(ll.size());
        ll.add("Adnan1");
        ll.add("Adnan2");
        ll.add("Adnan3");
        System.out.println(ll.size());

        System.out.println("\nPrinting Values by using Forloops :-");
        for (int i = 0; i < ll.size(); i++) {
            System.out.println("ll index " + i + " value is " + ll.get(i));
        }

        System.out.println("\nPrintin Values by using iterator with While loop");
        Iterator<String> it = ll.iterator();
        while (it.hasNext()) {
            System.out.println("ll" + " value is " + it.next());
        }

        LinkedList<String> ll2 = new LinkedList<>();
        ll2.add("Tom");
        ll2.add("Holland");

        System.out.println("\naddAll() :-");
        ll.addAll(ll2);
        System.out.println(ll);

        ll.add(2,"Faru");
        System.out.println(ll);

        System.out.println(ll.get(1));
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        System.out.println("\nRemove() :-");
        ll.remove(1);
        System.out.println(ll);

        System.out.println("\nRemoveAll() :-");
        ll.removeAll(ll2);
        System.out.println(ll);
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());
        System.out.println(ll);

        System.out.println("\nClear() :-");
        ll.clear();
        System.out.println(ll);

        System.out.println("\nReverse LinkedList :-");
        LinkedList<String> ll3 = new LinkedList<>();
        ll3.add("C");
        ll3.add("C++");
        ll3.add("Java");
        ll3.add("Python");
        ll3.add("Ruby");
        ll3.add("Linux");

        Iterator<String> it1 = ll3.descendingIterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        System.out.println("\nSort() :-");
        Collections.sort(ll3);
        System.out.println(ll3);


    }
}