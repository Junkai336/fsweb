package A1011.aven;

public class StudentTest {
    public static void main(String[] args) {
        Student park = new Student(2019122104, "park");
        Student kim = new Student(2019062028, "kim");
        Student lee = new Student(2019153237, "lee");
        System.out.printf("Student 객체의 수 : %d\n", Student.count);
        System.out.printf("회원아이디는:%d\t 회원이름은:%s\n", park.id, park.name);
        System.out.printf("회원아이디는:%d\t 회원이름은:%s\n", kim.id, kim.name);
        System.out.printf("회원아이디는:%d\t 회원이름은:%s\n", lee.id, lee.name);

    }        
}

class Student {
    
    static int count = 0; // 클래스변수 , static 필드, 정적변수, 공용변수, 정적필드?

    int id; // 인스턴스변수
    String name;

    Student(int _id, String _name) {
        Student.count++;
        id = _id;
        name = _name;
    }

}

// static 있으면 바로 쓸 수 있다?