package A1025;

import java.io.IOException;
import java.io.InputStream;

public class Sample2 {
    public static void main(String[] args) throws IOException {
        // InputStream 의 read 메서드는 1byte 크기의 사용자의 입력을 받아들인다.
        // 1byte 크기의 자료형으로 저장 0~255 사이의 정수값(아스키코드) 
        InputStream in = System.in;

        int a;
        int b;
        int c;
        
        a = in.read();
        b = in.read();
        c = in.read();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
