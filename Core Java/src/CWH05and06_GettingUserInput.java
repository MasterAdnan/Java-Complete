import java.util.Scanner;
public class CWH05and06_GettingUserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Subject Marks");

        System.out.print("Urdu : ");
        int urdu = scanner.nextInt();
        System.out.print("English : ");
        int english = scanner.nextInt();
        System.out.print("Maths : ");
        int maths = scanner.nextInt();
        System.out.print("Science : ");
        int science = scanner.nextInt();
        System.out.print("Social Science : ");
        int social_science = scanner.nextInt();
//        The Total of 5 Subjects marks is given below:-
        int total = urdu + english + maths + science + social_science;
        System.out.println("Total : " + total);

        int total_subjects = 5;
        float percentage = (float) total / total_subjects;



        System.out.println("Percentage : "+percentage+"%");

    }
}