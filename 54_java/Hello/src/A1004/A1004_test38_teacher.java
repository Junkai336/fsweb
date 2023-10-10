package A1004;

import java.util.Scanner;

public class A1004_test38_teacher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("삼각형의 밑변을 입력해 주세요.");
        int a = scan.nextInt();
        System.out.print("삼각형의 밑변을 입력해 주세요.");
        int b = scan.nextInt();

        System.out.printf("삼각형의 넓이는?" + "%.1f", (float)(a*b)/2);
    }
}
