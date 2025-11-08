import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
interface DateUtils{
    static String formatDate(LocalDate date, String pattern){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}
public class DateFormatter{
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 6, 15);
        String formattedDate = DateUtils.formatDate(date, "dd/MM/yyyy");
        System.out.println("Formatted Date: " + formattedDate);
    }
}