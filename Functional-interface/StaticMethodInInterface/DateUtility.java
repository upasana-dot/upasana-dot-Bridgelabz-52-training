import java.text.SimpleDateFormat;
import java.util.Date;

interface DateFormatter {
    static String format(Date date, String pattern) {
        return new SimpleDateFormat(pattern).format(date);
    }
}

public class DateUtility {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("Formatted Date: " + DateFormatter.format(now, "dd/MM/yyyy HH:mm:ss"));
    }
}
