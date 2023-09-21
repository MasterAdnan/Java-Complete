package ArrayList;

import java.util.ArrayList;

public class Generic_ArrayList {
    public static void main(String[] args) {
        //Generic ArrayList
        ArrayList<Integer> MarkList = new ArrayList<>();
        MarkList.add(1);
        MarkList.add(2);
        MarkList.add(3);
//        MarkList.add(4.01); // --> I cannot do that in Generic

        ArrayList<Double> ald = new ArrayList<>();
        ald.add(12.12);
        ald.add(13.13);

        ArrayList<Float> alf = new ArrayList<>();
        alf.add(12.12f);

        ArrayList<String> Student = new ArrayList<>();
        Student.add("adnan");
        Student.add("Farhan");

        ArrayList al = new ArrayList();
        al.add(1);
        al.add(12.12f);
        al.add(13.13);
        al.add("adnan");

        System.out.println(al);
    }
}