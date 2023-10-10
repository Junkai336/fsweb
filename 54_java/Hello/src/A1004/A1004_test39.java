package A1004;

import java.lang.reflect.Array;
import java.util.Arrays;

public class A1004_test39 {
    public static void main(String[] args) {
        // 세 정수가 주어지면 그중 가장 작은 수 출력

        int array[] = {10, 15, 5};


        Arrays.sort(array);

        System.out.println("최대값 : " + array[array.length-1]);
        System.out.println("최소값 : " + array[0]);
    }
}
