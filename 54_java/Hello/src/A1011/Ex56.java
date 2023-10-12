package A1011;

import java.util.Scanner;

public class Ex56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] yutStates = new int[4];
        // 4가지 윷의 상태 입력
        for (int i = 0; i < yutStates.length; i++) {
            System.out.print((i+1) + "번째 윷의 상태: ");
            yutStates[i] = scanner.nextInt();
        }

        int flippedCount = 0;

        for (int state : yutStates) {
            if (state == 1) {
                flippedCount++;
            }
        }

        switch (flippedCount) {
            case 0:
                System.out.println("모");
                break;
            case 1:
                System.out.println("도");
                break;
            case 2:
                System.out.println("개");
                break;
            case 3:
                System.out.println("걸");
                break;
            case 4:
                System.out.println("윷");
                break;
            default:
                System.out.println("잘못된 입력");
        }
    }
}
