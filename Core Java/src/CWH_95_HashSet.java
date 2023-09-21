import java.util.HashSet;

public class CWH_95_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(4);
        hs.add(6);
        hs.add(3);
        hs.add(2);
        System.out.println(hs);
        hs.add(9);
        hs.add(5);

        System.out.println(hs);
    }
}
