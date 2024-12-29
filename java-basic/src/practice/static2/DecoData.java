package practice.static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void main(String[] args) {

        staticValue++;

    }

    public static void staticCall() {
        staticValue++;
        staticMethod();
    }

    public void instanceCall() {
        instanceValue++;
    }

    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}
