class adnan implements Runnable{
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("iam running..");
        }
    }
}

class adduu implements Runnable{
    public void run(){
        for (int i = 0; i <= 100; i++) {
            System.out.println("iam rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        }

    }
}

public class CWH_71_Runnable_Interface {
    public static void main(String[] args) {
        adnan a = new adnan();
        Thread t1 = new Thread(a);
        adduu ad = new adduu();
        Thread t2 = new Thread(ad);

        t1.start();
        t2.start();
    }
}
