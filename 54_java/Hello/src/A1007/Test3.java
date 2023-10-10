package A1007;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*
         * ?
         * 문제 43 숫자를 한글로 바꾸기(난이도 중)
         * 문제 설명
         * 엑셀에서 숫자를 입력하면 그 숫자에 맞는 한글로 변환해주는 NUMBERSTRING 함수가 있다.
         * 
         * 위 그림과 같이 A1셀에 12345를 입력하면 A2셀의 결과처럼 보여준다.
         * 이 함수를 java언어로 직접 만들어보자.
         */

        Scanner scan = new Scanner(System.in);
        
        System.out.print("숫자를 입력하세요: ");
        
        String numberInput = scan.nextLine();

        // 빈배열, n자리단위, 출력용변수
        String numberAll[] = {"", "", "", "", ""};
        String unit[] = {"만","천","백","십",""};
        String output = "";
        
        for(int i = 0; i<numberAll.length; i++) {
            // 빈배열에 입력값을 넣는다. (만단위부터 시작)
            numberAll[i] = numberInput.substring(i, i+1);

            // 특정 문자열 포함 시 한글 문자열로 교체
            if(numberAll[i].contains("1")) {numberAll[i] = numberAll[i].replace("1", "일");}
            if(numberAll[i].contains("2")) {numberAll[i] = numberAll[i].replace("2", "이");}
            if(numberAll[i].contains("3")) {numberAll[i] = numberAll[i].replace("3", "삼");}
            if(numberAll[i].contains("4")) {numberAll[i] = numberAll[i].replace("4", "사");}
            if(numberAll[i].contains("5")) {numberAll[i] = numberAll[i].replace("5", "오");}
            if(numberAll[i].contains("6")) {numberAll[i] = numberAll[i].replace("6", "육");}
            if(numberAll[i].contains("7")) {numberAll[i] = numberAll[i].replace("7", "칠");}
            if(numberAll[i].contains("8")) {numberAll[i] = numberAll[i].replace("8", "팔");}
            if(numberAll[i].contains("9")) {numberAll[i] = numberAll[i].replace("9", "구");}
           
            // 배열에 십의자리 단위를 덧댐한다. (만단위부터 시작)
            numberAll[i] += unit[i];
        }
        
        for(int j = 0; j<numberAll.length; j++) {
            // 문자 하나로 합치기 위해 각각의 배열값을 덧댐
            output += numberAll[j];
        }
        
        System.out.println(output);

        // 배열값 확인용
        // String str = Arrays.toString(numberAll);
        // System.out.println(str);


        // 한계: 5자리수를 다 적어야 나옴. 배열의 문제인듯. numberInput에 쓴 숫자 자리수에 따라서 numberAll 배열이 생성되게 할 수 있는가?
    }
}
