package A1020.Ram;

interface Calculator {
    int sum(int a, int b);
}

public class Ram3 {
    public static void main(String[] args) {
        // Calculator mc = (int a, int b) -> a+b;
        Calculator mc = Integer::sum;
        int result = mc.sum(3, 4);
        System.out.println(result);
    }
}
