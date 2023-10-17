package A1017.test;

import java.util.Scanner;

public class ex66 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int total = 0;

        System.out.println("1+2+3+4+5... 해서 total 값이 hope 값과 같거나 크면 출력한다.");
        System.out.print("원하는 값의 숫자를 입력해 주세요.: ");

        int hope = scan.nextInt();

        boolean run = true;

        while (run) {
            for (int i = 0; i < 987654321; i++) {
                total += i;
                System.out.println(i + "를 더한다. => " + total);
                if (total >= hope) {
                    run = false;
                    break;
                }
            }

        }

        System.out.println("희망값: " + hope);
        System.out.println("총합값: " + total);

    }
}
