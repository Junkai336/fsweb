package A1017.test;

import java.util.Scanner;

public class ex67_teacher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("카운트 다운 시작할 숫자를 입력하세요: ");
        int a = scan.nextInt();
        int i = a;

        while (i > 0) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(i);
            i--;
        }

        System.out.println("종료합니다.");
    }
}
