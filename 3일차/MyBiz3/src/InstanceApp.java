import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InstanceApp {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw1 = new PrintWriter("Test1.txt");
        pw1.write("hello!");
        pw1.close();

        PrintWriter pw2 = new PrintWriter("Test2.txt");
        pw2.write("world!");
        pw2.close();
    }
}
