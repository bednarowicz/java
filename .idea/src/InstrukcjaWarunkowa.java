public class InstrukcjaWarunkowa {
    public static void main(String[] args) {
        float dzielna = 10.0F;
        float dzielnik = 12.0F;
        if(dzielnik != 0){
            System.out.println("Wynik dzielenia to: " + dzielna/dzielnik);
        } else {
            System.out.println("Proszę podaj inną liczbę.");
        }
    }
}
