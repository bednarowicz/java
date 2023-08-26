public class Footballer extends Person{
    public Footballer(String name, int age, String footballclub){
        super(name, age);
        this.fotballClub = footballclub;
        System.out.println("Jestem w konstruktorze footballer");
    }

    public String fotballClub;
    public  void playFootball(){
        System.out.println("I am playing football");
    }
}
