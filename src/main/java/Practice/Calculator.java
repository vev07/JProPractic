package Practice;

public class Calculator {
    public void sum(int a, int b) {
        System.out.println("Result int = " + (a +b));
    }
    public void sum(long a, long b) {
        System.out.println("Result long = " + (a +b));
    }
    public void sum(double a, double b) {
        System.out.println("Result double = " + (a +b));
    }

    public static void main(String[] args) {
        int q = 10;
        int w = 20;
        long x = System.nanoTime();
        long y = System.nanoTime();
        new Calculator().sum(q,w);
        new Calculator().sum(x,y);
    }
}
