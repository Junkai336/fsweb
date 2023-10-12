package A1012;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        // 63
        Scanner scan = new Scanner(System.in);

        System.out.print("일(day)을 입력하세요: ");
        
        int day = scan.nextInt();
        
        System.out.println("시간: " + (day * 24));
        
        // 64
        
        System.out.print("피제수를 입력하세요: ");
        int a = scan.nextInt();
        System.out.print("제수를 입력하세요: ");
        int b = scan.nextInt();

        System.out.println(a % b);

        // 65

        System.out.print("숫자를 몇까지 출력할 건가요?: ");
        int game = scan.nextInt();

        for(int i=0; i<game; i++) {
            if(i != 0 && i % 3 == 0) {
                System.out.print("X ");
            } else {
                System.out.print(i + " ");
            }
        }

    }
}
