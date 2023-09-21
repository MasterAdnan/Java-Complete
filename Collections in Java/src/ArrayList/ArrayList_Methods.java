package ArrayList;
import java.util.*;
public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("C");
        al.add("C++");
        al.add("Java");
        al.add("C#");

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Dev Ops");
        al2.add("Testing");

//        System.out.println("\nAddAll Method :-");
//        al.addAll(al2);
//        System.out.println(al);
//        System.out.println("AddAll Method");
//        al.addAll(1,al2);
//        System.out.println(al);

//        System.out.println("\nClear Method :-");
//        al.clear();
//        System.out.println(al);

//        System.out.println("\nClone Method :-");
//        ArrayList<String> CloneList =  (ArrayList<String>)al.clone();
//        System.out.println(CloneList);

//        System.out.println("\nContains Method :-");
//        System.out.println(al.contains("c"));
//        Boolean a = al.contains("C++");
//        System.out.println(a);
//        System.out.println(al.contains("Python"));

//        System.out.println("\nIndexOf Method :-");
//        System.out.println(al.indexOf("C++")); // Tell only index;
//        System.out.println(al.indexOf("C++")>0); // --> Tell true/False;
//
//        System.out.println("\nlastIndexOf Method :-");
//        System.out.println(al.lastIndexOf("C++")); // Tell only index;
//        System.out.println(al.lastIndexOf("C++")>0); // --> Tell true/False;

//        System.out.println("\nlastIndexOf Method :-");
//        ArrayList<String> Ar = new ArrayList<>(Arrays.asList("Adnan", "Farhan", "Aasim", "Hamdan", "Adnan", "Aasim", "Aasim"));
//        System.out.println(Ar.lastIndexOf("Aasim"));
//        System.out.println(Ar.lastIndexOf("Aasim")<0);

//        System.out.println("\nRemove Method :-");
//        Ar.remove("Aasim");
//        for (int i=0 ; i<3; i++) {
//            Ar.remove("Aasim");
//        }
//        System.out.println(Ar);

//        System.out.println("\nRemove If method :-");
//        ArrayList<Integer> Ar = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//        Ar.removeIf(num -> num%2 == 0);
//        System.out.println(Ar);
//        ArrayList<Integer> Ar2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//        Ar2.removeIf(num -> num%2 != 0);
//        System.out.println(Ar2);

//        System.out.println("\nRetain All Method :-");
//        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Adnan", "Farhan", "Hamdan", "Adnan", "Aasim"));
//        System.out.println(nameList);

//        nameList.retainAll(Collections.singletonList("Adnan"));
//        nameList.retainAll(Collections.singletonList("Addu")); // it will come empty
        // If the value is there it will tell the value in the above section i have given 2(Adnan) it will print.
//        System.out.println(nameList);

//        System.out.println("\nSub List Method :-");
//        ArrayList<Integer> al3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14));
//        System.out.println(al3);
//        ArrayList<Integer> Sub = new ArrayList<>(al3.subList(0,14));
//        System.out.println(Sub);

//        ArrayList<String> nameList1 = new ArrayList<>(Arrays.asList("Adnan", "Farhan", "Hamdan", "Adnan", "Aasim"));
//        System.out.println(nameList1);
//        for (String e: nameList1) {
//            System.out.println(e);
//        }
//        System.out.println("\nchanging Arraylist to Array :-");
//        Object array[] = nameList1.toArray();
//        System.out.println(Arrays.toString(array));
//
//        for (Object o : array) {
//            System.out.println(o);
//        }
    }
}