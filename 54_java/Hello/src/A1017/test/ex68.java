package A1017.test;

import java.util.Scanner;

public class ex68 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("정수를 입력 받으면 0부터 그 수 까지 출력한다.");
        System.out.print("정수를 입력하시오: ");

        int number = scan.nextInt();
        int count = 0;

        while (number > count) {
                count++;
                System.out.println("현재숫자:" + count + " 입력숫자: " + number);
        }

    }
}
