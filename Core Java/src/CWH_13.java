import java.util.Scanner;
public class CWH_13 {
    public static void main(String[] args){
       String name = new String("Adnan " + "is a " + "good " + "boy.");
    //    String name = "adnan";
       System.out.println(name);

       int a = 10;
       int b = 20;
       System.out.format("%d and %d", a, b);


       Scanner adnan = new Scanner(System.in);
       System.out.print("Enter your name : ");
       String a = adnan.nextLine();
       System.out.print(a);

          OR

       System.out.print("Enter your name : ");
       String a = adnan.nextLine();
       System.out.printf("enter a name from the user is %s", a);
    }
}
