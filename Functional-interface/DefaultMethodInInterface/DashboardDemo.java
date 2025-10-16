interface VehicleDashboard {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery level: 80%");
    }
}

class PetrolCar implements VehicleDashboard {
    public void displaySpeed() {
        System.out.println("Speed: 100 km/h");
    }
}

class ElectricCar implements VehicleDashboard {
    public void displaySpeed() {
        System.out.println("Speed: 90 km/h");
    }
}

public class DashboardDemo {
    public static void main(String[] args) {
        VehicleDashboard ev = new ElectricCar();
        ev.displaySpeed();
        ev.displayBattery();
    }
}
