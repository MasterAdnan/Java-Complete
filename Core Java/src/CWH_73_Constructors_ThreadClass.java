//class parent extends Thread{
//    public void run(){
//        System.out.println("iam happy");
//    }
//}
//
//class childparent extends Thread{
//    public void run(){
//        System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
//    }
//}
//
//class childparr implements Runnable{
//    @Override
//    public void run() {
//        System.out.println("iam sadd");
//    }
//}
//
//class childpa implements Runnable{
//    public void run(){
//        System.out.println("ccccccccccccccccccccccccccccccccccc");
//    }
//}

class mythr extends Thread{
    public mythr(String name){
        super(name);
    }
    public void run(){
        int i=0;
    while(i<5){
        System.out.println("iam thread");
        i++;
    }
    }
}
public class CWH_73_Constructors_ThreadClass {
    public static void main(String[] args) {
//        parent p = new parent();
//        childparent cp = new childparent();
//
//        p.start();
//        cp.start();
//
//
//        childparr cpa = new childparr();
//        Thread t1 = new Thread(cpa);
//        childpa cdpa = new childpa();
//        Thread t2 = new Thread(cdpa);
//
//        t1.start();
//        t2.start();

        mythr mythr = new mythr("Adnan");
        mythr.start();

        System.out.println("the thread name is : " + mythr.getName());
        System.out.println("the thread name is : " + mythr.getId());
        System.out.println("the thread name is : " + mythr.getId());






    }
}
