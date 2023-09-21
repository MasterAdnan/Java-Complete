public class CWH_31 {
    static int logic(int x, int y){
        int z;
        if(x<y){
            z= x+y;
            System.out.println(z);
        }
        else{
            z = (x+y)*2;
            System.out.println(z);
        }
        return z;
    }
//
//
    public static void main(String[] args){
//        int a = 10;
//        int b = 20;
//        int c;
//        if(a>b){
//            c= a+b;
//            System.out.println(c);
//        }
//        else{
//            c = (a+b)*2;
//            System.out.println(c);
//        }
        int a1 = 10;
        int b1 = 20;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c1);
    }
}