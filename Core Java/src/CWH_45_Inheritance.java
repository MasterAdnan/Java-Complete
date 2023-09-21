class Animal{
    private String name;
    public void setname(String n){
        this.name = n;
    }
    public String getname(){
        return name;
    }
}

class derived extends Animal{
    private int id;
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
    public void print(){
        System.out.println("hello world");
    }
}

public class CWH_45_Inheritance {
    public static void main(String[] args) {
        Animal an = new Animal();

        an.setname("tommy");
        System.out.println(an.getname());

        derived d = new derived();

        d.setname("a");
        System.out.println(d.getname());
        d.setId(234);

        System.out.println(d.getId());
    }
}
