package drivers;

public class NoValidBrowserName extends RuntimeException {

    public NoValidBrowserName(String message){
        super(message);
    }
}
