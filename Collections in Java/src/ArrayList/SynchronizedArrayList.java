package ArrayList;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {
    public static void main(String[] args) {
//        List<String> nameList = Collections.synchronizedList(new ArrayList<String>());

//      1) Collections.synchronizedList()
        List<String> li = Collections.synchronizedList(new ArrayList<>());
        li.add("java");
        li.add("Python");
        li.add("Ruby");

        // Add, Remove --> we dont need explicit synchronization
        // to fetch/Traverse the values from the list -- we have to use explicit synchronization

        synchronized (li) {
            Iterator<String> it = li.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }


//        2) copyonWriteArrayList --> its a class : THREAD SAFE/ Synchronized already.
        CopyOnWriteArrayList<String> emplist = new CopyOnWriteArrayList<>();
        emplist.add("emp1");
        emplist.add("emp2");
        emplist.add("emp3");

//        we dont need explicit synchronization for any operation ; add/remove/traverse

        Iterator<String> it = emplist.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
