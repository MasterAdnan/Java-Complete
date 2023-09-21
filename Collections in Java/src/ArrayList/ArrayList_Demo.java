package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Demo {
    public static void main(String[] args) {
        //Default Class
        //Dynamic Array

        //Default Generics --> ArrayList<> al = new ArrayList<>;
        ArrayList<Object> al = new ArrayList<>();
        al.add(1);
        al.add(true);
        al.add("adnan");
        al.add(12.12);
        System.out.println(al);

        //List with other Collection
        System.out.println("\nList with other Collection :-");
        ArrayList<Integer> ali = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        System.out.println("ali value is" + ali + ", Length of ali is " +  ali.size());

        ArrayList<String> als = new ArrayList<>(Arrays.asList("Adnan", "farhan", "Aasim", "Hamdan", "Irbaz"));
        System.out.println("als value is" + als + ", Length of als is " +  als.size());
    }
}