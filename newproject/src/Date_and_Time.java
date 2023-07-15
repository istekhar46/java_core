import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date_and_Time {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());

            System.out.println(GregorianCalendar.HOUR_OF_DAY + ":" + GregorianCalendar.MINUTE + ":" + GregorianCalendar.SECOND);
    }
}
