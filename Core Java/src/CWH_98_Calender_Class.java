import java.util.Calendar;
import java.util.TimeZone;

public class CWH_98_Calender_Class {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());

        Calendar ca = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(ca.getCalendarType());
        System.out.println(ca.getTimeZone().getID());
    }
}
