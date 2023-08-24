public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        User user2 = new User("hello", "Rafał");
        System.out.println(user2.userName);
        System.out.println(user2.password);

    }
}
