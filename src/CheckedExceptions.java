import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

    public static void main(String[] args) {
        try{
            System.out.println("Przed otwarciem pliku");
            readFile("C:\\Users\\Rafi\\Desktop\\java2\\src\\tests.txt");
        } catch ( FileNotFoundException e) {
            System.out.println("Wyjątek został wyrzucony");
            System.out.println(e.getMessage());
           // e.printStackTrace();
        } finally {
            System.out.println("Zamykamy plik.");
        }

    }
    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);

    }
}
