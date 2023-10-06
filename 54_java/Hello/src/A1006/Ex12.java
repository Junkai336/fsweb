package A1006;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        /*
         * 
         * 
         * 문제 13 (난이도 중)
         * 
         * 실수(float) 한 개를 입력받아 소수점 이하 3째 자리에서 반올림 하여 2째 자리까지 출력하시오.
         * 
         * 입력
         * 
         * 실수 한 개가 입력된다.
         * 
         * 출력
         * 
         * 입력한 실수를 소수점 이하 3째 자리에서 반올림 하여 2째 자리까지 출력한다.
         * 
         * 
         * 입력 예시
         * 
         * 1.59254
         * 출력 예시
         * 
         * 1.59
         */

        Scanner scan = new Scanner(System.in);

        float num = scan.nextFloat();

        // System.out.printf("%.2f", num);        

        // num = (num + 0.005f);
        
        num = (num + 0.005f)*100;
        System.out.println(num);

        int i = (int) num;
        System.out.println(i);

        num = (float) i / 100;
        System.out.println(num);

    }
}
