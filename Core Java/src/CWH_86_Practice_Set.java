import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;



//class Mythrow extends Exception{
//    public String toString(){
//        return "radius cannot be negative!";
//    }
//    public String getMessage(){
//        return "radius cannot be negative!";
//    }
//}








public class CWH_86_Practice_Set {
//    public static void newthrow(){
//        if(true){
//            throw new newthrow();
//        }
//        System.out.println("iam throwing...");
//    }

/*
//    public static double area(int r) throws NegativeRadiusException{
//        if(r<0){
//            throw new NegativeRadiusException();
//        }
//        double radius = Math.PI * r * r;
//        return radius;
//    }
*/

    public static void main(String[] args) {

/*  Problem 1 :-
      // Syntax Error
         int a = 12
         int b = 10;

      // Logical Error
         int age = 20;
         int YearBorn = 2003-20;

      // Runtime Error
          System.out.println(10/0);
 */





/*  Problem 2 :-
        try{
            int a = 999/8;
        }
        catch (IllegalArgumentException e){
            System.out.println("HeHe");
        }
        catch (ArithmeticException e){
            System.out.println("HaHa");
        }
 */


/*  Problem 3 :-
        int marks[] = new int[3];

        marks[0] = 23;
        marks[1] = 46;
        marks[2] = 69;
        Scanner sc = new Scanner(System.in);
        int index;
        boolean flag = true;
        int i = 0;
        System.out.println("''You have only 4 chance to achieve error''");
        while(flag && i<4){
            try{
                System.out.print("Enter the value of index : ");
                index = sc.nextInt();
                System.out.println("You have selected the marks is " + marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid index ");
                i++;
            }
        }
        if(i>=4){
        System.out.println("Your chance is over");
    }
 */

        int marks[] = new int[3];

        marks[0] = 23;
        marks[1] = 46;
        marks[2] = 69;
        Scanner sc = new Scanner(System.in);
        int index;

        int i = 0;
        System.out.println("''You have only 4 chance to achieve error''");
        while(true && i<4){
            try{
                System.out.print("Enter the value of index : ");
                index = sc.nextInt();
                System.out.println("You have selected the marks is " + marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid index ");
                i++;
            }
        }
        if(i>=4){
            try{
                int a= 10;
                int b = 2;
                int c = a/b;
                System.out.println(c);
            }
            catch (Exception e){
                System.out.println("iam max rise");
                System.out.println(e);
            }
        }






    }
}
