package textFile_Project;

public class OpenFileCommand implements Command {

    TextFile file;

    public OpenFileCommand(TextFile file) {
        this.file = file;
    }

    @Override
    public void execute() {
        file.open();
    }
}
