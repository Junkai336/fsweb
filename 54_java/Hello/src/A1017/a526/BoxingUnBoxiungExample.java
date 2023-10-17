package A1017.a526;

public class BoxingUnBoxiungExample {
    public static void main(String[] args) {
        // Boxing
        Integer obj = 100;
        System.out.println("value: " + obj.intValue());
        System.out.println("value: " + obj);

        // Unboxing
        int value = obj;
        System.out.println("value: " + value);

        // 연산시 Unboxing
        int result = obj + 100;
        System.out.println("result: " + result);
    }
}
