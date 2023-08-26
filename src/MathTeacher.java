public class MathTeacher extends Person{
    public  String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        this.school = school;
        System.out.println("Jestem w konstruktorze MathTeacher.");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("I walk like a math teacher.");
    }

    public void teachMath(){
        eat();
        walk();
        System.out.println("I am teaching math!");
    }

    public void  sayHello(){
        System.out.println("Hello my name is " + name);
        System.out.println("I am " + age);
    }
}
