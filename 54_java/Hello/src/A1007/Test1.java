package A1007;

import java.util.Scanner;
import java.util.Calendar;

public class Test1 {
    public static void main(String[] args) {
        /*
         * 문제 41
         * 
         * 슬기는 지난 번 공던지기에서 져서 아이스크림을 사게되었다.
         * 얼마 뒤 열받은 슬기는 체육 선생님에게 다시 한번 공던지기를 하여 아이스크림 내기를 하자고 제안하였다.
         * 그런데 이번에는 불리한 슬기가 다음 룰을 제안하였다.
         * 1. 공이 30m~40m나 60m~70m 에 들어오면 슬기가 이김.
         * 2. 그 외의 구간에 떨어지면 체육선생님이 이김.
         * 슬기가 던진 공의 위치가 입력으로 주어지면 슬기가 이기는 구간에는 "win"을 출력하고, 그 외에는 "lose"를 출력하시오.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("41 공을 몇 m 던졌습니까? : ");

        int throwBall = scan.nextInt();

        if ((throwBall >= 30 && 40 >= throwBall) || (throwBall >= 60 && 70 >= throwBall)) {
            System.out.println("win");
        } else {
            System.out.println("lose");
        }

        /*
         * 문제 42
         * 슬기는 지난 번에도 공던지기에 져서 아이스크림을 사게되었다.
         * 슬기는 이미 돈이 다 떨어져서 현량이에게 돈을 빌린 상태이다.
         * 이번에는 슬기가 또 다른 조건을 내걸고 체육 선생님에게 도전하게 되었다. 
         * 1. 공의 위치가 50m~70m이면 슬기가 이김.
         * 또는
         * 2. 공의 위치가 6의 배수이면 슬기가 이김. 
         * 슬기가 던진 공의 위치가 입력으로 주어지면 슬기가 이기는 구간에는 "win"을 출력하고, 그 외에는 "lose"를 출력하시오.
         */

        System.out.print("42 공을 몇 m 던졌습니까? : ");

        int throwBall2 = scan.nextInt();

        if (50 <= throwBall2 && throwBall2 <= 70) {
            System.out.println("win");
        } else if (throwBall2 % 6 == 0) {
            System.out.println("win");
        } else {
            System.out.println("lose");
        }


        /*
         * 문제 44
         * 주원이는 월, 수, 금, 일 아르바이트를 간다.
         * 다음은 요일의 순서이다.
         * 월요일
         * 화요일
         * 수요일
         * 목요일
         * 금요일
         * 토요일
         * 일요일
         * 요일의 번호가 입력으로 주어지면 그 날이 아르바이트 가는 날이면 "oh my god"를 가는 날이 아니면 "enjoy"를 출력하시오.
         */

        Week today = null;

        // Calendar calendar = Calendar.getInstance();

        // int week = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.print("오늘의 요일을 숫자로 입력하시오 : ");

        int week = scan.nextInt();

        switch (week) {
            case 1:
                today = Week.MONDAY;
                break;
            case 2:
                today = Week.TUESDAY;
                break;
            case 3:
                today = Week.WEDNESDAY;
                break;
            case 4:
                today = Week.THURSDAY;
                break;
            case 5:
                today = Week.FRIDAY;
                break;
            case 6:
                today = Week.SATURDAY;
                break;
            case 7:
                today = Week.SUNDAY;
                break;
        }

        if (week == 1 || week == 3 || week == 5 || week == 7) {
            System.out.println("oh my god");
        } else {
            System.out.println("enjoy");
        }

        /* ?
         * 문제 45 이차방정식의 해(난이도 중)
         * 문제 설명
         * 2차 방정식 ax2 + bx + c = 0 의 해를 구하시오.
         */

        int a, b, c;
        int result;

        System.out.print("이차 방정식 계수 a 값 : ");
        a = scan.nextInt();

        System.out.print("이차 방정식 계수 b 값 : ");
        b = scan.nextInt();

        System.out.print("이차 방정식 계수 c 값 : ");
        c = scan.nextInt();


        /*
         * 문제 46
         * 어떤 차의 높이가 170cm 이다.
         * 이 차는 3개의 터널을 차례대로 지나게 될 것이다.
         * 터널의 높이가 차의 높이보다 같거나 낮다면 차는 터널과 충돌하여 사고가 날 것이다.
         * 터널의 높이가 차례대로 3개 주어지면 터널을 무사히 잘 통과하면 PASS 를 출력하고, 사고가 난다면 CRASH 를 출력하시오.
         *  
         * 입력
         * 터널의 높이가 차례대로 3개 주어진다. (정수)
         * 출력
         * 170보다 같거나 작으면 "CRASH"를 출력, 그 보다 크면 "PASS"를 출력하시오.
         */

        int car = 170;
        int terminal1, terminal2, terminal3;

        System.out.print("터미널1의 높이: ");
        terminal1 = scan.nextInt();

        System.out.print("터미널2의 높이: ");
        terminal2 = scan.nextInt();

        System.out.print("터미널3의 높이: ");
        terminal3 = scan.nextInt();

        if (terminal1 < 170 && terminal2 < 170 && terminal3 < 170) {
            System.out.println("PASS");
        } else {
            System.out.println("CRASH");
        }

        /*
         * 문제 47 윤년판별
         * 문제 설명
         * 2월이 29일까지 있는 해를 윤년이라고 한다.
         * 어떤 해가 입력되면 그 해가 윤년인지 아닌지 판별하시오.
         * (윤년 판단 조건)
         * 1. 해(year)가 4의 배수이면서 100의 배수가 아니면 윤년.
         * 2. 400의 배수이면 윤년.
         * 위 두 조건 중 하나라도 맞으면 윤년이다.
         *  
         * 예)
         * 2004 년 ====>  윤년(1번 조건)
         * 2000 년 ====> 윤년 (2번 조건) 
         * 1900 년 ====> 윤년 아님
         * 1999 년 ====> 윤년 아님
         */

         System.out.print("47 년도를 입력하세요: ");
         int year = scan.nextInt();

         if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "년은 윤년입니다.");
         } else {
            System.out.println(year + "년은 윤년이 아닙니다.");
         }

         System.out.println(((year % 4 == 0 && year % 100 == 0 || year % 400 == 0) ? "윤" : "평") + "년 입니다.");

    }
}
