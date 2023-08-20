package src;

public class OperatoryPrownania {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;

        boolean result = secondNumber > firstNumber;

        System.out.println(result);
        System.out.println(firstNumber < secondNumber); // T
        System.out.println(firstNumber >= secondNumber); // f
        System.out.println(firstNumber <= secondNumber); // t
        System.out.println(firstNumber == secondNumber); // f
        System.out.println(firstNumber != secondNumber); // T
    }
}
