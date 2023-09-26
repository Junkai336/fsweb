package A0926;

public class aaa {
    public static void main(String[] args) {

        // 기본 자료형 정수형 4가지
        byte min_byte_int = Byte.MIN_VALUE, max_byte_int = Byte.MAX_VALUE; // 1byte (-128 ~ 127)
        short min_short_int = Short.MIN_VALUE, max_short_int = Short.MAX_VALUE; // 2byte (-32768 ~ 32767)
        int min_int = Integer.MIN_VALUE, max_int = Integer.MAX_VALUE; // 4byte (약 21억)
        long min_long_int = Long.MIN_VALUE, max_long_int = Long.MAX_VALUE; // 8byte (약 922경)

        System.out.print("가장 작은 byte형 정수 : " + min_byte_int);
        System.out.println("  가장 큰 byte형 정수 : " + max_byte_int);
        System.out.print("가장 작은 short형 정수 : " + min_short_int);
        System.out.println("  가장 큰 short형 정수 : " + max_short_int);
        System.out.print("가장 작은 int형 정수 : " + min_int);
        System.out.println("  가장 큰 int형 정수 : " + max_int);
        System.out.print("가장 작은 long형 정수 : " + min_long_int);
        System.out.println("  가장 큰 long형 정수 : " + max_long_int);

        byte byteValue = 10;
        char charValue = 'A';

        String str = "5";

        float var4 = float.parseFloat (str);

        System.out.println(var4);
    }
}