package A1012;

public class SmartPhoneExample2 {
    public static void main(String[] args) {
        // SmartPhone 객체 생성
        SmartPhone2 myPhone = new SmartPhone2("갤럭시", "은색");

        // Phone으로부터 상속 받은 필드 읽기
        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);
    }
}
