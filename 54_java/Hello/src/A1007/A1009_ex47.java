package A1007;

import java.util.Scanner;

public class A1009_ex47 {
    public static void main(String[] args) {
        // 윤년판별
        System.out.println("연도를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {//해(year)가 4의 배수이면서 100의 배수가 아니면 윤년 또는 400의 배수이면 윤년.
			System.out.println(year + "년은 윤년");
		} else {//그외
			System.out.println(year + "년은 윤년아님");
		}
    }
}
