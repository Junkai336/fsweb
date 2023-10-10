package A1007;

import java.util.Scanner;

public class A1009_ex41 {
    public static void main(String[] args) {
        // 공이 30m~40m 나 60m~70m에 들어오면 이김
        // 그외 구간에 떨어지면 짐

        Scanner scan = new Scanner(System.in);
        System.out.print("슬기가 던진 공의 위치>");
        float ball = scan.nextFloat();
        
        if((ball<=40 && ball>=30)||(ball<=70 && ball>=60)) {
            System.out.println("Win");
        }else {
            System.out.println("Lose");
        }
    }
}
