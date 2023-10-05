package A1005;

public class A1005_14_teacher {
    public static void main(String[] args) {
        // 1
        int[] array = { 1, 2, 3, 4, 5 };
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("배열 요소의 합: " + sum);

        // 2

        int[] array2 = { 10, 5, 8, 21, 3 };
        int max = array2[0];
        int min = array2[0];

        for (int i = 1; i < array2.length; i++) {
            if (array2[i] > max) {
                max = array2[i];
            }
            if (array2[i] < min) {
                min = array2[i];
            }
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

        // 3

        double[] array3 = { 2.5, 3.0, 1.5, 4.0, 2.0 };
        double sum3 = 0;

        for (int i = 0; i < array3.length; i++) {
            sum3 += array3[i];
        }

        double average = sum3 / array3.length;
        System.out.println("배열 요소의 평균: " + average);

        // 4

        String[] array4 = { "apple", "banana", "cherry", "date" };

        for (int i = 0; i < array4.length / 2; i++) {
            String temp = array4[i];
            array4[i] = array4[array4.length - 1 - i];
            array4[array4.length - 1 - i] = temp;
        }

        System.out.println("배열 요소 뒤집기:");
        for (String str : array4) {
            System.out.println(str);
        }

    }
}
