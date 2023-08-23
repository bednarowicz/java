public class User {
    public  String userName;
    public  String password;

    public User(){
        System.out.println("Hello world z konstruktora");

    }
    public User(String user, String pass){
        System.out.println("Hello world z konstruktora");
        userName = user;
        password = pass;

    }

    public void sayHello(){
        System.out.println("Hello world " + userName);
    }
}
