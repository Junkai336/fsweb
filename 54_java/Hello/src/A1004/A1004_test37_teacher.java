package A1004;

import java.util.Scanner;

public class A1004_test37_teacher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("한 변의 갯수를 입력해 주세요");
        int n = scan.nextInt();


        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
