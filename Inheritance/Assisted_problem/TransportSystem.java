package Assisted_problem;
class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Vehicle with speed: " + maxSpeed + " km/h, Fuel: " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("Car - Speed: " + maxSpeed + ", Fuel: " + fuelType + ", Seats: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    int loadCapacity;

    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("Truck - Speed: " + maxSpeed + ", Fuel: " + fuelType + ", Load: " + loadCapacity + "kg");
    }
}

class Motorcycle extends Vehicle {
    String type;

    Motorcycle(int maxSpeed, String fuelType, String type) {
        super(maxSpeed, fuelType);
        this.type = type;
    }

    @Override
    void displayInfo() {
        System.out.println("Motorcycle - Speed: " + maxSpeed + ", Fuel: " + fuelType + ", Type: " + type);
    }
}

public class TransportSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car(180, "Petrol", 5),
            new Truck(120, "Diesel", 10000),
            new Motorcycle(150, "Petrol", "Sports")
        };

        for (Vehicle v : vehicles) {
            v.displayInfo(); // polymorphism
        }
    }
}

