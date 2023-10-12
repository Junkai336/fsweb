package A1012;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        // 62

        Scanner scan = new Scanner(System.in);

        int[] student = new int[3];
        // String[] student = new String[3];

        System.out.print("학년을 입력하시오: ");
        student[0] = scan.nextInt();
        // student[0] = scan.nextLine();
        System.out.print("반을 입력하시오: ");
        // student[1] = scan.nextLine();
        student[1] = scan.nextInt();
        System.out.print("번호를 입력하시오: ");
        // student[2] = scan.nextLine();
        student[2] = scan.nextInt();


        // 배열이 공백일 때 break? (char 배열에 공백 생김 ^[0-9]와 ^[0-9 ]의 차이?)
        
        // String check = Arrays.toString(student).replaceAll("[^0-9 ]", "");
        // char[] check2 = check.toCharArray();
        
        // System.out.println(Arrays.toString(check2));

        // for (int i = 0; i < check2.length; i++) {
        //     if (check2[i] < 48 || check2[i] > 57) {
        //         System.out.println("숫자를 입력해 주세요");
        //         return;
        //     }
        // }

        // int[] student2 = Arrays.stream(student).mapToInt(Integer::parseInt).toArray();

        if (student[0] > 3) {
            System.out.println("(학년) 잘못된 정보입니다. (3이하로 입력)");
            return;
        } else if (student[1] > 20) {
            System.out.println("(반) 잘못된 정보입니다. (20이하로 입력)");
            return;
        } else if (student[2] > 999) {
            System.out.println("(번호) 잘못된 정보입니다. (999이하로 입력)");
            return;
        }

        System.out.printf("학년:%01d, 반:%02d, 번호:%03d", student[0], student[1], student[2]);
        System.out.printf("\n%01d%02d%03d", student[0], student[1], student[2]);

    }
}
