package A1012;

public class SmartPhone2 extends Phone2 {
    // 자식 생성자 선언
    public SmartPhone2(String model, String color) {
        super();
        this.model = model;
        this.color = color;
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
    }
}
