package files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("C:\\Users\\Rafi\\Desktop\\java2\\src\\test.txt");
        writer.write("2nd try writing");
        //writer.flush();
        writer.close();
    }
}
