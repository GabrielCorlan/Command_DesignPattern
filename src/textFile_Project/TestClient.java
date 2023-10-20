package textFile_Project;

public class TestClient {
    public static void main(String[] args) {

        TextFile file = new TextFile("MyFile1.txt");
        OfficeUI office = new OfficeUI();

        office.sendCommand(new OpenFileCommand(file));
        office.sendCommand(new SaveFileCommand(file));
    }

}
