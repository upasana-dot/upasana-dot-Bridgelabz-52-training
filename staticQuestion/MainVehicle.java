class Vehicle {
    static double registrationFee = 1000;
    final String registrationNumber;
    String ownerName, vehicleType;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName + ", Type: " + vehicleType +
                               ", Reg No: " + registrationNumber +
                               ", Fee: " + registrationFee);
        }
    }
}

public class MainVehicle {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ajay", "Car", "REG101");
        Vehicle v2 = new Vehicle("Sneha", "Bike", "REG102");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(1200);
        System.out.println("Updated Fee: " + Vehicle.registrationFee);
    }
}
