package A1011.aven;

public class MyMathTest {
    public static void main(String[] args) {
        System.out.println(MyMath.max(1.23, 3.45));
        System.out.println(MyMath.min(1.23, 3.45));
    }
}

class MyMath {
    static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    static double min(double a, double b) {
        return (a < b) ? a : b;
    }
}
