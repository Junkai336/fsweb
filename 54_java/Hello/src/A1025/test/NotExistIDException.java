package A1025.test;

public class NotExistIDException extends Exception {
    public NotExistIDException() {}

    public NotExistIDException(String message) {
        System.out.println("아이디가 일치하지 않습니다. : " + message);
    }
}
