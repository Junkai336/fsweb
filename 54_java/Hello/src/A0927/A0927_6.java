package A0927;

public class A0927_6 {
    public static void main(String[] args) {
        // 107page
        
        // 1
        int x = 10;
        int y = 20;
        int z = (++x) + (y--);
        System.out.println(z);
        // 1+10 + 20-1 아님?
        // 연산방향이 <- 라서 -0+20+10+1?
        // System.out.println(x++);
        // System.out.println(++x);

        // 2
        int score = 85;
        String result = (!(score>90)) ? "가" : "나";

        // 90점이 아니면 가
        System.out.println(result);

        // 3
        int pencils = 534;
        int students = 30;

        // 학생 한명이 가지는 연필 수 17.8
        int pencilsPerStudent = ( pencils / students );
        // int pencilsPerStudent = ( pencils /= students );
        //  /랑 /=랑 뭐가 다른가? 대입(변수에저장까지해줌)하고 산술(계산만함)?
        System.out.println(pencilsPerStudent);

        // 남은 연필 수
        // int pencilsLeft = ( pencils - (students * pencilsPerStudent));
        int pencilsLeft = ( pencils % students);
        System.out.println(pencilsLeft);
        // 24개 나와야 하는거 아님? 17.8에서 0.8*30 아닌가 -> 맞음

        // 4
        int value = 356;
        // 356 나누기 300은 1 이고 나머지가 56 이니까 356에서 계산한 거 버리기
        System.out.println(value -= (value % 300));

        // 5
        // "정확히 소수자릿수" 가 뭔소리? oo.0 이라는 소리?
        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        // double area = ( (lengthTop + lengthBottom) * height / 2.0 );
        // double area = ( (lengthTop+lengthBottom) * height * 1.0 / 2 );
        // double area = (double) (lengthTop + lengthBottom) * height / 2;
        double area = (double) ((lengthTop + lengthBottom) * height / 2);
        System.out.println(area);

        // 6
        int a = 10;
        int b = 5;

        System.out.println( (a>7) && (b<=5) );
        System.out.println( (a%3 == 2) || (b%2 != 1) );

        // 7
        double q = 5.0;
        double w = 0.0;
        double e = q % w;

        if ( Double.isNaN(e)) {
            System.out.println("0.0으로 나눌 수 없습니다.");
        } else {
            double resultqwe = e + 10;
            System.out.println("결과: " + resultqwe);
        }
    }
}
