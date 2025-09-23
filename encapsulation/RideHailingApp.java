interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle: " + vehicleId + ", Driver: " + driverName + ", Rate: " + ratePerKm);
    }
}

class Car extends Vehicle implements GPS {
    private String location = "City Center";

    public Car(String id, String driver, double rate) { super(id, driver, rate); }

    @Override
    public double calculateFare(double distance) { return distance * 20; }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String newLocation) { location = newLocation; }
}

class Bike extends Vehicle implements GPS {
    private String location = "City Center";

    public Bike(String id, String driver, double rate) { super(id, driver, rate); }

    @Override
    public double calculateFare(double distance) { return distance * 10; }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String newLocation) { location = newLocation; }
}

class Auto extends Vehicle implements GPS {
    private String location = "City Center";

    public Auto(String id, String driver, double rate) { super(id, driver, rate); }

    @Override
    public double calculateFare(double distance) { return distance * 15; }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String newLocation) { location = newLocation; }
}

// Main
public class RideHailingApp {
    public static void main(String[] args) {
        Vehicle[] rides = {
            new Car("V101", "Alice", 20),
            new Bike("V102", "Bob", 10),
            new Auto("V103", "Charlie", 15)
        };

        for (Vehicle v : rides) {
            v.getVehicleDetails();
            System.out.println("Fare for 10 km: " + v.calculateFare(10));
            if (v instanceof GPS) {
                System.out.println("Current Location: " + ((GPS) v).getCurrentLocation());
                ((GPS) v).updateLocation("Airport");
                System.out.println("Updated Location: " + ((GPS) v).getCurrentLocation());
            }
            System.out.println("-------------------");
        }
    }
}
