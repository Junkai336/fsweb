package A1016.a367;

interface Vehicle {
    // 추상 메소드
    void run();
}

class Bus implements Vehicle {
    // 추상 메소드 재정의
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }

    // 추가 메소드
    public void checkFare() {
        System.out.println("승차요금을 체크합니다.");
    }
}


public class CastingExample {
    public static void main(String[] args) {
        // 인터페이스 변수 선언과 구현 객체 대입
        Vehicle vehicle = new Bus();

        // 인터페이스를 통해서 호출
        vehicle.run();
        // vehicle.checkFare(); (x)

        // 강제 타입 변환 후 호출
        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
