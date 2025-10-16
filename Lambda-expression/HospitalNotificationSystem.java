import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Notification {
    String type;
    String message;

    Notification(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class HospitalNotificationSystem {
    public static void main(String[] args) {
        List<Notification> alerts = Arrays.asList(
                new Notification("Critical", "Patient oxygen level low"),
                new Notification("Normal", "Patient routine checkup"),
                new Notification("Emergency", "ICU alert: Immediate attention"),
                new Notification("Info", "System maintenance tonight")
        );

        // Predicate: show only critical and emergency alerts
        Predicate<Notification> importantAlerts =
                n -> n.type.equals("Critical") || n.type.equals("Emergency");

        List<Notification> filtered = alerts.stream()
                                            .filter(importantAlerts)
                                            .collect(Collectors.toList());

        System.out.println("🚨 Important Alerts:");
        filtered.forEach(System.out::println);
    }
}
