public class App {
    public String name;

    public App(String name){
        this.name = name;
        System.out.println("Konstruktor App");
    }
    public void AppInfo(){
        System.out.println("I am printing AppInfo for App: " + name);
    }
}
