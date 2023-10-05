package A1004;

import java.util.Scanner;

public class A1004_test37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        int i = 1;
        int c = 1;
        int j = 1;

        for (i = 1; i <= input; i++) {
            System.out.print("*");
            if(i==input) {
                System.out.println();
            }
        }

        for (j = 1; j <= input; j++) {
            System.out.print("*");
        }


    }
}
