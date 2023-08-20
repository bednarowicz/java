public class TypyObiektowe {
    public static void main(String[] args) {
        // liczby stałoprzecinkowe
        Byte firstNumber = 127; // 1 bajt -128 do 127
        Short secondNumber = 32689; // 2 bajty -32768 do 32767
        Integer thirdNumber = 32768999; // 4 bajty -2 147 483 648 do 3 147 483 647
        Long fourthNumber = 214800L; // 8 bajtow - -2^63 do (2^63)-1

        //liczby zmiennoprzecinkowe
        Float fithNumber = 4.99934F; // 4 bajty max ok 6-7 liczb po przecinku
        Double sixthNumber = 3.9999999999999999; // 8 bajtow - max ok 15 cyfr po przecinku
        //wartość logiczna
        Boolean prawda = true;
        Boolean falsz = false;
        // pojedynczy znak
        String hello ="Hello rafal";

        System.out.println(hello.charAt(0));
    }
}
