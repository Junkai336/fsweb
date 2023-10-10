package A1007;

import java.util.Calendar;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        
        Calendar now = Calendar.getInstance();
        Scanner scan = new Scanner(System.in);

        /*
         * ? 0을 2개 인식 못함?
         * 문제 48 나이계산 (난이도 중)
         * 문제 설명
         * 주민등록번호는 생년월일과 성별정보, 지역정보로 이루어진다.
         * 여기서 생년월일과 성별정보만 입력으로 받겠다.
         * 성별 정보는 1이면 1900년대 출생 남자, 2이면 1900년대 출생 여자, 3이면 2000년대 출생 남자, 4이면 2000년대 출생
         * 여자를 말한다.
         * 기준년도는 2018년도이다. 현재 나이를 출력하시오. 
         * 예)
         * 790101
         * 1        =====> 성별정보가 1이므로, 1979년생, 34살이다.
         * 080521
         * 4        =====>  성별정보가 4이므로, 2008년생,  5살이다.
         */

        System.out.print("주민등록번호 7자리를 입력하세요. (xxxxxx) : ");
        String identity = scan.nextLine();

        int sex = Integer.parseInt(identity.substring(6));
        int birth = Integer.parseInt(identity.substring(0, 2));

        if (sex == 1) {
            System.out.println("성별: 남자");
            System.out.println("19" + birth + "년생");
        } else if (sex == 2) {
            System.out.println("성별: 여자");
            System.out.println("19" + birth + "년생");
        } else if (sex == 3) {
            System.out.println("성별: 남자");
            System.out.println("20" + birth + "년생");
        } else if (sex == 4) {
            System.out.println("성별: 여자");
            System.out.println("20" + birth + "년생");
        }

        /*
         * 문제 49 30분전 시간계산 (난이도 중)
         * 문제 설명
         * 수호는 30분 전으로 돌아가고 싶은 1人 이다.
         * 차례대로 시간과 분이 주어진다.
         * 그러면 이 시간을 기준으로 30분전의 시간을 출력하시오.
         * 예)
         * 12 35  =====> 12 5
         * 12 0 ======> 11 30
         * 11 5 ======> 10 35
         */

        /*
         * 문제 50
         * 문제 설명
         * 비만을 판단하기 위해서 BMI 수치가 필요하다.
         * BMI 수치가 입력되면 비만을 판단하시오.
         * BMI에 따른 비만 판정
         * BMI 수치 비만 판정
         * 18.5 미만 저체중
         * 18.5이상~23이하 정상체중
         * 23 초과 비만
         * BMI지수= 몸무게(kg) ÷ (신장(m) /100× 신장(m)/100)
         */

        // 48? 49?

    }
}
