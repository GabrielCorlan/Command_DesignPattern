package smartLights;

public class LightOffCommand implements ICommand {

    LightBulb bulb;

    public LightOffCommand(LightBulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        bulb.off();
    }

    @Override
    public void unExecute() {
        bulb.on();
    }
}
