

import java.util.Scanner;



public class Exception3 {

public static void main(String[] args){
    System.out.println("Connection is established");
    try{
        
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Numerator");
    int a = scan.nextInt();
    System.out.println("Enter the Demoinator");
    int b = scan.nextInt();
    int c;
        c = a/b;
    System.out.println(c);
    //===============================================================//
    System.out.println("Enter the size of array");
    int size = scan.nextInt();
    
    int x[] = new int[size];
    System.out.println("Enter the Elements to be inserted");
    int elem = scan.nextInt();
    System.out.println("Enter the position at which the element has to be inserted");
    int i = scan.nextInt();
    x[i] = elem;
        System.out.println(x[i]);
    }
    
    catch(Exception e){
            System.out.println("Some problem ocurred");
           }
    System.out.println("Connection terminated");
}
}