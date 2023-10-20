package A1020.Ram;

interface JavaCoding2 {
    String nowCoding();
}

public class Ram12_1 {
    public static void main(String[] args) {
        // 객체 선언
        JavaCoding2 jc;

        String str1 = "그 날을 잊지 못해 baby";
        String str2 = "날 보며 환히 웃던 너의 미소에";
        String str3 = "홀린 듯 I'm fall in love";

        jc = new JavaCoding2() {
            @Override
            public String nowCoding() {
                return str1;
            }
        };
        System.out.println(jc.nowCoding());

        jc = new JavaCoding2() {
            @Override
            public String nowCoding() {
                return str2;
            }
        };
        System.out.println(jc.nowCoding());

        jc = new JavaCoding2() {
            @Override
            public String nowCoding() {
                return str3;
            }
        };
        System.out.println(jc.nowCoding());
    }
}