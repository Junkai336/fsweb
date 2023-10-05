package A1005;

public class ArrayInitializationExample {
    public static void main(String[] args) {
        // int 배열 선언
        int[] scores = new int[] {};

        // scores = new int[] {1};

        // 배열 출력 (초기화된 값)
        for (int i = 0; i < 3; i++) {
            System.out.println("scores[" + i + "] = " + scores[i]);
        }
    }
}
