package A1025.a466;

public class ExceptionHandlingExample3 {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            System.out.println("java.lang.String 클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        System.out.println();

        try {
            Class.forName("java.lang.String2");
            System.out.println("java.lang.Strign2 클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}