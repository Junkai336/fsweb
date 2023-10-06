package A1007;

import java.util.Arrays;

public class BookTest1 {
    public static void main(String[] args) {
        // 6. 배열 길이 출력 코드
        int[][] array = {
                { 95, 86 },
                { 83, 92, 96 },
                { 78, 83, 93, 87, 88 }
        };

        System.out.println(array.length); // 1,2,3
        System.out.println(array[2].length); // 1,2,3,4,5

        // array의 length는 3줄
        // array[n]의 length는 2,3,5줄

        System.out.println("------------------------------------");

        // 7. 주어진 배열 항목에서 최대 값을 출력하는 코드를 작성해보세요 (for문 이용)

        int[] array7 = { 1, 5, 3, 8, 2 };

        int max = array7[0];

        for (int i = 0; i < array7.length; i++) {
            if (max <= array7[i]) {
                max = array7[i];
            }
        }

        System.out.println(max);

        System.out.println("------------------------------------");

        // 8. 주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 작성해보세요 (중첩 for 문 이용)

        int[][] array8 = {
                { 95, 86 },
                { 83, 92, 96 },
                { 78, 83, 93, 87, 88 }
        };

        int sum8 = 0;
        int totalStudent = 0;
        double average8 = 0;

        for (int i = 0; i < array8.length; i++) {
            totalStudent += array8[i].length;
            for (int j = 0; j < array8[i].length; j++) {
                sum8 += array8[i][j];
            }
        }
        average8 = sum8 / totalStudent;

        System.out.println(totalStudent);
        System.out.println(sum8);
        System.out.println(average8);

        // 1차원 배열 출력
        // System.out.println(Arrays.toString(array8[0]));
        // 2차원 배열 출력
        // System.out.println(Arrays.deepToString(array8));

        System.out.println("------------------------------------");



    }
}
