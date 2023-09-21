////class NegativeRadiusException extends Exception{
////    public String toString(){
////        return "radius cannot be negative!";
////    }
////    public String getMessage(){
////        return "radius cannot be negative!";
////    }
////}
////
////public class CWH_84_Throw_Vs_Throws {
//////    public static int divide(int a, int b) throws ArithmeticException{
//////        int c = a/b;
//////        return c;
//////    }
////    public static double area(int r) throws NegativeRadiusException{
////        if(r<0){
////            throw new NegativeRadiusException();
////
////        }
////        double radius = Math.PI * r * r;
////        return radius;
////    }
////    public static void main(String[] args) {
////        try{
//////            try{
//////                int result = divide(10,0);
//////                System.out.println(result);
////                double ar = area(-6);
////                System.out.println(ar);
//////            }
//////            catch (Exception e){
//////                System.out.println("iam nested Exception");
//////            }
////        }
////        catch (Exception e){
////            System.out.println("iam Exception");
//////            System.out.println(NegativeRadiusException);
////        }
////
////
////    }
////}
//
//class NegativeRadiusException extends Exception {
//    public String toString() {
//        return "radius cannot be negative!";
//    }
//
//    public String getMessage() {
//        return "radius cannot be negative!";
//    }
//}
//public class CWH_84_Throw_Vs_Throws {
//    public static int divide (int a, int b) throws ArithmeticException{
//        //code by adnan
//        int c = a/b;
//        return c;
//    }
//    public static double area(int r) throws NegativeRadiusException{
//        if(r<0){
//            throw new NegativeRadiusException();
//        }
//        double radius = Math.PI * r * r;
//        return radius;
//    }
//
//    public static void main(String[] args) {
//
//        //code by farhan
//        try{
////            int d = divide(6,0);
////            System.out.println(d);
//            double ansOfArea = area(-12);
//            System.out.println(ansOfArea);
//        }
//        catch (Exception e){
//            System.out.println("Exception");
//        }
//    }
//}