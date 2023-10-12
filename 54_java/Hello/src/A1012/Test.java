package A1012;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 61
        Scanner scan = new Scanner(System.in);

        try {

            String[] math = new String[3];

            for (int i = 0; i < 3; i++) {
                if (i == 0 || i == 2) {
                    System.out.print("피연산자를 입력하세요. (정수) : ");
                }
                if (i == 1) {
                    System.out.print("연산자를 입력하세요. (+,-,*,/) : ");
                }
                math[i] = scan.nextLine();
            }

            String[] signal = { math[1] };

            String[] number = { math[0], math[2] };

            int[] number2 = Arrays.stream(number).mapToInt(Integer::parseInt).toArray();

            double divide = number2[0] / number2[1];

            System.out.println(Arrays.toString(signal));
            System.out.println(Arrays.toString(number2));

            if (signal[0].contains("+")) {
                System.out.println(number2[0] + " " + signal[0] + " " + number2[1] + " = " + (number2[0] + number2[1]));
            } else if (signal[0].contains("-")) {
                System.out.println(number2[0] + " " + signal[0] + " " + number2[1] + " = " + (number2[0] - number2[1]));
            } else if (signal[0].equals("*")) {
                System.out.println(number2[0] + " " + signal[0] + " " + number2[1] + " = " + (number2[0] * number2[1]));
            } else if (signal[0].contains("/")) {
                System.out.print(number2[0] + " " + signal[0] + " " + number2[1] + " = ");
                System.out.printf("%.2f\n", divide);
            }

        } catch (Exception e) {
            System.out.println("잘못된 입력");
        }

    }
}
