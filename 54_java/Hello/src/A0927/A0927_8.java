package A0927;

import java.util.Scanner;

public class A0927_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요.");
        String score_String = scanner.nextLine();
        int score_Int = Integer.parseInt(score_String);

        if (score_Int >= 90) {
            System.out.println("90점 이상입니다.");
        } else if (score_Int >= 80) {
            System.out.println("80점 이상입니다.");
        } else if (score_Int >= 70) {
            System.out.println("70점 이상입니다.");
        } else {
            System.out.println("70점 미만입니다.");
        }

    }
}
