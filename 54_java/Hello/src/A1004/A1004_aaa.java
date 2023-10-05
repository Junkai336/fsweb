package A1004;

import java.util.Scanner;

public class A1004_aaa {
    public static void main(String[] args) {

        // 스캐너 선언
        Scanner scanner = new Scanner(System.in);

        // true면 실행
        boolean run = true;

        // 잔고
        int balance = 10000;

        while (run) {
            System.out.println("----------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("----------------------------");
            System.out.print("선택");

            String input = scanner.nextLine();

            if (input.equals("1")) {

                System.out.println("얼마를 예금하시겠습니까?");
                String inputTrade = scanner.nextLine();
                balance += Integer.parseInt(inputTrade);
                System.out.println("예금 후 잔고액 : " + balance + " 원");
                // input = "0";

            } else if (input.equals("2")) {

                System.out.println("얼마를 출금하시겠습니까?");
                String inputTrade = scanner.nextLine();
                balance -= Integer.parseInt(inputTrade);
                System.out.println("출금 후 잔고액 : " + balance + " 원");

            } else if (input.equals("3")) {

                System.out.println("잔고액 : " + balance + " 원");

            } else if (input.equals("4")) {

                System.out.println("프로그램을 종료합니다.");
                run = false;
                scanner.close();
            }

        }
    }
}
