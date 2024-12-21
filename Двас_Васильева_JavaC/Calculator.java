public class Calculator {
    public native void Calculate(int a, int b);

    static {
        System.loadLibrary("Calculator");
    }
    public static void main(String args[]){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        new Calculator().Calculate(a,b);
    }
}
