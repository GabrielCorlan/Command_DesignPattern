package smartLights;

public class RemoteControl {

    ICommand up;
    ICommand down;
    ICommand on;
    ICommand off;

    public RemoteControl(ICommand up, ICommand down, ICommand on, ICommand off) {
        this.up = up;
        this.down = down;
        this.on = on;
        this.off = off;
    }

    public void pressOn() {
        on.execute();
    }

    public void pressOff() {
        off.execute();
    }

    public void pressUp() {
        up.execute();
    }

    public void pressDown() {
        down.execute();
    }
}
