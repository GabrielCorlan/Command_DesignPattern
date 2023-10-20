package smartLights;

public class IncreaseLightCommand implements ICommand {
    LightBulb bulb;

    public IncreaseLightCommand(LightBulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        bulb.increaseLight();
    }

    @Override
    public void unExecute() {
        bulb.decreaseLight();
    }
}
