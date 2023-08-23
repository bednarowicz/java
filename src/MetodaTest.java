public class MetodaTest {
    public static void main(String[] args) {
        Metody metody = new Metody();
        metody.policzWynik();
        int result = metody.pobierzWynik();
        System.out.println("Wynik w zmiennej pomnożony o 2 to " + (2*result));

        metody.policzWynikParam(50);

        metody.add(2 ,3);
        System.out.println(metody.add(4,5));
    }
}
