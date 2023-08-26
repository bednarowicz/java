public class Footballer extends Person{
    public Footballer(String name, int age, String footballclub){
        super(name, age);
        this.fotballClub = footballclub;
        System.out.println("Jestem w konstruktorze footballer");
    }

    @Override
    public void eat() {
        System.out.println("I like healthy food.");
    }

    public String fotballClub;
    public  void playFootball(){
        System.out.println("I am playing football");
    }
}
