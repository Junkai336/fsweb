package A1013.exch06;

public class MemberService {
    private String loggedInUser = null;

    // 로그인 메서드
    public boolean login(String id, String passward) {
        if (id.equals("hong") && (passward.equals("12345"))) {
            loggedInUser = id;
            return true;
        } else {
            return false;
        }
    }
    // 로그아웃 메서드
    public void logout(String id) {
        if(id.equals(loggedInUser)) {
            System.out.println(id + "님이 로그아웃 되었습니다.");
            loggedInUser = null;
        } else {
            System.out.println("로그인한 사용자와 로그아웃 요청한 사용자가 일치하지 않습니다.");
        }
    }
}
