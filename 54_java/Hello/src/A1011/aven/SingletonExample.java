package A1011.aven;

public class SingletonExample {
    public static void main(String[] args) {

        // Singleton obj1 = new Singleton(); // 컴파일 에러
        // Singleton obj2 = new Singleton(); // 컴파일 에러

        // 정적 메소드를 호출해서 싱글톤 객체를 얻음
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // 동일한 객체를 참조하는지 확인
        if (obj1 == obj2) {
            System.out.println("같은 Singleton 객체입니다.");
        } else {
            System.out.println("다른 Singleton 객체입니다.");
        }

    }
}

class Singleton {
    // private 접근 권한을 갖는 정적 필드 선언과 초기화
    private static Singleton singleton = new Singleton();

    // private 접근 권한을 갖는 생성자 선언
    private Singleton() {
    }

    // public 접근 권한을 갖는 정적 메소드 선언
    public static Singleton getInstance() {
        return singleton;
    }
}