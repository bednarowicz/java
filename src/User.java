public class User {
    public  String userName;
    public  String password;

    public User(){
        System.out.println("Hello world z konstruktora");

    }
    public User(String userName, String password){
        System.out.println("Hello world z konstruktora");
        this.userName = userName;
        this.password = password;

    }

    public void sayHello(){
        System.out.println("Hello world " + userName);
    }
}
