package A1007;

import java.util.Scanner;

public class Ex43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("한글로 변환할 수를 입력하세요.: ");
        int number = scan.nextInt();

        int[] nums = new int[5];
        // 12345 일만이천 삼백사십 오
        nums[0] = number / 10000; // 만의 자리 수
        nums[1] = (number / 1000) % 10; // 천의 자리 수
        nums[2] = (number / 100) % 10; // 백의 자리 수
        nums[3] = (number / 10) % 10; // 십의 자리 수
        nums[4] = number % 10; // 일의 자리 수

        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);

        String sum_str = "";
        for (int i = 0; i < 5; i++) {
            if (nums[i] == 1) {
                sum_str += "일";
            } else if (nums[i] == 2) {
                sum_str += "이";
            } else if (nums[i] == 3) {
                sum_str += "삼";
            } else if (nums[i] == 4) {
                sum_str += "사";
            } else if (nums[i] == 5) {
                sum_str += "오";
            } else if (nums[i] == 6) {
                sum_str += "육";
            } else if (nums[i] == 7) {
                sum_str += "칠";
            } else if (nums[i] == 8) {
                sum_str += "팔";
            } else if (nums[i] == 9) {
                sum_str += "구";
            }

            if(i==0 && nums[0]>=1) { // 첫 자리수에 숫자가 있다면,
                sum_str += "만";
            }
            if(i==1 && nums[1]>=1) {
                sum_str += "천";
            }
            if(i==2 && nums[2]>=1) {
                sum_str += "백";
            }
            if(i==3 && nums[3]>=1) {
                sum_str += "십";
            }

            System.out.println(sum_str);
        }

    }

}