package A1006;

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        /*
         * 문제 29
         * 
         * 세 정수 a, b, c가 입력되었을 때,
         * 짝 even(짝)/odd(홀)을 출력해보자.
         * 
         * 입력
         * 
         * b, c 가 입력된다.
         * (0 ~ 2147483647)
         * 
         * 순서대로 even
         * 
         * 2
         * 
         * 8
         * 
         * 출력 예시
         * 
         * odd
         * 
         * even
         * 
         * even
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요> ");
        int a = scan.nextInt();
        System.out.print("정수를 입력하세요> ");
        int b = scan.nextInt();
        System.out.print("정수를 입력하세요> ");
        int c = scan.nextInt();

        if (a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        if (b % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        if (c % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
}
