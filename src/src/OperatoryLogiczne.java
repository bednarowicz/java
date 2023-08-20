package src;

public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = 2>1;
        boolean secondValue = 1>2;
        boolean thirdValue = false;
        boolean fourthValue = true;

        //&& true gdy obydwa wyrażenia mają wartość true
        System.out.println(firstValue && secondValue);
        System.out.println(firstValue && fourthValue);
        // || lub czyli true gdy którekolwiek wyrażenie składowe jest równe true
        System.out.println(firstValue || secondValue);
        System.out.println( secondValue || thirdValue);
        // ! negacja
        System.out.println(!firstValue);
        System.out.println(!secondValue);
        System.out.println(!(firstValue && secondValue));
    }
}
