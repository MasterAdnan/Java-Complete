import jdk.jfr.Label;
import jdk.jfr.Name;

class phone12 {
    public void camera(){
        System.out.println("iam phone");
    }
}
class smartphone12 extends phone12 {
    @Override
    public void camera(){
        System.out.println("iam phone of smartphone");
    }
    @Deprecated
    public int claculator(int a, int b){
        int c = a+b;
//        System.out.println(c);
        return c;
    }
}

@FunctionalInterface
//An Interface that contains exactly one abstract method is known as functional interface.
interface functionalInterface {
    void addu();
}
class name implements functionalInterface {
    @Override
    public void addu(){
        System.out.println("addu");
    }
//    void msg(){
//        System.out.println("msg");
//    }
}

public class CWH_108_Annotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        phone12 p =new phone12();
        smartphone12 sp = new smartphone12();
        phone12 p12 = new smartphone12();
//        p.camera();
//        sp.camera();
//        p12.camera();
        sp.claculator(2,3);
        int a = 0;
        int i;
        for(i=1;i<=10;i++){
            a += i;
            System.out.println("a"+ " + " + i + " = " + a);
            try{

            } catch (Exception e) {
                e.printStackTrace();
            }
//            i=0+i;
        }


    }
}
