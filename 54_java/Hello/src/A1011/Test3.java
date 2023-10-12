package A1011;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        // 60.
        Scanner scan = new Scanner(System.in);

        System.out.print("터미널 3개의 높이를 입력하세요 (예: 170 170 170): ");

        try {

            String terminal = scan.nextLine();

            String[] terminalHeight = terminal.split(" ");

            System.out.println(Arrays.toString(terminalHeight));

            int[] intArray = Arrays.stream(terminalHeight).mapToInt(Integer::parseInt).toArray();

            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] >= 170) {
                    System.out.println((i + 1) + "번째 터미널에서 충돌 발생");
                    return;
                }
            }

            System.out.println("PASS!");

        } catch (Exception e) {
            System.out.println("잘못된 입력");
        }

    }

}
