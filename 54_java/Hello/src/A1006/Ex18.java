package A1006;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        /*
         * 
         * 문제 20
         * 
         * 정수 세 개를 입력받아 합과 평균을 출력하는 프로그램을 작성해보자.
         * (단, -2147483648 ~ 2147483647)
         * 
         * 입력
         * 
         * 정수 세 개가 입력된다.
         * (단, -2147483648 ~ 2147483647)
         * 
         * 출력
         * 
         * 입력 받은 정수 세 개의 합과 평균을 줄을 바꿔 출력한다.
         * 평균은 소수점 이하 둘째 자리에서 반올림하여 첫째 자리까지 출력한다.
         * 
         * 입력 예시
         * 
         * 1
         * 
         * 2
         * 
         * 3
         * 
         * 출력 예시
         * 
         * 6
         * 
         * 2.0
         */

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int plus = (a+b+c);
        double average = ((double) a+b+c) / 3;

        System.out.println("합: " + plus);
        System.out.printf("평균: %.1f", average);

    
    }
}
