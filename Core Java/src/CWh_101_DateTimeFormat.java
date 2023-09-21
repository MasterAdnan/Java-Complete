import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CWh_101_DateTimeFormat {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String myDate = ldt.format(dtf);
        System.out.println(myDate);
    }
}
