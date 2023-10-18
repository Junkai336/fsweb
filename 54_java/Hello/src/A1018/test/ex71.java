package A1018.test;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class ex71 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        System.out.println("반복할 횟수를 정하면, 무작위로 2~10의 랜덤수(중복가능)가 출력된 뒤 합해진다.");
        System.out.print("반복할 횟수를 입력하시오: ");

        int input = scan.nextInt();
        int random;

        for (int i = 0; i < input; i++) {
            random = (int) (Math.random() * 12) + 1;
            arrayList.add(random);
        }

        System.out.println(arrayList);

        int sum = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }

        System.out.println(sum);
    }
}
