package A1010;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
         * 문제 52
         * 영어에서 서수를 나타낼 때 다음과 같이 나타낸다.
         * 1st  2nd  3rd  4th  5th  6th  ... 
         * 11th 12th 13th 14th 15th...
         * 21st 22nd 23rd 24th 25th ...
         * 31st 32nd 33rd 34th 35th...
         * 41st 42nd 43rd 44th 45th...
         * ...
         * 91st 92nd 93rd 94th 95th ... 99th
         * 1부터 99까지의 숫자가 입력되면 영어 서수 표현으로 출력하시오.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("숫자를 입력해 주세요: ");

        String number = scan.nextLine();

        char numberArray[] = number.toCharArray();

        // System.out.println(number.toString());
        // System.out.println(Arrays.toString(numberArray));

        String[] suffix = { "st", "nd", "rd", "th", "" };

        if (numberArray.length == 2) {
            switch (numberArray[1]) {
                case '0':
                    System.out.println(numberArray[0] + (numberArray[1] + suffix[4]));
                    break;
                case '1':
                    System.out.println(numberArray[0] + (numberArray[1] + suffix[0]));
                    break;
                case '2':
                    System.out.println(numberArray[0] + (numberArray[1] + suffix[1]));
                    break;
                case '3':
                    System.out.println(numberArray[0] + (numberArray[1] + suffix[2]));
                    break;
                default:
                    System.out.println(numberArray[0] + (numberArray[1] + suffix[3]));
                    break;
            }
        }

        if (numberArray.length == 1) {
            switch (numberArray[0]) {
                case '0':
                    System.out.println(numberArray[0] + suffix[4]);
                    break;
                case '1':
                    System.out.println(numberArray[0] + suffix[0]);
                    break;
                case '2':
                    System.out.println(numberArray[0] + suffix[1]);
                    break;
                case '3':
                    System.out.println(numberArray[0] + suffix[2]);
                    break;
                default:
                    System.out.println(numberArray[0] + suffix[3]);
                    break;
            }
        }

        /*
         * 문제 53
         * 두 실수 a, b가 입력되면 그 두수를 더하거나 빼거나 곱하거나 나누거나 제곱을 해서 가장 큰 수를 출력하시오.
         * 예를 들어 1과 2가 입력되면,
         * 1+2 = 3   , 2+1 = 3
         * 1 - 2 = -1,   2 - 1 = 1
         * 1 * 2 = 2,    2 * 1 = 2
         * 1 / 2 = 0.5,   2 / 1 = 2
         * 12=1 ,   21 = 2
         * 따라서 최댓값은 3이다.
         */

        System.out.print("a를 입력하세요 : ");
        double a = scan.nextDouble();
        System.out.print("b를 입력하세요 : ");
        double b = scan.nextDouble();

        double[] ab = { a + b, a - b, a * b, a / b, Math.pow(a, b) };
        double[] ba = { b + a, b - a, b * a, b / a, Math.pow(b, a) };

        // System.out.println(Arrays.toString(ab));
        // System.out.println(Arrays.toString(ba));

        Arrays.sort(ab);
        Arrays.sort(ba);

        System.out.println(Arrays.toString(ab));
        System.out.println(Arrays.toString(ba));

        if (ab[4] > ba[4]) {
            // System.out.println("최대값: " + (ab[4]));
            System.out.printf("최대값: %.5f", ab[4]);
        } else {
            System.out.printf("최대값: %.5f", ba[4]);
            // System.out.println("최대값: " + (ba[4]));
        }

        /*
         * 54
         * 두 자연수 a, b가 주어진다.
         * b가 a의 배수이면 "a*x=b"를 출력하고,
         * a가 b의 배수이면 "b*x=a"를 출력하고,
         * 배수관계가 아니면 "none"을 출력하시오.
         * 예) 
         * 5 10    ====> 5*2=10
         * 14 2   ======> 2*7=14
         * 3 7 =====> none
         */

        System.out.println();
        System.out.print("54번 aa 숫자를 입력하세요: ");
        int aa = scan.nextInt();
        System.out.print("54번 bb 숫자를 입력하세요: ");
        int bb = scan.nextInt();

        if(bb % aa == 0) {
            System.out.println("a*x=b");
        } else if(aa % bb == 0) {
            System.out.println("b*x=a");
        } else {
            System.out.println("none");
        }

    }
}
