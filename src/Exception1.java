
import java.util.Scanner;


public class Exception1 {
    public static void main(String[] args){
        System.out.println("Connection is eshtablished");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numerator");
        int a = scan.nextInt();
        System.out.println("Enter the denominator");
        int b = scan.nextInt();
        int c = a/b;
        System.out.println(c);
        System.out.println("Connetcion is terminated");
    }
}
