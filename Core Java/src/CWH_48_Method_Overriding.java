class addu{
    public void meth1(){
        System.out.println("iam addu math1");
    }
    public void meth2(){
        System.out.println("iam addu math2");
    }
}

class shab extends addu{

    public void meth3() {
        System.out.println("iam shab meth2");
    }
    @Override
    public void meth2() {
        System.out.println("iam shab meth2");
    }
}

public class CWH_48_Method_Overriding {
    public static void main(String[] args) {


        addu a = new addu();
        a.meth1();
        a.meth2();

        shab s = new shab();
        s.meth1 ();
        s.meth2();





    }
}
