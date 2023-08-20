package src;

//operatory matematyczne umozliwiaja wykonanie podstawowych operacji matematycznych
public class OperatoryMatetamatyczne {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.00F;

        int addition = firstNumber + secondNumber; // 10
        int substraction = firstNumber - secondNumber; // -2
        int multiplication = firstNumber * secondNumber; // 24
        float division = thirdNumber / secondNumber; // 0,66 -> 0
        int mod = secondNumber % firstNumber; // 2

        System.out.println("Suma z dodawania to " + addition );//
        System.out.println("Różnica to " + substraction);
        System.out.println("Mnożenie to " + multiplication);
        System.out.println("Dzielenie to " + division);
        System.out.println("Modulo to " + mod);

        System.out.println("\nfirstNumber po inkrementacjach itd: ");
        firstNumber+=secondNumber ; //10
        System.out.println("Suma z dodawania to " +  firstNumber );//10
        firstNumber-=secondNumber;
        System.out.println("Różnica to " +  firstNumber); //4
        firstNumber*=secondNumber;
        System.out.println("Mnożenie to " +  firstNumber); //24
        firstNumber/=secondNumber;
        System.out.println("Dzielenie to " +  firstNumber); //4
        firstNumber%=secondNumber;
        System.out.println("Modulo to " +  firstNumber); //4
    }
}
