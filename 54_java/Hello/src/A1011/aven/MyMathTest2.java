package A1011.aven;

public class MyMathTest2 {
    public static void main(String[] args) {
        MyMath2 myMath = new MyMath2();
        System.out.println(myMath.max(1.23, 3.45));
        System.out.println(myMath.min(1.23, 3.45));
    }
}

class MyMath2 {
    double max(double a, double b) {
        return (a > b) ? a : b;
    }

    double min(double a, double b) {
        return (a < b) ? a : b;
    }
}