package A0925;

import java.util.Scanner;

public class A0925_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int w = sc.nextInt();
        int r = p * w;

        for(int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            System.out.print(a-r + " ");
        }
    }
}