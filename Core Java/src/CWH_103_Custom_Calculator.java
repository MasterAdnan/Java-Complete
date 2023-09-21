class InvaidInputException extends Exception {
    @Override
    public String toString() {
        return "You cannot 8 and 9";
    }
}
class CannotDivideByZeroException extends Exception {
    @Override
    public String toString() {
        return "you cannot initial 0 in b";
    }
}
class MaxInputException extends Exception {
    @Override
    public String toString() {
        return "You cannot give 100000 BELOW NUMBER";
    }
}
class MaxMultiplyInputException extends Exception {
    @Override
    public String toString() {
        return "Input cannot be greater than 7000";
    }
}
class customCalculator {
    int c = 100000;
    double add(double a, double b) throws InvaidInputException, MaxInputException{
        if(a>c || b>c){
            throw new MaxInputException();
        }
        if(a==8 || b==9){
            throw new InvaidInputException();
        }
        return a+b ;
    }
    double Subtract(double a, double b) throws MaxInputException {
        if(a>c || b>c){
            throw new MaxInputException();
        }
        return a-b ;
    }
    double Multiply(double a, double b) throws MaxInputException, MaxMultiplyInputException {
        if(a>c || b>c){
            throw new MaxInputException();
        }
        else if(a>7000 || b>7000){
            throw new MaxMultiplyInputException();
        }
        return a*b ;
    }
    double divide(double a, double b) throws CannotDivideByZeroException, MaxInputException {
        if(a>c || b>c){
            throw new MaxInputException();
        }
        if(b==0){
            throw new CannotDivideByZeroException();
        }
        return a/b ;
    }
}
public class CWH_103_Custom_Calculator {
    public static void main(String[] args) throws InvaidInputException, CannotDivideByZeroException, MaxInputException, MaxMultiplyInputException {

        customCalculator cc = new customCalculator();
        System.out.println(cc.add(7,2));
        System.out.println(cc.divide(10,4));
        System.out.println(cc.add(12000,600000));
        System.out.println(cc.Multiply(10000,500));
    }
}


