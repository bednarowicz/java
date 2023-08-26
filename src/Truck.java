public class Truck implements Vehicle{

    @Override
    public void jazda(int speed) {
        System.out.println("Jadę ciężarówką z prędkością " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuje ciężarówkę naciskając na hamulec. ");

    }

    @Override
    public String info(){
        return "Ciężarówka";
    }
    public void zatankuj(){
        System.out.println("Amy mieć dużo siły muszę zjeść obiad.");
    }
}
