import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

public class completeDelegation {
    public static String completeDelegation(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
        System.out.println(line);
        reader.close();
        return line;
    }
    public static void main(String args[]) throws IOException {

        completeDelegation("\\Users\\Sultan of swing\\Desktop\\test.txt");

    }
}
