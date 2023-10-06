package A1006;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

        // 10진수 8진수 바꾸기

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        // %o : 8진수
        // %x : 16진수
        System.out.printf("%o", num);
        System.out.println();
        System.out.printf("%x", num);

    }
}
