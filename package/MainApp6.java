import com.company.hr.*;
import com.company.payroll.*;

public class MainApp6 {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Upasana", "AI", 60000);
        e1.display();
        Payroll p = new Payroll();
        p.calculateBonus(e1);
    }
}
