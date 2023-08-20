package src;

public class InkrementacjaDekrementacja {
    public static void main(String[] args) {
        //inkrementacja
        int a =0;
        System.out.println("Wartość a:" + a); //0
        int b = a++;
        System.out.println("Wartość b:" + b); //0
        System.out.println("Wartość a" + a); //1
        int c = ++a;
        System.out.println("Wartość c: " + c); //2
        System.out.println("Wartość a: " + a); //2
        //int d = ++a + a++;
        //System.out.println("podwójna inkrementacja " + d + " waertosc a to " + a);
        //dekrementacja

        int d = 0;
        System.out.println("Wartosc d: " + d); //0
        int e = d--;
        System.out.println("Wartość e: " + e); //0
        System.out.println("Wartość d: " + d); //-1
        int f = --d;
        System.out.println("Wartość f: " + f); //-2
        System.out.println("Wartość d: " + d); //-2
    }
}
