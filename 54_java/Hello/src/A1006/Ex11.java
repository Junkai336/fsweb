package A1006;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        /* 
         
        문제 11
        
        두 개의 문자를 입력받은 후 순서를 바꿔 출력해보자.
        
        입력
        
        두 개의 문자가 차례대로 입력된다.
        
        출력
        
        입력한 두 문자의 순서를 바꿔 출력한다.

        
        
        입력 예시
        
        A
        
        b
        출력 예시
        
        b A
        
        도움말
        
        Scanner클래스를 이용하여 2개의 문자값을 입력받고,
        
        출력되는 순서를 바꿈으로써 해결할 수 있다.
        
        */
        
        Scanner scan = new Scanner(System.in);
        System.out.print("첫 번째 문자를 입력 >");
        String str = scan.next();
        System.out.print("두 번째 문자를 입력 >");
        String str2 = scan.next();
        
        System.out.println(str2 + " " + str);

        // scan.next = 공백 이전의 문자를 인식 한다?
    
    }
}
