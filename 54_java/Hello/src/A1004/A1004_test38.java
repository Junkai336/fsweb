package A1004;

import java.util.Scanner;

public class A1004_test38 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;

        System.out.print("삼각형의 밑변은?");
        a = scanner.nextInt();
        System.out.print("삼각형의 높이는?");
        b = scanner.nextInt();

        System.out.println("삼각형의 밑변 : " + a + " 삼각형의 높이 : " + b);
        System.out.println("삼각형의 넓이 : " + (double) a * (b / 2));

        scanner.close();

    }
}
