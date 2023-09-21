class thread11 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while(true){
            System.out.println("iam running..");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
class thread22 extends Thread{
    public void run() {

        while(true){
            System.out.println("iam runningggggggggggggggggggggggggggggggggggggggggggggg..");
        }
    }
}
public class CWH_75_Thread_Methods {
    public static void main(String[] args) {
        thread11 t11 = new thread11();
        thread22 t22 = new thread22();

        t11.start();
//        try{
//            t11.join();
//        }
//        catch(Exception e) {
//            System.out.println(e);
//        }
        t22.start();
    }
}
