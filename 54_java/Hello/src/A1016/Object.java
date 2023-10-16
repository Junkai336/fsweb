package A1016;

public class Object {
    public static void main(String[] args) {
        Car car01 = new Car("11",11,"11");
        Car car02 = new Car("11",11,"11",11);

        System.out.println(car01.toString());
        System.out.println(car02.toString());
    }}

// this 참조변수는 인스턴스가 바로 자기 자신을 참조하는데 사용
// this() 메소드는 생성자 내부에서만 사용할 수 있으며, 같은 클래스의 다른 생성자 호출할 때 사용