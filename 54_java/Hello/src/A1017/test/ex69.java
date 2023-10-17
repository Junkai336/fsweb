package A1017.test;

import java.util.Scanner;

public class ex69 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("시작값: ");
        int start = scan.nextInt();
        System.out.print("등차값: ");
        int plus = scan.nextInt();
        System.out.print("몇번째?: ");
        int order = scan.nextInt();

        int total = start;

        for(int i = 1; i < order; i++) {
            total += plus;
        }
        System.out.println(total);
    }
}
