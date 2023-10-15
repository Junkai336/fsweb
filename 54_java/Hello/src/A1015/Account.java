package A1015;

public class Account {

    // 필드
    private String accountNumber;
    private String accountOwner;
    private int balance;

    // 생성자
    public Account(String accountNumber, String accountOwner, int balance) {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
        this.balance = balance;
    }

    // 게터 세터 (메소드)
    public String getaccountNumber() {
        return accountNumber;
    }

    public String getaccountOwner() {
        return accountOwner;
    }

    public int getbalance() {
        return balance;
    }

    public void setaccountNumber() {
        this.accountNumber = accountNumber;
    }

    public void setaccountOwner() {
        this.accountOwner = accountOwner;
    }

    public void setbalance(int balance) {
        this.balance = balance;
    }

}
