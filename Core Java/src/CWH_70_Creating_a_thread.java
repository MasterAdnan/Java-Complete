
class thread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<50) {
            System.out.println("iam thread1");
            System.out.println("iam happyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
            i++;
        }
    }
}
class thread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<50) {
            System.out.println("iam thread2");
            System.out.println("iam bad");
            i++;
        }
    }

}

public class CWH_70_Creating_a_thread {
    public static void main(String[] args) {

        thread1 t1 = new thread1();
        thread2 t2 = new thread2();

        t1.start();
        t2.start();

    }
}
