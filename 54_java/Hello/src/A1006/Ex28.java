package A1006;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        // 세 정수 a, b, c가 입력되었을 때, 짝수만 출력해보자

        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요> ");
        int a = scan.nextInt();
        System.out.print("정수를 입력하세요> ");
        int b = scan.nextInt();
        System.out.print("정수를 입력하세요> ");
        int c = scan.nextInt();
        
        if (a%2 == 0) {
            System.out.println(a);
        } 
        if (b%2 == 0) {
            System.out.println(b);
        } 
        if (c%2 == 0) {
            System.out.println(c);
        } 

        
    }
}
