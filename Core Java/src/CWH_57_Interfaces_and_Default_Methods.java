//interface camera{
//    void takesnap();
//    void recordvideo();
//}
//interface wifi{
//    String [] getNetworks();
//    void connectNetworks();
//}
//class cellphone {
//    void callnumber(int phoneNumber){
//        System.out.println("Calling............" + phoneNumber);
//    }
//    void pickcall(){
//        System.out.println("picking call...");
//    }
//}
//class mysmartphone extends cellphone implements wifi,camera{
//    public void takesnap(){
//        System.out.println("takesnap");
//    }
//    public void recordvideo(){
//        System.out.println("recordvideo");
//    }
//    String [] getNetworks() {
//        System.out.println("getting networks..");
//        String [] getnet = {"jio", "airtel", "vi"};
//        return getnet;
//    }
//    public void connectNetworks(){
//        System.out.println("connectingnetworks");
//    }
//}

interface Camera{
    void takePhoto();
    void recordVideo();
}
interface Wifi{
    String []networkName();
    void connectNetwork();
}
class telephone{
    void incoming(int number){
        System.out.println("Ringing... " + number);
//        System.out.println(number);
    }
    void outgoing(String Caller){
        System.out.println("Calling... " + Caller);
//        System.out.println(Caller);
    }
}

class SmartPhone extends telephone implements Wifi,Camera{
    public void takePhoto(){
        System.out.println("Take Photo");
    }
    public void recordVideo(){
        System.out.println("Record Video");
    }
    public String []networkName(){
        System.out.println("Network Name : ");
        String []nn = {"jio, ", "Airtel, ", "Vodafone"};
        return nn;
    }
    public void connectNetwork(){
        System.out.println("Connected Networks");
    }
}
public class CWH_57_Interfaces_and_Default_Methods {
    public static void main(String[] args){
//        mysmartphone msp = new mysmartphone();
//        msp.takesnap();
//        msp.recordvideo();
//        String []arr = msp.getNetworks();
//        for (String item: arr) {
//            System.out.println(item);
//        }
//
//
//        msp.connectNetworks();
//
//        msp.callnumber(915912210);
//        msp.pickcall();




        SmartPhone sp = new SmartPhone();
        sp.takePhoto();
        sp.recordVideo();

        String []arr = sp.networkName();
        for (String elm: arr){
            System.out.print(elm);
        }
        System.out.print(" are ");
        sp.connectNetwork();

        sp.incoming(4567);
        sp.outgoing("xyz");
    }
}
