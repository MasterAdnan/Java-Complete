import java.util.LinkedList;

public class CWH_92_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>();

        ll.add(1);
        ll.add(1,2);
        ll.add(3);
        ll2.add(5);
        ll2.add(7);

        ll2.addFirst(9);
        ll2.addLast(8);
        ll.addAll(ll2);



        for (int i=0; i< ll.size(); i++) {
            System.out.println(ll.get(i));
        }


        System.out.println(ll.indexOf(1));
        System.out.println(ll.contains(7));


//        System.out.println(ll.indexOf(3));

    }
}
