//class base1{
////    base1(){
////        System.out.println("iam base");
////    }
//    base1(int a){
////        super(a);
//        System.out.println("the base1 value of a is " + a);
//    }
//}
//
//class derived1 extends base1{
////    derived1(){
////        super(1);
////        System.out.println("iam derived");
////    }
//    derived1(int a,int b){
//        super(a);
//        System.out.println("the value of b is " + b);
//    }
//}
//
//class childofderived1 extends derived1{
////    childofderived1(){
////        System.out.println("iam childofderived");
////    }
//    childofderived1(int a,int b,int c){
//        super(a,b);
//        System.out.println("the value of c is " + c);
//    }
//}

class base1 {
    base1(){
        System.out.println("iam base..");
    }
    base1(int a){
        System.out.println("the value of a is "+ a);
    }
}

class derived1 extends base1{
    derived1(){
        System.out.println("iam derived....");
    }
    derived1(int a,int b){
        super(a);
        System.out.println("the value of b is "+ b);
    }
}

class childofderived extends derived1{
    childofderived(){
        System.out.println("iam child of derived...");
    }
    childofderived(int a,int b,int c){
        super(a,b);
        System.out.println("the value of c is "+ c);
    }
}


public class CWH_46_Constructors_in_Inheritance {
    public static void main(String[] args) {
//        base1 b = new base1();
//        derived1 d = new derived1();
//        childofderived1 cd = new childofderived1(7,12,44);

//        base1 b = new base1();
//        derived1 d = new derived1();
//        childofderived1 cd = new childofderived1();


        base1 b = new base1();
        derived1 d = new derived1();
        childofderived c = new childofderived(12,34,56);



    }
}
