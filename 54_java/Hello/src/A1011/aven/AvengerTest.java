package A1011.aven;

public class AvengerTest {
    public static void main(String[] args) {
        Avenger thor = new Avenger("토르", 150);
        Avenger thanos = new Avenger("타노스", 160);
        thor.punch(thanos); //thor 메소드 실행의 주체 인스턴스(객체)
        thor.punch(thanos); // Avenger enemy = thanos; enemy에 thanos 값 대입
        thanos.punch(thor);
    }
}

class Avenger {
    String name;
    int hp;

    Avenger(String s, int i) {
        name = s;
        hp = i;
    }

    void punch(Avenger enemy) {
        System.out.printf("[%s]의 펀치", name);
        enemy.hp -= 10;
        System.out.printf("-> %s의 체력: %d\n", enemy.name, enemy.hp);
    }
}