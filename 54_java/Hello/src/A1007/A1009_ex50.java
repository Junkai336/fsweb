package A1007;

import java.util.Scanner;

public class A1009_ex50 {
    public static double calculateBMI(double weight, double tall) {
        double bmi = weight / (tall * tall);
        // 해당 메소드를 구현하세요.
        // 저체중(18.5미만), 정상(18.5이상 ~ 25미만), 과체중(25이상~30미만), 비만(30이상)
        if (bmi < 18.5) {
            System.out.println("저체중");
        } else if (bmi < 23) {
            System.out.println("정상");
        } else {
            System.out.println("비만");
        }
        return bmi;
    }

    public static void printBMIClassification(double bmi) {
        // 해당 메소드를 구현하세요.
    }

    public static void main(String[] args) {
        System.out.println("몸무게(kg)와 키(m)를 입력하세요.");
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
        double tall = input.nextDouble();
        // BMI 지수 계산
        double bmi = calculateBMI(weight, tall);
        // BMI 지수를 입력하여 비만도 결과 출력
        System.out.println(bmi);
    }
}
