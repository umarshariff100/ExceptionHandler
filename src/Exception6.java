
import java.util.Scanner;



class Alpha1{
    
    public void func11(){
    
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
    
    class Beta{
        public void func2(){
        Alpha1 x = new Alpha1();
            x.func11();
        }
       
        }
        
        
    class Gamma{
        public void func3(){
        Beta y = new Beta();
        y.func2();
    }    
    
    }


public class Exception6 {
    public static void main(String[] args){
        Gamma z = new Gamma();
        z.func3();
    }
}
