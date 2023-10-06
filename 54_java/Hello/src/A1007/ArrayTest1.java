package A1007;

import java.util.Arrays;

public class ArrayTest1 {
    public static void main(String[] args) {
        /*
         * 문제 1: 배열에서 최대값 찾기
         * 주어진 정수 배열에서 최대값을 찾는 프로그램을 작성하세요.
         * int[] numbers = {5, 10, 3, 7, 2, 8};
         * 
         */

         int[] numbers = {5, 10, 3, 7, 2, 8};

         System.out.println("최대값: " + Arrays.stream(numbers).max().getAsInt());
         System.out.println("최소값: " + Arrays.stream(numbers).min().getAsInt());

        /*
         * 문제 2: 배열 요소의 합과 평균 구하기
         * 
         * 주어진 실수 배열의 요소들의 합과 평균을 계산하는 프로그램을 작성하세요.
         * double[] values = {1.5, 2.5, 3.0, 4.5, 5.0};
         * 
         */

        double[] values = {1.5, 2.5, 3.0, 4.5, 5.0};

        double total = 0.0;

        for(int i = 0; i < values.length; i++) {
            total += values[i];
        }

        System.out.println("요소들의 합: " + total);
        System.out.println("요소들의 평균: " + (total / values.length));

        /*
         * 문제 3: 배열 요소의 빈도수 계산
         * 
         * 정수 배열과 정수 값 하나가 주어질 때, 배열에서 그 값의 빈도수를 계산하는 프로그램을 작성하세요.
         * 
         * int[] numbers = {1, 2, 3, 2, 4, 2, 5};
         * int targetValue = 2;
         * int frequency = 0;
         * 
         */



        /*
         * 문제 4: 중복 요소 제거하기
         * 
         * 정수 배열에서 중복된 요소를 제거하고 중복이 제거된 배열을 반환하는 프로그램을 작성하세요.
         * int[] numbers = {1, 2, 2, 3, 4, 4, 5};
         * 
         */



        /*
         * 자바 배열 관련 문제의 자세한 설명과 코드를 제공합니다. 아래 각 문제에 대한 설명과 코드를 확인하세요.
         */



        /*
         * 문제 1: 배열에서 최대값 찾기
         * 
         * 주어진 정수 배열에서 최대값을 찾는 프로그램을 작성하세요.
         * 
         * java
         * Copy code
         * public class FindMaxValueInArray {
         * public static void main(String[] args) {
         * int[] numbers = {5, 10, 3, 7, 2, 8};
         * 
         * int max = numbers[0]; // 배열의 첫 번째 요소를 최대값으로 초기화
         * 
         * // 배열을 순회하면서 최대값을 찾음
         * for (int i = 1; i < numbers.length; i++) {
         * if (numbers[i] > max) {
         * max = numbers[i];
         * }
         * }
         * 
         * System.out.println("최대값: " + max);
         * }
         * }
         * 
         */



        /*
         * 문제 2: 배열 요소의 합과 평균 구하기
         * 
         * 주어진 실수 배열의 요소들의 합과 평균을 계산하는 프로그램을 작성하세요.
         * 
         * java
         * Copy code
         * public class CalculateArraySumAndAverage {
         * public static void main(String[] args) {
         * double[] values = {1.5, 2.5, 3.0, 4.5, 5.0};
         * double sum = 0.0;
         * 
         * // 배열의 모든 요소를 합산
         * for (double value : values) {
         * sum += value;
         * }
         * 
         * double average = sum / values.length;
         * 
         * System.out.println("합계: " + sum);
         * System.out.println("평균: " + average);
         * }
         * }
         * 
         */



        /*
         * 문제 3: 배열 요소의 빈도수 계산
         * 
         * 정수 배열과 정수 값 하나가 주어질 때, 배열에서 그 값의 빈도수를 계산하는 프로그램을 작성하세요.
         * 
         * java
         * Copy code
         * public class CalculateElementFrequencyInArray {
         * public static void main(String[] args) {
         * int[] numbers = {1, 2, 3, 2, 4, 2, 5};
         * int targetValue = 2;
         * int frequency = 0;
         * 
         * // 배열을 순회하면서 빈도수 계산
         * for (int number : numbers) {
         * if (number == targetValue) {
         * frequency++;
         * }
         * }
         * 
         * System.out.println(targetValue + "의 빈도수: " + frequency);
         * }
         * }
         * 
         */



        /*
         * 문제 4: 중복 요소 제거하기
         * 
         * 정수 배열에서 중복된 요소를 제거하고 중복이 제거된 배열을 반환하는 프로그램을 작성하세요.
         * 
         * java
         * Copy code
         * import java.util.ArrayList;
         * import java.util.Arrays;
         * import java.util.List;
         * 
         * public class RemoveDuplicatesFromArray {
         * public static void main(String[] args) {
         * int[] numbers = {1, 2, 2, 3, 4, 4, 5};
         * 
         * // 중복 요소를 제거한 배열 생성
         * int[] uniqueNumbers = removeDuplicates(numbers);
         * 
         * System.out.println("중복 제거된 배열: " + Arrays.toString(uniqueNumbers));
         * }
         * 
         * // 중복 요소를 제거한 배열을 반환하는 함수
         * public static int[] removeDuplicates(int[] arr) {
         * List<Integer> uniqueList = new ArrayList<>();
         * for (int num : arr) {
         * if (!uniqueList.contains(num)) {
         * uniqueList.add(num);
         * }
         * }
         * 
         * // List를 배열로 변환
         * int[] uniqueArray = new int[uniqueList.size()];
         * for (int i = 0; i < uniqueList.size(); i++) {
         * uniqueArray[i] = uniqueList.get(i);
         * }
         * 
         * return uniqueArray;
         * }
         * }
         * 
         */



        /*
         * 문제 5: 2차원 배열 합치기
         * 
         * 두 개의 2차원 배열을 입력으로 받아, 두 배열을 가로로 합치는 프로그램을 작성하세요.
         * int[][] array1 = {{1, 2}, {3, 4}};
         * int[][] array2 = {{5, 6}, {7, 8}};
         * 
         * int[][] mergedArray = mergeArrays(array1, array2);
         * 
         */



    }
}
