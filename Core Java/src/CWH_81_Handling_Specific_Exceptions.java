import java.util.Scanner;

public class CWH_81_Handling_Specific_Exceptions {
    public static void main(String[] args) {
        int []marks = new int[3];

        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
//        marks[3] = 40;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index :   ");
        int a = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with :   ");
        int b = sc.nextInt();

        try {
            System.out.println(marks[a]);
            System.out.println(marks[a] / b);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println(e);
        }
//        catch (Exception e){
//            System.out.println("Exception");
//            System.out.println(e);
//        }
    }
}
