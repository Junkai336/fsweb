package A1011;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] lottoWin = { "13", "23", "24", "35", "40", "45" };
        String[] lottoWinBonus = { "7" };

        System.out.print("로또 번호 6자리를 입력해 주세요 (당첨번호: 13 23 24 35 40 45 + 7) : ");
        String lottoInput = scan.nextLine();

        String[] lotto = lottoInput.split(" ");

        System.out.println(Arrays.toString(lotto));

        int result = 0;
        int bonus = 0;

        for (int i = 0; i < lotto.length; i++) {
            for (int j = 0; j < lottoWin.length; j++) {
                if (lotto[i].equals(lottoWin[j])) {
                    result += 1;
                }
                if (lotto[i].equals(lottoWinBonus[0])) {
                    bonus = 1;
                }
            }
        }

        System.out.println("일치 번호 갯수: " + result);
        System.out.println("보너스 번호 일치 갯수: " + bonus);
        // 보너스 번호는 2등, 3등에만 영향을 준다.

        switch (result) {
            case 0:
            case 1:
            case 2:
                System.out.println("꽝");
                break;
            case 3:
                System.out.println("5등");
                break;
            case 4:
                System.out.println("4등");
                break;
            case 6:
                System.out.println("1등");
                break;
        }

        if (result == 5 && bonus == 0) {
            System.out.println("3등");
        } else if (result == 5 && bonus == 1) {
            System.out.println("2등");
        }

    }
}