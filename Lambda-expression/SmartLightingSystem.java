interface LightBehavior {
    void activate();
}

public class SmartLightingSystem {
    public static void main(String[] args) {
        LightBehavior motionSensor = () -> System.out.println("💡 Motion detected → Turning ON hallway lights!");
        LightBehavior timeBased = () -> System.out.println("🌇 Evening time → Turning ON outdoor lights!");
        LightBehavior voiceCommand = () -> System.out.println("🎙️ Voice command → Changing light color to warm white!");

        motionSensor.activate();
        timeBased.activate();
        voiceCommand.activate();
    }
}
