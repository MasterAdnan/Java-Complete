import java.util.ArrayList;

class Generics<T1> {
    int val;
    private T1 t1;

    public Generics(int val, T1 t1) {
        this.val = val;
        this.t1 = t1;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}
public class CWH_110_Generics {
    public static void main(String[] args) {




//        ArrayList al = new ArrayList();
//
//        al.add(2);
//        al.add(3);
//        al.add("adnan");
//        al.add("addu");
//
//        String  a = (String)al.get(3);
//        System.out.println(a);
//
//        ArrayList al2 = new ArrayList();
//
//        al2.add("adn");
//        al2.add(12);
//
//        int b = (int)al2.get(1);
//        String c = (String) al2.get(0);
//        System.out.println(b+ "<-->" + c);

//        ArrayList al = new ArrayList();
//
//        al.add("adnan");
//        al.add(12);
//        al.add("addu");
//        al.add(24);
//
//        System.out.println(al.get(0));
//        // TYPE CASTING
//        int a = (int) al.get(1);
//        System.out.println(a);
//
//        String b = (String) al.get(2);
//        System.out.println(b);

        Generics g1 = new Generics(12,"iam");

//        g1.setVal(13);

        System.out.println(g1.getVal());

//        g1.setT1("hiu");
        System.out.println(g1.getT1());


    }
}
