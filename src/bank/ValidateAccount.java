package bank;

public class ValidateAccount {
    public final String MOBILE_NUMBER ="1";
    public final String PASSWORD ="1";

    public boolean checkAcount(String phone, String password) {
        if (phone.equals(MOBILE_NUMBER) ){
            if (password.equals(PASSWORD)) {
                System.out.println("Đăng nhập thành công");
                return true;
            } else {
                System.out.println("Mật khẩu không đúng");
                return false;
            }
        }else{
            System.out.println("Kiểm tra lại số điện thoại ");
            return false;
        }
    }

}
