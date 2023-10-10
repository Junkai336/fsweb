package A1004;

import java.util.Scanner;

public class A1004_test33_if {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("원하시는 달을 입력하세요>");
        int month = scan.nextInt();

        if (month == 1 || month == 2 || month == 12) {
            System.out.println("winter");
        } else if (3 <= month && month <= 5) {
            System.out.println("spring");
        } else if (6 <= month && month <= 8) {
            System.out.println("summer");
        } else if (9 <= month && month <= 11) {
            System.out.println("fall");
        }

    }
}
