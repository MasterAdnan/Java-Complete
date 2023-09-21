import java.util.ArrayList;

public class CWH_91_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>(2);
        al.add(2);
        al.add(6);
        al.add(7);
        al.add(0);
        al.add(3);
        al.add(9);
//        al2.add(0,3);
//        al2.add(1,1);
//        al2.add(2);
//        al2.add(3);
//        al2.add(4);
//        al2.add(5);
//        al2.add(6);


        al.addAll(al2);

        System.out.println(al.indexOf(9));

        for (int i=0; i<al.size();i++){
            System.out.println(al.get(i));
        }

    }
}
