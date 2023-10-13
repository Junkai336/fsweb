package A1013.a328;

public class Dog extends Animal {
    // 추상 메소드 재정의
    @Override // 재정의(오버라이딩)
    public void sound() {
        System.out.println("멍멍");
    }
}
