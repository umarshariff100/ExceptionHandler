
import java.util.Scanner;

class ATM{
    private int acc_num = 2222;
    private int pass_wd = 1234;
    private int an;
    private int pw;
    
    public void collectInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Account Number");
        an = scan.nextInt();
        System.out.println("Enter the Password");
        pw = scan.nextInt();
    }
    
    public void Verify(){
        if(an==acc_num && pass_wd == pw){
            System.out.println("Collect Your Maoney !!!!");
        }
        else{
            System.out.println("Invalid password, Try Again!");
        }
    }
    
}

class Bank12{
    public void Initiate(){
        ATM atm = new ATM();
        atm.collectInput();
        atm.Verify();
    }
}
public class ExceptionBankApp {
    public static void main(String[] args){
        Bank12 b= new Bank12();
        b.Initiate();
    }
    
}
