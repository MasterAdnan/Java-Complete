import com.sun.security.jgss.GSSUtil;

class parent {
    public void method1(){
        System.out.println("iam method 1");
    }
    @Deprecated
    public void name() {
        System.out.println("iam adnan");
    }
    @Deprecated
    public int value (int a,int b){
        int c = a+b;
        return c;
    }
}


interface intface {
    void display();
}
public class CWH_112_Advanced_Practice_Set {
//    @SuppressWarnings("Deprecated")
    public static void main(String[] args) {
//        parent p = new parent();
//
//        p.method1();
//        p.name();
//        int d = p.value(12,8);
//        System.out.println(d);
//
////        intface iff = new intface() {
////            @Override
////            public void display() {
////                System.out.println("iam display 1");
////            }
////        };
//        intface iiff = ()-> {
//                System.out.println("iam display 2");
//        };
//        iiff.display();

    }
}
