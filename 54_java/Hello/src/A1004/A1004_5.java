package A1004;

public class A1004_5 {
    public static void main(String[] args) {
        for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
            System.out.println(x);
        }

        for(int x=1; x<=10; x++) {
        System.out.println(x/10.0f);
        System.out.println(((float) x/10.0f));
        }
    }
}
