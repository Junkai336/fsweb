package A1025.test;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {}
    public WrongPasswordException(String message) {
        System.out.println("패스워드가 일치하지 않습니다. : " + message);
    }
}
