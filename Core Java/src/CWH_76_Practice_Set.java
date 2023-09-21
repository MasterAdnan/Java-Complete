//class AdnanSon extends Thread{
//    @Override
//    public void run() {
//        while (true) {
//            System.out.println("Good Morning");
//        }
//    }
//}
//class AdnanAdduinsta extends Thread{
//    @Override
//    public void run() {
//        while (true){
////            try{
////                Thread.sleep(200);
////            }catch(Exception f){
////                System.out.println(f);
////            }
//            System.out.println("And Welcome Namastey hey aap sabi kaaa");
//        }
//    }
//}
class A extends Thread{
    @Override
    public void run() {
        System.out.println("Good Morning!");
    }
}
class B extends Thread{
    @Override
    public void run() {
        System.out.println("Welcome");
    }
}

public class CWH_76_Practice_Set {
    public static void main(String[] args) {
//        AdnanSon ad = new AdnanSon();
//        AdnanAdduinsta AA = new AdnanAdduinsta();

//        ad.start();
//        AA.start();


        A A = new A();
        B B = new B();

        A.setPriority(8);
        B.setPriority(7);
//        B.getState();
        System.out.println(A.getPriority());
        System.out.println(B.getPriority());

        //It will Print New
        System.out.println(B.getState());

        //Now It will Print Runnable
        B.start();
        System.out.println(B.getState());

        //Current Thread
        System.out.println(Thread.currentThread().getState());







    }
}
