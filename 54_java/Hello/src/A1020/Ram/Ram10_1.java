package A1020.Ram;

@FunctionalInterface
interface JavaCoding {
    void nowCoding();
}

// 매개변수가 없고, 리턴값도 없음
public class Ram10_1 {
    public static void main(String[] args) {
        // 객체 선언
        JavaCoding jc;

        // 익명 내부 클래스
        jc = new JavaCoding() {
            @Override
            public void nowCoding() {
                System.out.println("Rollin' Rollin' Rollin' Rollin'");
            }
        };
        jc.nowCoding();

        // 익명 내부 클래스 (한 줄 코드)
        jc = new JavaCoding() {
            @Override
            public void nowCoding() {
                System.out.println("Rollin' Rollin' Rollin' Rollin'");
            }
        };
        jc.nowCoding();
    }
}