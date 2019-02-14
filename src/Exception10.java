
import java.util.Scanner;

class Branch11{
    public void func123() throws Exception{
        System.out.println("Connection2 established");
        
        Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Numerator");
    int a = scan.nextInt();
    System.out.println("Enter the Demoinator");
    int b = scan.nextInt();
    int c;
        c = a/b;
    System.out.println(c);
    
        System.out.println("Connection2 is Terminated");

    }
}
public class Exception10 {
    

  public static void main(String[] args) throws Exception{
      
  
        System.out.println("Connection1 Established");
        Branch11 b = new Branch11();
        b.func123();
        System.out.println("Connection1 Terminated");
}
}