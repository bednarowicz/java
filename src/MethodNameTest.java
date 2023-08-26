public class MethodNameTest {
    public static void main(String[] args) {
        MethodName methodName = new MethodName();
        methodName.add();
        methodName.add(Integer.toString(1));
        methodName.add("Hello");
        methodName.add(1, 2, 3);

    }
}

