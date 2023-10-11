package A1010.test;

import java.util.Scanner;

public class Test_teacher {
    public static void main(String[] args) {

        // 52

        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int num = scan.nextInt();

        if (num == 11 || num == 12 || num == 13) {
            System.out.println(num + "th");
        } else if (num % 10 == 1) {
            System.out.println(num + "st");
        } else if (num % 10 == 2) {
            System.out.println(num + "nd");
        } else if (num % 10 == 3) {
            System.out.println(num + "rd");
        } else {
            System.out.println(num + "th");
        }

        // 53

        System.out.print("a의 값을 입력하세요: ");
        int a = scan.nextInt();
        System.out.print("b의 값을 입력하세요: ");
        int b = scan.nextInt();
        double[] numm = new double[4];
        double max = 0.0;
        numm[0] = a + b;
        numm[1] = a - b;
        numm[2] = a * b;
        numm[3] = a / b;

        for (int i = 0; i < numm.length; i++) {
            if (max < numm[i]) {
                max = numm[i];
            }
        }

        System.out.println("최대값은 : " + (int) max);

        // 54

        System.out.print("a값 입력: ");
        int aa = scan.nextInt();
        System.out.print("b값 입력: ");
        int bb = scan.nextInt();
        int x = 0;

        if(b%a==0){
            x = bb/aa;
            System.out.println(aa+ " * " + x + " = " + bb);
        } else if(aa%bb==0) {
            x = aa/bb;
            System.out.println(bb+ " * " + x + " = " + aa);
        } else {
            System.out.println("none");
        }

    }
}
