package lambda;
import java.util.*;
import java.util.function.Predicate;

public class NotificationFilter {
    public static void main(String[] args) {
        List<String> alerts = Arrays.asList(
            "High Blood Pressure Alert",
            "Appointment Reminder",
            "Critical Condition Alert",
            "Diet Plan Update"
        );

        Predicate<String> criticalFilter = alert -> alert.contains("Critical");
        Predicate<String> reminderFilter = alert -> alert.contains("Reminder");

        System.out.println("Critical Alerts:");
        alerts.stream().filter(criticalFilter).forEach(System.out::println);

        System.out.println("\nReminders:");
        alerts.stream().filter(reminderFilter).forEach(System.out::println);
    }
}

