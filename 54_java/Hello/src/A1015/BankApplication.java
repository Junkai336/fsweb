package A1015;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accountArray = new Account[100];
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        O: while (run) {
            System.out.println("---------------------------------------------------------");
            System.out.println("1.계좌생성 ㅣ 2.계좌목록 ㅣ 3.예금 ㅣ 4.출금 ㅣ 5.종료");
            System.out.println("---------------------------------------------------------");
            System.out.print("선택: ");

            String selectNumber = scan.nextLine();

            switch (selectNumber) {
                case "1":
                    createAccount();
                    break;
                case "2":
                    accountList();
                    break;
                case "3":
                    deposit();
                    break;
                case "4":
                    widthdraw();
                    break;
                case "5":
                    run = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해 주십시오.");
                    continue O;
            }
        }
        System.out.println("프로그램 종료");
    }

    private static void createAccount() {

        boolean run = true;

        O: while (run) {

            System.out.println("-------------");
            System.out.println("1. 계좌생성");
            System.out.println("-------------");

            System.out.print("계좌번호 입력 (- 포함): ");
            String checkNumber = scan.nextLine();
            String accountNumber = checkNumber;

            String[] checkNumber2 = checkNumber.split("");

            for (int i = 0; i < checkNumber2.length; i++) {
                if (checkNumber2[i].matches("^[0-9]") || checkNumber2[i].matches("-")) {
                } else {
                    System.out.println("계좌번호를 정확히 입력해 주세요.");
                    continue O;
                }
            }

            System.out.print("계좌주 입력: ");
            String accountOwner = scan.nextLine();

            System.out.print("초기입금액 입력: ");
            String checkBalance = scan.nextLine();

            String[] checkBalance2 = checkBalance.split("");

            for (int i = 0; i < checkBalance2.length; i++) {
                if (checkBalance2[i].matches("^[0-9]")) {
                } else {
                    System.out.println("숫자를 입력해 주세요.");
                    continue O;
                }
            }

            int balance = Integer.parseInt(checkBalance);

            Account account = new Account(accountNumber, accountOwner, balance);

            for (int a = 0; a < accountArray.length; a++) {
                if (accountArray[a] == null) {
                    accountArray[a] = account;
                    System.out.println("계좌가 생성되었습니다.");
                    break;
                }
            }
            break;
        }
    }

    private static void accountList() {
        System.out.println("----------------------");
        System.out.println("계좌목록");
        System.out.println("----------------------");

        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                break;
            }
            System.out.println((i + 1) + "번째 계좌: " + accountArray[i].getaccountNumber() + "\t"
                    + accountArray[i].getaccountOwner() + "\t" + accountArray[i].getbalance());
        }
    }

    private static void deposit() {
        System.out.println("-----------");
        System.out.println("3.예금하기");
        System.out.println("-----------");

        System.out.print("계좌번호 입력: ");
        // 지역변수인듯?
        String accountNumber = scan.next();

        System.out.print("예금액 입력: ");
        int balance = scan.nextInt();

        Account account = findAccount(accountNumber);

        if (account == null) {
            System.out.println("계좌가 존재하지 않습니다.");
            return;
        }

        account.setbalance(account.getbalance() + balance);
        System.out.println("결과: " + account.getbalance());
    }

    private static void widthdraw() {
        System.out.println("-----------");
        System.out.println("4.출금하기");
        System.out.println("-----------");

        System.out.print("계좌번호 입력: ");
        // 지역변수인듯?
        String accountNumber = scan.next();

        System.out.print("출금액 입력: ");
        int balance = scan.nextInt();

        Account account = findAccount(accountNumber);

        if (account == null) {
            System.out.println("계좌가 존재하지 않습니다.");
            return;
        }

        if (account.getbalance() < balance) {
            System.out.println("예금액보다 많이 출금할 수 없습니다.");
            return;
        }

        account.setbalance(account.getbalance() - balance);
        System.out.println("결과: " + account.getbalance());
    }

    // findAccount() {} 예금 출금용 동일한 Account 객체 찾기
    private static Account findAccount(String accountNumber) {
        Account account = null;
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] != null) {
                if (accountArray[i].getaccountNumber().equals(accountNumber)) {
                    account = accountArray[i];
                    break;
                }
            }
        }
        return account;
    }

}
