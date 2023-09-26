package A0926;

public class A0926_6 {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("상품에 가격:%d 원\n", value);
        System.out.printf("상품에 가격:%6d 원\n", value); // ___123 왼쪽에 빈자리공백
        System.out.printf("상품에 가격:%-6d 원\n", value); // 123___ 6자리정수 오른쪽에 빈자리공백
        System.out.printf("상품에 가격:%06d 원\n", value); // 왼쪽 빈자리 0 채움

        double area = 3.14159 * 10 * 10;
        System.out.printf("상품의 가격이 %d인 원의 넓이:%10.2f\n", 10, area); // 왼쪽 빈자리 0 채움
        // 정수부분 7 자리 소수점 1자리 소수점이하 2자리
        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
        
    }
}
