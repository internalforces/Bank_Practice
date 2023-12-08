public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("입금 완료. 현재 잔액: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("잔액이 부족합니다. 출금 실패.");
        } else {
            balance -= amount;
            System.out.println("출금 완료. 현재 잔액: " + balance);
        }
    }

    public void displayInfo() {
        System.out.println("계좌번호: " + accountNumber);
        System.out.println("예금주: " + accountHolder);
        System.out.println("잔액: " + balance);
    }
}

