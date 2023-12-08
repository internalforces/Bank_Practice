import java.util.Scanner;

public class BankManagementProgram {
    public static void main(String[] args) {
        BankManager bankManager = new BankManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== 은행 관리 프로그램 =====");
            System.out.println("1. 계좌 개설");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("4. 계좌 조회");
            System.out.println("5. 종료");
            System.out.print("메뉴 선택: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bankManager.openAccount();
                    break;
                case 2:
                    bankManager.deposit();
                    break;
                case 3:
                    bankManager.withdraw();
                    break;
                case 4:
                    bankManager.checkBalance();
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("올바르지 않은 메뉴 선택입니다. 다시 선택해주세요.");
            }
        }
    }
}
