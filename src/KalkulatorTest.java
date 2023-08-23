import java.util.Scanner;
public class KalkulatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalk = new Kalkulator();

        System.out.println("Podaj liczbę całkowitą a : ");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbę całkowitą b: ");
        int b = scanner.nextInt();

        System.out.println("Suma z dodawania to " + kalk.dodawanie(a,b));
        System.out.println("Różnica z odejmowania " + kalk.odejmowanie(a,b));
        System.out.println("Suma z mnożenia " + kalk.mnozenie(a,b));
        System.out.println("Wynik z dzielenie " + kalk.dzielenie(a,b));
        System.out.println("Wynik z modulo " + kalk.modulo(a,b));


    }

}