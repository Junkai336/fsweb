package A1017.me;

public class Hiob {
    static void hi () {
        System.out.println("메소드영역");
    }
}

class Hi {
    public static void main(String[] args) {
        // Hiob myhi = new Hiob();

        Hiob.hi();
        // myhi.hi();
    }
}

// 그니까 메소드는 인스턴스가 아니라 메소드영역에 저장되는거고 . 
// 그냥 불러오는건 정적멤버여야 한다는 소리인듯
// 메소드에 스태틱 선언이 가능