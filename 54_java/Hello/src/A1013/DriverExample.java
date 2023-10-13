package A1013;

public class DriverExample {
    public static void main(String[] args) {
        // Driver 객체 생성
        Driver driver = new Driver();

        // 매개값으로 Bus 객체를 제공하고 driver() 메소드 호출
        Bus bus = new Bus();
        driver.drive(bus);

        // 매개값으로 Taxi 객체를 제공하고 driver() 메소드 호출
        Taxi taxi = new Taxi();
        driver.drive(taxi);
    }
}

class Vehicle {
    // 메소드 선언
    public void run() {
        System.out.println("차량이 달립니다.");
    }
}

class Bus extends Vehicle {
    // 메소드 재정의
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}

class Taxi extends Vehicle {
    // 메소드 재정의 (오버라이딩)

    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}

class Driver {
    // 메소드 선언 (클래스 타입의 매개변수를 가지고 있음)
    public void drive(Vehicle vehicle) {
        vehicle.run();
    }
}
