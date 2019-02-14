
import java.util.Scanner;

class InvalidCustomerException extends Exception {

    @Override
    public String getMessage() {
        return "Invalid password try again..!";
    }
}

class ATM1 {

    private final int acc_num = 2222;
    private final int pass_wd = 1234;
    private int an;
    private int pw;

    public void collectInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Account Number");
        an = scan.nextInt();
        System.out.println("Enter the Password");
        pw = scan.nextInt();
    }

    public void Verify() throws Exception {
        if (an == acc_num && pass_wd == pw) {
            System.out.println("Collect Your Money!!!!");
        } else {
            InvalidCustomerException ice = new InvalidCustomerException();
            System.out.println(ice.getMessage());
            throw ice;
        }
    }

}

class Bank123 {

    public void Initiate() {
        ATM1 atm = new ATM1();
        try {
            atm.collectInput();
            atm.Verify();

        } catch (Exception e) {
            try {
                atm.collectInput();
                atm.Verify();
            } catch (Exception f) {
                try {
                    atm.collectInput();
                    atm.Verify();
                } catch (Exception g) {
                    System.exit(0);
                }
            }
        }

    }
}

public class ExceptionBankApp1 {

    public static void main(String[] args) {
        Bank12 b = new Bank12();
        b.Initiate();
    }

}
