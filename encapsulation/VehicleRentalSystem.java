// Interface for Insurable
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract Vehicle Class
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);

    public void displayVehicle() {
        System.out.println("Number: " + vehicleNumber + ", Type: " + type + ", Rate: " + rentalRate);
    }
}

// Car
class Car extends Vehicle implements Insurable {
    public Car(String num, double rate) { super(num, "Car", rate); }

    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days; }

    @Override
    public double calculateInsurance() { return 500; }

    @Override
    public String getInsuranceDetails() { return "Car Insurance ₹500"; }
}

// Bike
class Bike extends Vehicle implements Insurable {
    public Bike(String num, double rate) { super(num, "Bike", rate); }

    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days; }

    @Override
    public double calculateInsurance() { return 200; }

    @Override
    public String getInsuranceDetails() { return "Bike Insurance ₹200"; }
}

// Truck
class Truck extends Vehicle implements Insurable {
    public Truck(String num, double rate) { super(num, "Truck", rate); }

    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days; }

    @Override
    public double calculateInsurance() { return 1000; }

    @Override
    public String getInsuranceDetails() { return "Truck Insurance ₹1000"; }
}

// Main
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("C101", 2000),
            new Bike("B201", 500),
            new Truck("T301", 5000)
        };

        for (Vehicle v : vehicles) {
            v.displayVehicle();
            System.out.println("Rental for 3 days: " + v.calculateRentalCost(3));
            if (v instanceof Insurable) {
                System.out.println(((Insurable) v).getInsuranceDetails() + " | Cost: " + ((Insurable) v).calculateInsurance());
            }
            System.out.println("------------------");
        }
    }
}

