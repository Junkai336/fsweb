package A1007;

import java.util.Arrays;
import java.util.Scanner;

public class Test3_2 {
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

        char[] numberAll = numberInput.toCharArray();
        char[] unit = numberInput.toCharArray();

        switch (numberAll.length) {
            case 1:
            unit[0] = ' ';
            break;
            case 2:
            unit[0] = '십';
            unit[1] = ' ';
            break;
            case 3:
            unit[0] = '백';
            unit[1] = '십';
            unit[2] = ' ';
            break;
            case 4:
            unit[0] = '천';
            unit[1] = '백';
            unit[2] = '십';
            unit[3] = ' ';
            break;
            case 5:
            unit[0] = '만';
            unit[1] = '천';
            unit[2] = '백';
            unit[3] = '십';
            unit[4] = ' ';
            break;
        }

        // String numberAll2 = String.valueOf(numberAll);
        // String unit2 = String.valueOf(unit);

        // length -1,2,3,4,5

        System.out.println(Arrays.toString(numberAll));
        System.out.println(Arrays.toString(unit));

        // System.out.println(numberAll2);

        // n자리단위, 출력용변수
        String output = "";

        String[] result = numberAll;

        for(int i = 0; i<numberAll.length; i++) {
            result[i] = String.valueOf(numberAll[i] += unit[i]);
        }

        System.out.println(result);

         
        
    /*     for(int i = 0; i<numberAll2.length; i++) {
            // 빈배열에 입력값을 넣는다. (만단위부터 시작)
            numberAll2[i] = numberInput.substring(i, i+1);

            // 특정 문자열 포함 시 한글 문자열로 교체
            if(numberAll2[i].contains("1")) {numberAll2[i] = numberAll2[i].replace("1", "일");}
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
        
        System.out.println(output); */ 

        // 배열값 확인용
        // String str = Arrays.toString(numberAll);
        // System.out.println(str);


        // 한계: 5자리수를 다 적어야 나옴. 배열의 문제인듯. numberInput에 쓴 숫자 자리수에 따라서 numberAll 배열이 생성되게 할 수 있는가?
    }
}
