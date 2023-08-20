import java.util.Scanner;
public class PierwszaPracaDomowa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą a : ");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbę całkowitą b: ");
        int b = scanner.nextInt();

        System.out.println("Dodawanie " + (a + b));
        System.out.println("Odejmowanie " + (a - b));
        System.out.println("Mnożenie " + (a * b));
        System.out.println("Dzielenie " + (a / b));
        System.out.println("Modulo " + (a%b));


    }

}