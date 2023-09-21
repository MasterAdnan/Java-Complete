import java.util.Scanner;
public class CWH_18 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter switch value : ");
         int age;
         age = sc.nextInt();
//        int age1;
//        age1 = age.nextInt();

        switch(age) {
            case 1:
                System.out.println("hi adnan");
                break;
            case 2:
                System.out.println("hi farhan");
                break;
            case 3:
                System.out.println("hi aasim");
                break;
            default:
                System.out.println("mentioned name is not here");
        }

        /*  ///////////      OR   ///////////  */

//        switch(age) {
//            case 1 ->
//                    System.out.println("hi adnan");
//            case 2 ->
//                    System.out.println("hi farhan");
//            case 3 ->
//                    System.out.println("hi aasim");
//            default ->
//                    System.out.println("mentioned name is not here");
//        }

    }
}
