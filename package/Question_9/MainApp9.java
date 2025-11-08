import com.company.analytics.sales.*;
import com.company.analytics.hr.*;

public class MainApp9 {
    public static void main(String[] args) {
        new SalesReport().printSales();
        new EmployeeReport().printEmployeePerformance();
    }
}
