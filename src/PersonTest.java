public class PersonTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher();
        teacher.name = "Tom";
        teacher.age = 29;
        teacher.walk();
        teacher.teachMath();
        teacher.eat();
        teacher.sayHello();

        Footballer footballer = new Footballer();
        footballer.name = "Footballer";
        footballer.age = 23;
        footballer.fotballClub = "Klub sportowy";
        footballer.walk();
        footballer.playFootball();
        footballer.eat();
    }
}
