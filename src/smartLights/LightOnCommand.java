package smartLights;

public class LightOnCommand implements ICommand {
    LightBulb bulb;

    public LightOnCommand(LightBulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        bulb.on();
    }

    @Override
    public void unExecute() {
        bulb.off();
    }
}
