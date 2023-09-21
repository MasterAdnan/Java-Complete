package Vector;

import java.util.Vector;

public class _2d_Vector {
    public static void main(String[] args) {
        //2D Vector
        Vector<String> v = new Vector<>();
        v.add("C");
        v.add("C++");
        v.add("Java");
        v.add("Python");
        System.out.println(v);

        Vector myvector = new Vector();
        myvector.add(v);

        for(int i=0; i<v.size(); i++) {
            String str = (String) ((Vector) myvector.get(0)).get(i);
            System.out.println(str);
        }




    }
}
