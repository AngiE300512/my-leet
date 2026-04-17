import java.nio.file.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Path p = Paths.get("test1.txt");
            
            Files.writeString(p, "bye");
            
            String s = Files.readString(p);
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
