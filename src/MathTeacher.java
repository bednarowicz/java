public class MathTeacher extends Person{
    public  String school;

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
