package A1004;

import java.util.Scanner;

public class A1004_test35_teacher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요> ");
        int num = scan.nextInt();
        int sum = 0;
        for (int i=1; i<=num; i++) {
            if(i%2 == 0) {
                sum += i;
                System.out.println(i + " ");
            }
            System.out.println();
            System.out.println("입력한 수는 1부터" +  num + "까지 더한 수" + sum);
        }


    }
}
