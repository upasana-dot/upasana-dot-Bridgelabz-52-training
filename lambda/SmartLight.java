package lambda;
interface LightAction {
    void execute();
}

public class SmartLight {
    public static void main(String[] args) {
        // Define different light behaviors using lambdas
        LightAction motionTrigger = () -> System.out.println("Light ON when motion detected");
        LightAction timeTrigger = () -> System.out.println("Light ON at sunset");
        LightAction voiceTrigger = () -> System.out.println("Light ON via voice command");

        // Execute them
        motionTrigger.execute();
        timeTrigger.execute();
        voiceTrigger.execute();
    }
}

