package A1013.exch06;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(10000);
        System.out.println("현재 잔고: " + account.getBalance()); // 현재 잔고: 10000

        account.setBalance(-100);
        System.out.println("현재 잔고: " + account.getBalance()); // 현재 잔고: 10000

        account.setBalance(2000000);
        System.out.println("현재 잔고: " + account.getBalance()); // 현재 잔고: 10000

        account.setBalance(300000);
        System.out.println("현재 잔고: " + account.getBalance()); // 현재 잔고: 300000
    }
}

// https://velog.io/@yoondgu/Java-%ED%81%B4%EB%9E%98%EC%8A%A4%ED%95%84%EB%93%9C-%EB%A9%94%EC%86%8C%EB%93%9C-%EC%83%9D%EC%84%B1%EC%9E%90-%EA%B0%9C%EB%85%90-%EC%A0%95%EB%A6%AC
// https://danmilife.tistory.com/20
// https://khrdev.tistory.com/entry/Java%EC%97%90%EC%84%9C-%EB%AC%B8%EC%9E%90%EC%97%B4-%EC%95%9E%EB%92%A4-%EA%B3%B5%EB%B0%B1-%EC%A0%9C%EA%B1%B0
// https://redcoder.tistory.com/182