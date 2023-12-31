package A1020.Ram;

@FunctionalInterface
interface JavaCoding {
    void nowCoding(String str);
}

public class Ram11 {
    public static void main(String[] args) {
        // 객체 선언
        JavaCoding jc;
        String str;

        jc = (a) -> {
            System.out.println(a + " Rolling in the deep");
        };
        str = "하루가 멀다하고";
        jc.nowCoding(str);

        // 람다식 바디{}를 생략하고 한 줄에 작성하기
        jc = (a) -> System.out.println(a + " Babe just only you");
        str = "기다리고 있잖아";
        jc.nowCoding(str);

        // 매개변수가 1개인 경우 () 생략할 수 있음
        jc = a -> System.out.println(a + " 기다리고 있어요");
        jc.nowCoding("온종일 난 그대 생각에");
    }
}