import java.util.ArrayList;
import java.util.Scanner;
public class BankManager {
    private ArrayList<BankAccount> accounts;
    private Scanner scanner;

    public BankManager() {
        accounts = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void openAccount() {
        System.out.print("계좌번호 입력: ");
        String accountNumber = scanner.next();

        System.out.print("예금주 입력: ");
        String accountHolder = scanner.next();

        System.out.print("초기 입금액 입력: ");
        double initialBalance = scanner.nextDouble();

        BankAccount newAccount = new BankAccount(accountNumber, accountHolder, initialBalance);
        accounts.add(newAccount);

        System.out.println("계좌가 개설되었습니다.");
    }

    public void deposit() {
        System.out.print("입금할 계좌번호 입력: ");
        String accountNumber = scanner.next();

        BankAccount account = findAccount(accountNumber);

        if (account != null) {
            System.out.print("입금할 금액 입력: ");
            double amount = scanner.nextDouble();
            account.deposit(amount);
        } else {
            System.out.println("해당하는 계좌가 없습니다.");
        }
    }

    public void withdraw() {
        System.out.print("출금할 계좌번호 입력: ");
        String accountNumber = scanner.next();

        BankAccount account = findAccount(accountNumber);

        if (account != null) {
            System.out.print("출금할 금액 입력: ");
            double amount = scanner.nextDouble();
            account.withdraw(amount);
        } else {
            System.out.println("해당하는 계좌가 없습니다.");
        }
    }

    public void checkBalance() {
        System.out.print("조회할 계좌번호 입력: ");
        String accountNumber = scanner.next();

        BankAccount account = findAccount(accountNumber);

        if (account != null) {
            account.displayInfo();
        } else {
            System.out.println("해당하는 계좌가 없습니다.");
        }
    }

    private BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}