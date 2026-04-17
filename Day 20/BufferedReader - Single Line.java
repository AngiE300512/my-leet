import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
          // Code snippet from diagram
              int ch = br.read();
              System.out.println((char) ch);

// Overridden by:
String s = br.readLine();
System.out.println(s);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
