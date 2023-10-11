package A1011.aven;

public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account();
        // acc.balance = 1000; 에러. private 필드는 외부에서 사용불가
        acc.setBalance(1000);
        System.out.printf("잔액: %d", acc.getBalance());
    }
}


class Account {
    private int balance;

    // Getter balance값을 호출담당
    public int getBalance() {
        return balance;
    }

    // Setter balance값을 지정담당(필드의 상태 변경)
    public void setBalance(int b) {
        balance = b;
    }

}