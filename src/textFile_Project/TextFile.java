package textFile_Project;

public class TextFile {

    String name;

    public TextFile(String name) {
        this.name = name;
    }

    public void open(){
        System.out.println("Opening the file " + name);
    }

    public void save(){
        System.out.println("Saving the file " + name);
    }
}
