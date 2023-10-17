package A1017.test;

import java.util.Scanner;

public class ex67 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.println("입력한 수에서 카운트 다운. 0이 되면 종료한다.");
        System.out.print("값을 입력해 주세요.: ");
        
        int count = scan.nextInt();

        for(int i = count; i > 0; i--) {
            System.out.println(i + "...");
        }

    }
}
