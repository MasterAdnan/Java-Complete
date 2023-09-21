import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CWh_102_Advanced_Practice_Set {
    public static void main(String[] args) {

/*    Problem 1 :-
        ArrayList<String> al = new ArrayList<>();
        al.add("Adnan");
        al.add("Farhan");
        al.add("Thaseen");
        al.add("Afraz");
        al.add("Muddu");
        al.add("Thanzil");
        al.add("Abraar");
        al.add("Tabrez");
        al.add("Ali Jinnah");
        al.add("Eithisham");

        for (String Element : al) {
            System.out.println(Element);
        } ///       OR
        for (Object Element : al) {
            System.out.println(Element);
        }
 */

/*   Problem 2:-
        Date date = new Date();
        System.out.println(date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds());
 */

/*   Problem 3:-
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR)  + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)  + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
 */

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        Object myDate = dtf.format(ldt);
        System.out.println(myDate);


/*    Problem 5 :-
        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(1);
        s.add(2);
        s.add(2);
        System.out.println(s);
 */
    }
}
