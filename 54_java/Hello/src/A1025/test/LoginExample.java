package A1025.test;

public class LoginExample {
    public static void main(String[] args) {
        try {
            login("white", "12345");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            login("blue", "54321");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

    public static void login(String id, String password) throw [ NotExistIDException | WrongPasswordException ] {
        if(!id.equals("blue")) {
            NotExistIDException.message = e.getMessage;
            NotExistIDException();
        }
        if(!password.equals("12345")) {
            NotExistIDException.message = e.getMessage;
            WrongPasswordException();
        }
    }

