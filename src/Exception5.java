
import java.util.Scanner;

class Alpha{
    
    public void func1(){
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Numerator");
    int a = scan.nextInt();
    System.out.println("Enter the Demoinator");
    int b = scan.nextInt();
    int c;
        c = a/b;
    System.out.println(c);
    
    
}
}
public class Exception5 {
    public static void main(String[] args){
        Alpha x = new Alpha();
        x.func1();
        }
   
    
}
