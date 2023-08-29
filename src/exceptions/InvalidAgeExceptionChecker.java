package exceptions;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class InvalidAgeExceptionChecker {
    public static void main(String[] args) throws InvalidAgeException {
        System.out.println("Proszę podać wiek użytkownika: ");
        try {
            Scanner scanner = new Scanner(System.in);
            int wiek = scanner.nextInt();
            if (wiek <= 0){
                throw new  InvalidAgeException("Użytkownik musi miec wiecej niż 0 lat");
            } else if ( wiek < 18) {
                System.out.println("Użytkownik nie jest pełnoletni.");
            } else if (wiek >110){
                System.out.println("Zwykle ludzie tyle nie żyją.");
            } else {
                System.out.println("Użytkownik jest pełnoletni.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Prawdopodobnie niepoprawnie podany wiek");
            e.printStackTrace();
        }

    }
}
