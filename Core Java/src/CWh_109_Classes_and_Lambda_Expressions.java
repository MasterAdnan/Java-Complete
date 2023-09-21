interface Demo{
    void meth1();
    void meth2();
}
class AnnoyDemo implements Demo {

    @Override
    public void meth1() {
        System.out.println("meth1");
    }

    @Override
    public void meth2() {
        System.out.println("meth2");
    }
}

interface lambda {
    void msg();
//    void str();
}
interface l  {
    void str();
}
interface c {
    void iF_integer_Given(int a);
}



public class CWh_109_Classes_and_Lambda_Expressions {
    public static void main(String[] args) {
//        this is normal class which we create and we call!
        System.out.println("this is normal class which we create and we call!");
        AnnoyDemo ad= new AnnoyDemo();
        ad.meth1();
        ad.meth2();
        System.out.println();

//        but now i dont create separate class but  i create class in one line
        System.out.println("but now i dont create separate class but  i create class in one line..This is called ANONYMOUS");
        Demo d = new Demo() {
            @Override
            public void meth1() {
                System.out.println("iam a separate class and meth1");
            }

            @Override
            public void meth2() {
                System.out.println("iam a separate class and meth2");
            }
        };
        d.meth1();
        d.meth2();

//        lambda l = ()-> {
//            System.out.println("iam lambda");
//        };
//        l.msg();
        System.out.println("\nthis is called lambda expressions..");
        lambda l1 = ()-> {
            System.out.println("iam lambda");
            System.out.println("iam lamb");
            System.out.println("iam la");
        };
        l l2 = ()-> {
            System.out.println("iam lambda 1");
            System.out.println("iam lamb 2");
            System.out.println("iam la 3");
        };
        c C = (a)-> {
            System.out.println("the value of a is: " + a);
        };
        l1.msg();
        l2.str();
        C.iF_integer_Given(12);





    }
}
