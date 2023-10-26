package A1026.prac;

public class Car {
    // 필드 선언
    public Tire tire;
    
    public Tire tire2 = new Tire();
    public Tire tire3 = new HankookTire();

    // 메소드 선언
    public void run() {
        // tire 필드에 대입된 객체의
        // roll() 메소드 호출
        tire.roll();
    }
}
