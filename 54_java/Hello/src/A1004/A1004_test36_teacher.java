package A1004;

import java.util.Scanner;

public class A1004_test36_teacher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력해주세요> ");
        int n = scan.nextInt();
        System.out.println("두번째 숫자를 입력해주세요> ");
        int m = scan.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
