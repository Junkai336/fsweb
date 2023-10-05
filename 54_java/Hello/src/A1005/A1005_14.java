package A1005;

public class A1005_14 {
    public static void main(String[] args) {
        // 요소의 합 구하기
        int[] array = { 1, 2, 3, 4, 5 };
        int sum = 0;
        // System.out.println(array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.println(i);
            sum += array[i];
        }

        System.out.println(sum);


        System.out.println();
        System.out.println();

        // 최대값과 최소값 찾기

        int[] array2 = {10, 5, 18, 21, 3};

        int max = array2[0];
        int minn = array2[0];

        // System.out.println(array2[0]);
        
        for(int a = 0; a < array2.length; a++) {
            // System.out.println(array2[a]);
            if (array2[a] > max) {
                max = array2[a];
                // System.out.println(array2[a]);
            }
            if (array2[a] < minn) {
                minn = array2[a];
                // System.out.println(array2[a]);
            }
        }
        System.out.println("최대값 " + max);
        System.out.println("최소값 " + minn);



        // 배열 요소의 평균

        double[] array3 = {2.5, 3.0, 1.5, 4.0, 2.0};
        double sum2 = 0;

        for(int b=0; b<array3.length; b++) {
            // System.out.println(b);
            sum2 += array3[b];
        }

        sum2 /= array3.length;

        System.out.println(sum2);

        // 배열 요소 뒤집기

        String[] array4 = {"apple", "banana", "cherry", "date"};

        String[] array5 = {"apple", "banana", "cherry", "date"};
        String[] temp = {"", "", "", ""};

        for(int c=0; c<array4.length; c++) {
            for(int d=array4.length -1; d>=0; d--) {
                temp[0] = array4[array4.length - 1];
                temp[1] = array4[array4.length - 2];
                temp[2] = array4[array4.length - 3];
                temp[3] = array4[array4.length - 4];

                // array4[c] = temp[d];
            }
        }
        System.out.println(temp[0]);
        System.out.println(temp[1]);
        System.out.println(temp[2]);
        System.out.println(temp[3]);
        
        // System.out.println(d);
        // System.out.println(array4[c]);
            // System.out.println(array4[d]);


    }
}
