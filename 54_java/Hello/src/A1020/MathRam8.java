package A1020;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class MathRam8 {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;

        int result1 = add.operate(5, 3); // 결과 8
        int result2 = subtract.operate(5, 3); // 결과 2

        System.out.println("Additional Result: " + result1);
        System.out.println("Subtraction Result: " + result2);
    }
}
