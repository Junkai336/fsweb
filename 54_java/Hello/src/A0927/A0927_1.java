package A0927;

public class A0927_1 {
    public static void main(String[] args) {
        // int charCode = 'A';
        // int charCode = 'a';
        int charCode = '5';

        if ((65 <= charCode) & (charCode <= 90)) {
            System.out.println("대문자이군요.");
        }

        if ((97 <= charCode) && (charCode <= 122)) {
            System.out.println("소문자이군요.");
        }

        if ((48 <= charCode) && (charCode <= 57)) {
            System.out.println("0~9 숫자이군요.");
        }

        // -----------------------------------------

        // int value = 6;
        int value = 7;

        if ((value % 2 == 0) | (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수이군요.");
        }

    boolean result = (value%2==0) || (value%3==0);

    if ( !result ) {
        System.out.println("2 또는 3의 배수가 아니군요.");
    }

    }
}

// & 와 && ? : &는 앞뒤의 것 전부 판단 &&는 앞에거가 거짓이면 바로 거짓 출력 (연산이 빠르다. &&를 써라.)


// 연산자에서 나머지값을 꽤 많이 쓰는 편.

// ! = NOT , !False = True