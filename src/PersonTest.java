public class PersonTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 29, "Liceum 13");
        teacher.walk();
        teacher.teachMath();
        teacher.eat();
        teacher.sayHello();

        Footballer footballer = new Footballer("Footballer", 23, "Klub sportowy");
        footballer.walk();
        footballer.playFootball();
        footballer.eat();
    }
}
