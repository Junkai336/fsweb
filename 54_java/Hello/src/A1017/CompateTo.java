package A1017;

public class CompateTo {
    public static void main(String[] args) {
        String str = new String("abcd");
        System.out.println("원본 문자열 : " + str);

        System.out.println(str.compareTo("bcef"));
        System.out.println(str.compareTo("abcd"));
        System.out.println(str.compareTo("Abcd")); // 97 - 65 = 32 만큼 크다
        System.out.println(str.compareToIgnoreCase("Abcd"));
    }
}
