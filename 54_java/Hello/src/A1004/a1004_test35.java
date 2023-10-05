package A1004;

public class a1004_test35 {
    public static void main(String[] args) {
        int even = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                even += i;
            }
        }
        System.out.println(even);

    }
}
