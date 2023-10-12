package A1011;

public class Ex59 {
    public static void main(String[] args) {
        int[] lotto = { 13, 23, 24, 35, 40, 45 };
        int bonus = 7;
        int[] myNumber = { 13, 23, 8, 35, 40, 45 };
        int count = 0;
        int bonusCount = 0;

        for (int i = 0; i < 6; i++) { // 내번호
            for (int j = 0; j < 6; j++) { // 당첨번호
                if (myNumber[i] == lotto[j]) {
                    count++;
                }
            }

            if (count == 6) {
                System.out.println("1등 당첨");
            } else if (count == 5) {
                for (int c = 0; c < 6; c++) {
                    if (myNumber[c] == bonus) {
                        bonusCount++;
                    }
                }
                if (bonusCount > 0) {
                    System.out.println("2등 당첨");
                } else {
                    System.out.println("3등 당첨");
                }

            } else if (count == 4) {
                System.out.println("4등 당첨");
            } else if (count == 3) {
                System.out.println("5등 당첨");
            } else {
                System.out.println("꽝");
            }

            // for(int a = 0; a < 6; a++) {
            // if(count == a) {
            // System.out.println((a) + "등 당첨");
            // return;
            // }
            // }

        }
    }
}
