package A1007;

import java.util.Scanner;

public class A1009_ex46 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 터널 높이
        int hight = 170;
        System.out.print("첫번째 터널은? >");
        int st1 = scan.nextInt();
        System.out.print("두번째 터널은? >");
        int st2 = scan.nextInt();
        System.out.print("세번째 터널은? >");
        int st3 = scan.nextInt();

        if(hight >= st1){
            System.out.println("PASS");
        }
        if(hight >= st2){
            System.out.println("PASS");
        }
        if(hight >= st3){
            System.out.println("PASS");
        }else{
            System.out.println("CRASH");
        }
    }
}
