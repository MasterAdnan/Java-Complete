//class MyMainEmployee{
//    private int id;
//    private String name;
//
//
//    public void setId(int i) { this.id = i; }
//    public int getid() { return id; }
//    public void setname(String n) { this.name = n; }
//    public String getname() { return name; }
//}
//
//
//public class CWH_42_Constructors {
//    public static void main(String[] args) {
//
//        MyMainEmployee adnan = new MyMainEmployee();
//
//        adnan.setId(213);
//        adnan.setname("addddd");
//
//    }
//}


class employee{
    private int id;
    private String name;

//    public employee(){
//        id = 4321;
//        name = "farhan";
//    }

    public employee(int ide, String naam){
        id = ide;
        name = naam;
    }

    public void setid(int i){
        id = i;
    }
    public int getid(){
        return id;
    }
    public void setname(String n){
        name = n;
    }
    public String getname(){
        return name;
    }
}


public class CWH_42_Constructors {
    public static void main(String[] args) {
        employee addu = new employee(2580,"aasim");




//        addu.setname("adnan");
//        addu.setid(1234);

        System.out.println(addu.getname());
        System.out.println(addu.getid());
    }
}
