public class AppChecker {
    public static void main(String[] args) {
        AndroidApp android = new AndroidApp("Android");
        AppleApp apple = new AppleApp("Apple");

        android.RunAndroidApp();
        apple.runAppleApp();
    }
}
