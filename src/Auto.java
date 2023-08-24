public class Auto {
    public Auto(){

    }
    public Auto(String marka, String model, Integer przebieg, Integer rok){
        this.marka = marka;
        this.model = model;
        this.przebieg = przebieg;
        this.rok = rok;
    }
    public String marka;
    public  String model;
    public Integer przebieg;
    public Integer rok;
    public void jedz(){
        System.out.println("Jade!");
    }
    public void hamuj(){
        System.out.println("Hamuje.");
    }
    public void info(){
        System.out.println("Jedzie samochod o marce " + marka);
        System.out.println("Jedzie samochod o modelu " + model);
        System.out.println("Jedzie samochod o przebiegu" + przebieg);
        System.out.println("Jedzie samochod z roku " + rok);
    }
}
