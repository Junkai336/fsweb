package A1007;

import java.util.Scanner;

public class A1009_ex48 {
    public static void main(String[] args) {
        String name ="",gender="",we="";

        Scanner scan = new Scanner(System.in);

        System.out.println("주민등록번호를 입력하세요");
        name = scan.next();//주민번호 입력문
        int age = Integer.parseInt(name.substring(0,2));

        char ch = name.charAt(7);
        // 성별 구분하기;(1=>1900 남자 2=>1900 여자 3=>2000 남자 4=>2000 여자)
        if(ch == '1' || ch == '3') {gender="남성";}
        else if(ch == '2' || ch == '4') {gender="여성";}
        else{gender="외국인";}
        // 나이구하기
        if(ch == '1' || ch == '2') {age=2012-(1900+age)+1;}
        else if(ch == '3' || ch == '4') {age=2012-(2000+age)+1;}
        // 계절구하기
        // String ch2 = name.substring(2,4);
        // switch (ch2){
        //     case "12": case "01": case "02": we="겨울";break;
        //     case "03": case "04": case "05": we="여름";break;
        //     case "06": case "07": case "08": we="가을";break;
        //     case "09": case "10": case "11": we="겨울";break;
        // }

        System.out.println("주민번호:"+name);
        System.out.println("성별:"+gender);
        System.out.println("나이는:"+age);
        // System.out.println("태어난 계절:"+we);

    }
}
