public class Student {
    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;
    public static  String nazwaUczelni = "Uczelnia";

    public void przedstawSie(){
        System.out.println("Nazywam się" + imie + " " + nazwisko + " .");
    }
    public void zalogujSie(){
        System.out.println("Twój numer indeksu to : " + nick);
    }

    public void podajNrIndeksu(){
        System.out.println("Twój numer Indeksu to : " + numerIndeksu);
    }
    public void podajEmail(){
        System.out.println("Mój email to : " + email);
    }
    public  static void infoUczelnia(){
        System.out.println("Osobnik uczęszczał do uczelni " + nazwaUczelni);
        druga();
    }
    public static void druga() {
        System.out.println("Jestem drugą metoda");
    }
}
