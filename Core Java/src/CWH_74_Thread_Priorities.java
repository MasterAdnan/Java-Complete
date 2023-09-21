class Th extends Thread{
    public Th(String name){
        super(name);
    }
    public void run(){
        while (true) {
            System.out.println("iam THread priorities " + this.getName());
        }
    }
}

public class CWH_74_Thread_Priorities {
    public static void main(String[] args) {
        Th t1 = new Th("addu1");
        Th t2 = new Th("addu2");
        Th t3 = new Th("addu3");
        Th t4 = new Th("addu4 (most Important)");
        Th t5 = new Th("addu5");
        t1.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t3.getName());
        System.out.println(t4.getName());
        System.out.println(t5.getName());
    }
}
