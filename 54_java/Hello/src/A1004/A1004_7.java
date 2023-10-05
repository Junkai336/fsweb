package A1004;

public class A1004_7 {
    public static void main(String[] args) {
        int sum = 0;

        int i = 1;

        while(i<=100) {
            sum += i;
            i++;
        }

        System.out.println("1~" + (i-1) + " 합 : " + sum);
    }

    // i++이 위에 있으면 101까지 더해버린다.?
}
