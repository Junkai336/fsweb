package A1011;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 56
        Scanner scan = new Scanner(System.in);

        System.out.print("윷 4개의 상태를 입력하시오 1:뒤집 0:안뒤집 (예:1001): ");
        String yut = scan.nextLine();
        String[] array = new String[4];

        int result = 0;

        for (int i = 0; i < yut.length(); i++) {
            array[i] = yut.substring(i, i + 1);
            if (array[i].contains("1")) {
                result += 1;
            }
        }

        switch (result) {
            case 0:
                System.out.println("모");
                break;
            case 1:
                System.out.println("도");
                break;
            case 2:
                System.out.println("개");
                break;
            case 3:
                System.out.println("걸");
                break;
            case 4:
                System.out.println("윷");
                break;
        }

        System.out.println();

        // 57

        System.out.println("--메뉴를 2가지 고르시오--");
        System.out.println("--1.치즈버거(400kal), 2.야채버거(340kal), 3.우유(170kal), 4.계란말이(100kal), 5.샐러드(70kal)--");

        System.out.print("선택1: ");
        int menuSelect1 = scan.nextInt();
        System.out.print("선택2: ");
        int menuSelect2 = scan.nextInt();

        int[] menuSelect = { menuSelect1, menuSelect2 };
        int[] menuIndex = {1, 2, 3, 4, 5};
        int[] menuKal = { 400, 340, 170, 100, 70 };

        for (int i = 0; i < menuSelect.length; i++) {
            for (int j = 0; j < menuKal.length; j++) {
                if (menuSelect[i] == menuIndex[j]) {
                    menuSelect[i] = menuKal[j];
                }
            }
        }

        int total = menuSelect[0] + menuSelect[1];

        System.out.println(Arrays.toString(menuSelect));
        System.out.println(total);

        if (total > 500) {
            System.out.println("angry");
        } else {
            System.out.println("no angry");
        }

    }
}

// class MenuKal {
// int cheese = 400;
// int vegetable = 300;
// int milk = 170;
// int egg = 100;
// int salad = 70;
// }