package A1018.test;

import java.util.ArrayList;
import java.util.Scanner;

public class ex72_teacher {
    public static void main(String[] args) {
        int max = 0;
        Scanner scan = new Scanner(System.in);
        // ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList arr = new ArrayList<>();

        while (true) {
            System.out.println();
            System.out.print("숫자를 입력하세요: ");
            int num = scan.nextInt();
            System.out.println();
            if (num == 0) {
                break;
            }
            arr.add(num);
            for (int i = 0; i < arr.size(); i++) {
                if (max < (int) arr.get(i)) {
                    max = (int) arr.get(i);
                }
                System.out.println(", " + arr.get(i));
            }
            System.out.println();
            System.out.println("입력받은 숫자의 최대값은? " + max);
        }
    }
}
