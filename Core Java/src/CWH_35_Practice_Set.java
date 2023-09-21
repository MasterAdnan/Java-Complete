import java.util.Scanner;
public class CWH_35_Practice_Set {

    /*  Question 1 :-
    static int multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" x " +i+ " = "+ n*i);
        }
        return n;
    }    */



    /*  Question 2 :-
     static void star(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
     */



    /*   Question 3 :-
      static int recursion(int n){
        if(n==1){
            return 1;
        }
        return n + recursion(n-1);
         }
      */


    /*  Question 4 :-
    static void star2() {
        for(int i=4;i>0;i--){
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }   */


    /* Question 5 :-
    static int fib(int n){
        if(n==1){
            return 0;
        }
        else if (n==2) {
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }
     */


//    static int addu(int x,int y){
//        int z = x +y;
//        System.out.println(addu(2,5));
//        return z;
//    }


/*  Question 9 :-
    static void celciusandfarenheit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter celsius : ");
        float celsius = sc.nextInt();

//    converting celsius to farenheit :-
         float farenheit =  (float)(celsius * 1.8) + 32;
         System.out.println("Value of temperature in farenheit is : " + farenheit);
}
    */

    /* Question 10 :-
    static int iterative(int n){
        if(n!=0) {
            for (int i = 0; i < 3; i++) {
                System.out.println("3");
            }
        }
        else{
            System.out.println("2");
        }
        return n;
    }
     */


    public static void main(String[] args) {

//addu(4,7);
//        int addu1 = addu(3, 5);
//        System.out.println(addu1);
    /*  Question 1 :-
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Table number : ");
    int n = sc.nextInt();
    multiplication(n);
    */


    /*  Question 2 :-
        star(4);
        */


    /*  Question 3 :-
        System.out.println(recursion(10));
    */


     /*   Question 4 :-
        star2();
      */

        /*  Question 5 :-
        System.out.println(fib(7));
         */


      /*  Question 7 :-


       */



        /*  Question 9 :-
        celciusandfarenheit();
         */


        /* Question 10 :-
        iterative(10);
         */


    }
}
