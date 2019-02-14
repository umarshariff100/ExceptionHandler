
import java.util.*;


public class Exception2 {
    public static void main(String[] args){
        try{
        System.out.println("Connection is eshtablished");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numerator");
        int a = scan.nextInt();
        System.out.println("Enter the denominator");
        int b = scan.nextInt();
        int c = a/b;
        System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Some problem occured");
                }
        System.out.println("Connection Terminated");
        }
    
               
}
