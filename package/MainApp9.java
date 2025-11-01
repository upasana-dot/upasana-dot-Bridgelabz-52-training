import com.company.analytics.sales.*;
import com.company.analytics.hr.*;

public class MainApp {
    public static void main(String[] args) {
        new SalesReport().printReport();
        new EmployeeReport().printReport();
    }
}

