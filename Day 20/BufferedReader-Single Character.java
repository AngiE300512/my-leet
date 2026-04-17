import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            int ch = br.read();
            System.out.println((char) ch);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
