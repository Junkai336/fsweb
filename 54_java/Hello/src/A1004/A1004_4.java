package A1004;

public class A1004_4 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        for (i=1; i<=100; i++) {
            System.out.println(i + "번");
            sum += i;
        }

        // System.out.println("1~100합 : " + sum);
        // System.out.println("1~" + (i-1) + "번 : " + sum);
        System.out.printf("1~%1$d 합 : %2$d\n" , (i-1) , sum);
    }
}
