package smartLights;

public class TestClient {
    public static void main(String[] args) {

        LightBulb bulb = new LightBulb();

        RemoteControl remote = new RemoteControl(new IncreaseLightCommand(bulb), new DecreaseLightCommand(bulb), new LightOnCommand(bulb), new LightOffCommand(bulb));

        remote.pressOn();
        remote.pressDown();
        remote.pressUp();
        remote.pressOff();


    }
}
