import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Various_ways_of_creating_HashMap {
    public static HashMap<String, Integer> MarksMap;
    static {
        MarksMap = new HashMap<>();
        MarksMap.put("Adnan", 100);
    }

    public static void main(String[] args) {

        //1) Using HashMap:
        Map<String, Integer>     map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        //2) Static Way: Static HashMap
        System.out.print("2) ");
        System.out.println(Various_ways_of_creating_HashMap.MarksMap.get("Adnan"));

        //3) Immutable Map with single Entry
        System.out.print("3) ");
        Map<String, Integer> map3 = Collections.singletonMap("Test", 300);
        System.out.println(map3.get("Test"));

        //4) Included in JDK 8:
        // CREATING ONE 2D ARRAY of string and using stream and collections in the form map.
        System.out.print("4) ");
        Map<String, String> map4 = Stream.of(new String[][]{
                {"Tom", "A Grade"},
                {"Addu", "A+ Grade"},
                {"Faru", "A++ Grade"}
        }).collect(Collectors.toMap(data -> data[0], data -> data[1]));

        System.out.println(map4.get("Addu"));

        // Using SimpleEntry:
        System.out.println("Using SimpleEntry :-");
        Map<String, String> map5 = Stream.of(
                new AbstractMap.SimpleEntry<>("Naveen" , "B Grade"),
                new AbstractMap.SimpleEntry<>("Adnan1" , "B+ Grade")
        ).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getKey));

        System.out.println(map5.get("Adnan1"));
    }
}
