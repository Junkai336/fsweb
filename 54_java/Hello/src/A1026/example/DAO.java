package A1026.example;

import java.util.ArrayList;
import java.util.Scanner;

import A1019.a652.Member;

public class DAO {
    Scanner sc = new Scanner(System.in);

    // arraylist 형을 memberDto 리스트로 받겠다.
    private ArrayList<MemberDTO> mlist;

    // file 직접 d: 에 저장하려면 클래스인 FileClass 만들 예정
    private FileClass file = new FileClass("sun", "memberInfo");

    // 생성자 constructor
    public DAO() {
        mlist = new ArrayList<MemberDTO>();

        // 테스트용 데이터
        MemberDTO m1 = new MemberDTO(0, "test1", 11, "서울");
        MemberDTO m2 = new MemberDTO(1, "test2", 22, "대전");
        MemberDTO m3 = new MemberDTO(2, "test3", 33, "대구");
        MemberDTO m4 = new MemberDTO(3, "test4", 44, "부산");

        mlist.add(m1);
        mlist.add(m2);
        mlist.add(m3);
        mlist.add(m4);
    }

    // CRUD
    private void insert(MemberDTO m) {
        // 데이터 추가
        mlist.add(m);
        // listSize++;
    }

    // Select (검색)

    private MemberDTO select(int index) {
        return mlist.get(index);
    }

    // Update
    // 매개값으로 객체의 참조변수가 날라올 수 있다.....?
    private void update(int index, MemberDTO m) {
        mlist.set(index, m);

    }

    // delete
    private void delete(int index) {
        mlist.remove(index);
    }

    // user 메소드 : 사용자의 입력값 있음.
    // user Insert

    public void userInsert() {
        MemberDTO m = new MemberDTO();
        System.out.println("< 회원 정보입력 >");
        System.out.print("회원번호 : ");
        int id = sc.nextInt();
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        System.out.print("주소 : ");
        String ad = sc.next();
        m.setId(id);
        m.setName(name);
        m.setAge(age);
        m.setAddress(ad);

        insert(m);
    }

    // 인덱스 찾기 : 키 - 이름
    private int findIndex() {
        System.out.print("회원이름을 입력하시오 : ");
        String name = sc.next();
        for (int i = 0; i < mlist.size(); i++) {
            if (mlist.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    // user Delete
    public void userDelete() {
        int index = findIndex();
        if (index != -1) {
            delete(index);
            System.out.println("회원을 삭제했습니다.");
        } else {
            // 이름이 없는 경우
            System.out.println("해당 회원이 없습니다.");
        }
    }

    // user Select 멤버 값 리턴하기
    public void userSelect() {
        int index = findIndex();
        if (index != -1) { // 인덱스 있는 경우
            MemberDTO m = select(index);
            int id = m.getId();
            int age = m.getAge();
            String name = m.getName();
            String address = m.getAddress();
            System.out.println("< " + name + " 의 회원정보 >");
            System.out.println(" - 회원번호 : " + id);
            System.out.println(" - 이름 : " + name);
            System.out.println(" - 나이 : " + age);
            System.out.println(" - 주소 : " + address);
        } else {
            System.out.println("회원이 없습니다.");
        }
    }

    // user Update
    public void userUpdate() {
        int index = findIndex();
        if (index != -1) {
            // 이름이 있는 경우
            MemberDTO m = new MemberDTO();
            m.setId(mlist.get(index).getId());
            m.setName(mlist.get(index).getName());
            System.out.println("< " + m.getName() + " 회원 정보 수정 >");
            System.out.println("회원번호 : " + m.getId());
            System.out.print("나이 : ");
            m.setAge(sc.nextInt());
            System.out.print("주소 : ");
            m.setAddress(sc.next());

            update(index, m);
            System.out.println("수정되었습니다.");

        } else {
            // 이름이 없는 경우
            System.out.println("해당 회원이 없습니다.");
        }
    }

    // printAll - 전체리스트 출력
    public void printAll() {
        System.out.println("<전체회원목록>");
        int index = 1;
        for (int i = 0; i < mlist.size(); i++) {
            System.out.println("< " + index + " : " + mlist.get(i).getName() + " 회원 > ");
            System.out.println("회원번호 : " + mlist.get(i).getId() + " > ");
            System.out.println("나이 : " + mlist.get(i).getAge() + " > ");
            System.out.println("주소 : " + mlist.get(i).getAddress() + " > ");
            index++;
        }
    }

    // File method

    public void dataSave() throws Exception {
        file.create();

        String str = " 번호\t 이름\t 나이\t 주소\n"
                + "----------------------------------------\n";

        for (int i = 0; i < mlist.size(); i++) {
            str += mlist.get(i).toString() + "\n";
        }
        System.out.println("데이터를 저장했습니다.");
        file.write(str);
    }

    public void dataLoad() {
        try {
            file.read();
        } catch (Exception e) {
            System.out.println("읽을 파일이 없습니다.");
        }
    }

}
