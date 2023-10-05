package A1005;

public class A1005_7 {
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        String firstNum = ssn.substring(0, 6); //인덱스 6번(-) 전까지. 때문에 880815 까지만 나온다.
        System.out.println(firstNum);

        String secondNum = ssn.substring(7);
        System.out.println(secondNum);

    }
}
