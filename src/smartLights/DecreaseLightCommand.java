package smartLights;

public class DecreaseLightCommand implements ICommand{

    LightBulb bulb;

    public DecreaseLightCommand(LightBulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        bulb.decreaseLight();
    }

    @Override
    public void unExecute() {
        bulb.increaseLight();
    }
}
