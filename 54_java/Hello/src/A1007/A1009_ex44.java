package A1007;

import java.util.Scanner;

public class A1009_ex44 {
    public static void main(String[] args) {
        // 월, 수, 금, 일 아르바이트를 간다.
        Scanner scan = new Scanner(System.in);
        System.out.print("1.월요일2,화요일3,수요일4,목요일5,금요일6,토요일7,일요일>");
        
        float num = scan.nextFloat();
        
        if(num == 1) {
            System.out.println("oh my god");
        }if(num<=7 && num>=2) {
            System.out.println("enjoy");
        }else {
            System.out.println("잘못입력했습니다.");
        }
	}
}


