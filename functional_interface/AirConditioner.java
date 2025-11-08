interface SmartDevice{
    void turnOn();
    void turnOff();
}
class Light implements SmartDevice{
    public void turnOn(){
        System.out.println("Light turned on");
    }
    public void turnOff(){
        System.out.println("Light turned off");
    }
}
class AirConditioner implements SmartDevice{
    public void turnOn(){
        System.out.println("Air Conditioner turned on");
    }
    public void turnOff(){
        System.out.println("Air Conditioner turned off");
    }
}
class TV implements SmartDevice{
    public void turnOn(){
        System.out.println("TV turned on");
    }
    public void turnOff(){
        System.out.println("TV turned off");
    }
}
public class Main{
    public static void main(String[] args) {
        SmartDevice d1= new Light();
        SmartDevice d2= new AirConditioner();
        SmartDevice d3= new TV();
        d1.turnOn(); d1.turnOff();
        d2.turnOn(); d2.turnOff();
        d3.turnOn(); d3.turnOff();             
    }
}
