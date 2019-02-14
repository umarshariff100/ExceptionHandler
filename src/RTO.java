
import java.util.Scanner;

class UnderAgeException {

    public String getMessage() {
        return "You are too young";
    }
}

class OverAgeException {

    public String getMessage() {
        return "Your too old, cool down";
    }
}

class Applicant {

    private int age;

    public void collectInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age");
        age = scan.nextInt();
    }

    public void verify() throws Exception {
        if (age < 18) {
            UnderAgeException uae = new UnderAgeException();
            System.out.println(uae.getMessage());
            throw uae;
        } else if(age > 65)  {

            OverAgeException oae = new OverAgeException();
            System.out.println(oae.getMessage());
            throw oae;
        } else {
            System.out.println("Collect your DL!!!");
        }
    }
}

class RTOO {

    public void initiate() {
        Applicant a = new Applicant();
        try {
            a.collectInput();
            a.verify();
        } catch (Exception e) {
            try {
                a.collectInput();
                a.verify();
            } catch (Exception f) {
                try {
                    a.collectInput();
                    a.verify();
                } catch (Exception g) {
                    System.exit(0);

                }

            }
        }
    }
}

public class RTO {

    public static void main(String[] args) {
        RTOO rto = new RTOO();
        rto.initiate();
    }

}
