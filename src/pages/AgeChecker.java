package pages;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age: ");
        int age = scanner.nextInt();
        if( age < 18) {
            System.out.println("You are too young to buy alcohol");
        } else {
            System.out.println("Here you are");
        }

    }
}
