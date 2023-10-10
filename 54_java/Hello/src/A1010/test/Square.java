package A1010.test;

/* 
 * 다음 설계된 클래스 다이어그램을 토대로 정사각형 클래스를 구현하려고 한다.
 * 이는 한 변의 길이를 가지며, 그 넓이를 반환할 수 있다.
 */

public class Square {
    int length;

    int area() {
        return length * length;
    }
    // 1. 필드를 추가하시오
    // 2. 메소드를 작성하시오
    // 3. 메인 메소드를 완성하시오.

    public static void main(String[] args) {
        Square s = new Square();
        s.length = 4;

        System.out.printf("한 변의 길이가 %d인 정사각형의 넓이 : %d", s.length, s.area());
        // 객체 생성
        // 필드 초기화
        // 결과 출력

    }
}
