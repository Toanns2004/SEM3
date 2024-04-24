package bank;

import java.util.Scanner;


public class Application {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ValidateAccount validateAccount = new ValidateAccount();
        Controller controller = new Controller();
        boolean isCheck = false;
        while (!isCheck) {
            System.out.print("Nhập số điện thoại: ");
            String mobile = sc.nextLine();

            System.out.print("Nập mật khẩu : ");
            String password = sc.nextLine();
            isCheck = validateAccount.checkAcount(mobile, password);
        }
        while (true) {
            System.out.println("Lựa chọn của bạn: ");
            System.out.println("1: Xem số dư tài khoản");
            System.out.println("2: Chuyển khoản");
            System.out.println("3: Xem lịch sử giao dịch");
            System.out.println("4: Thoát");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("SỐ DƯ: ");
                    long balance = controller.getBalanceNumber();
                    System.out.println(Controller.formatMoney(balance));
                    break;
                case 2:
                    controller.actionTransfer();
                    break;
                case 3:
                    System.out.println("Lịch sử giao dịch: ");
                    controller.getHistory();
                    break;
                case 0:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
                    break;

            }
        }
    }


    public void menu(){

    }
}
