import java.util.Scanner;

//import java.util.Scanner;
//class MyException extends Exception{
//    public String toString(){
////        System.out.println("fam");
//        return "iam tostring";
//    }
//    public String getMessage(){
////        System.out.println("aam");
//        return "iam getmessage";
//    }
//}
//
//public class CWH_83_Exception_Class {
//    public static void main(String[] args) {
//        int a;
//        Scanner sc = new Scanner(System.in);
//        a = sc.nextInt();
//
//        if(a<10){
//            try{
//                throw new MyException();
//            }
//            catch (Exception e){
//                System.out.println(e.toString());
//                System.out.println(e.getMessage());
//                e.printStackTrace();
//                System.out.println("iam finished");
//            }
//    }
//
//
////        MyException me = new MyException();
////        me.toString();
////        me.getMessage();
////        me.printStackTrace();
//    }
//}
class Ex extends Exception{
    @Override
    public String toString() {
//        System.out.println("iam string 1");
        return "iam string";
    }
    @Override
    public String getMessage() {
        return "Iam getmessage";
    }
}


public class CWH_83_Exception_Class {
    public static void main(String[] args) {

        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        age = sc.nextInt();
        if(age>18) {
            try {
                throw new Ex();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println(e.toString());
                System.out.println("Finished");
            }
            System.out.println("Yes Finished..");
        }
        else
            System.out.println("iam totally finished");
    }
}
