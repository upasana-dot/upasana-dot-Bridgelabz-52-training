interface VehicleDashboard{
    void displaySpeed();
}
class CarDashboard implements VehicleDashboard{
    public void displaySpeed(){
        System.out.println("Car speed is 60 mph");
    }
}
class BikeDashboard implements VehicleDashboard{
    public void displaySpeed(){
        System.out.println("Bike speed is 40 mph"); 
    }
}