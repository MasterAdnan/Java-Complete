class Ekclass{
    int a;
    Ekclass(int v){
        a = v;
    }

    public int getA() {
        return a;
    }

//    public int returnone(){
//        return 1;
//    }
}

public class CWH_47_This_and_SuperKey {
    public static void main(String[] args) {
        Ekclass e = new Ekclass(5);

        System.out.println(e.getA());
    }
}