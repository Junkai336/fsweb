package A1016.a363;

interface RemoteControl {
    // 추상 메소드
    void turnOn();

    void turnOff();
}

interface Searchable {
    // 추상 메소드
    void search(String url);
}

class SmartTelevision implements RemoteControl, Searchable {
    // turnOn() 추상 메소드 오버라이딩
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    // turnOff() 추상 메소드 오버라이딩
    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    // search() 추상 메소드 오버라이딩
    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }
}

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        // RemoteControl 인터페이스 변수 선언 및 구현 객체 대입
        RemoteControl rc = new SmartTelevision();

        // RemoteControl 인터페이스에 선언된 추상 메소드만 호출 가능
        rc.turnOn();
        rc.turnOff();

        // Searchable 인터페이스 변수 선언 및 구현 객체 대입
        Searchable searchable = new SmartTelevision();

        // Searchable 인터페이스에 선언된 추상 메소드만 호출 가능
        searchable.search("https://www.youtube.com");
    }
}