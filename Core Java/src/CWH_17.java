public class CWH_17 {
    public static void main(String[] args) {


        /* If Else and If Else Ladder   */

        int age = 50;

        if(age>70){
            System.out.println("your age is 40");//false
        }
        else if(age<40){
            System.out.println("your age is 60");//false
        }
        else if(age<300){
            System.out.println("your age is 30");//true
        }
        else{
            System.out.println("your original age is 50");//if anywhere statement is true then it will stop otherwise it will execute else.
        }
    }
}
