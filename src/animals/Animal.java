package animals;

public abstract class Animal {
    public abstract void sound();

    public final static int legs = 4;
    int test;

    public void sayHello() {
        System.out.println("Hello! I am an animal");
    }

}
