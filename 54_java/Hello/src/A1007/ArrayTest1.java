package A1007;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest1 {
    public static void main(String[] args) {
        /*
         * 문제 1: 배열에서 최대값 찾기
         * 주어진 정수 배열에서 최대값을 찾는 프로그램을 작성하세요.
         * int[] numbers = {5, 10, 3, 7, 2, 8};
         * 
         */

        int[] numbers = { 5, 10, 3, 7, 2, 8 };

        System.out.println("최대값: " + Arrays.stream(numbers).max().getAsInt());
        System.out.println("최소값: " + Arrays.stream(numbers).min().getAsInt());



        /*
         * 문제 2: 배열 요소의 합과 평균 구하기
         * 
         * 주어진 실수 배열의 요소들의 합과 평균을 계산하는 프로그램을 작성하세요.
         * double[] values = {1.5, 2.5, 3.0, 4.5, 5.0};
         * 
         */

        double[] values = { 1.5, 2.5, 3.0, 4.5, 5.0 };

        double total = 0.0;

        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }

        System.out.println("요소들의 합: " + total);
        System.out.println("요소들의 평균: " + (total / values.length));



        /* ?
         * 문제 3: 배열 요소의 빈도수 계산
         * 
         * 정수 배열과 정수 값 하나가 주어질 때, 배열에서 그 값의 빈도수를 계산하는 프로그램을 작성하세요.
         * 
         * int[] numbers = {1, 2, 3, 2, 4, 2, 5};
         * int targetValue = 2;
         * int frequency = 0;
         * 
         */



        /* ?
         * 문제 4: 중복 요소 제거하기
         * 
         * 정수 배열에서 중복된 요소를 제거하고 중복이 제거된 배열을 반환하는 프로그램을 작성하세요.
         * int[] numbers = {1, 2, 2, 3, 4, 4, 5};
         * 
         */



    }
}
