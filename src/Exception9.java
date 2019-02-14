
import java.util.Scanner;

class Branch1 {

    public void func23() {
        System.out.println("Connection2 established");
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the Numerator");
            int a = scan.nextInt();
            System.out.println("Enter the Demoinator");
            int b = scan.nextInt();
            int c;
            c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Problem resolved in Branch");
            throw e;
        } finally {
            System.out.println("Connection2 is Terminated");
        }
    }
}

public class Exception9 {

    public static void main(String[] args) {

        System.out.println("Connection1 Established");
        try {
            Branch1 b = new Branch1();
            b.func23();
        } catch (Exception e) {
            System.out.println("Problem Resolved in Bank");
        }
        System.out.println("Connection1 Terminated");
    }
}
