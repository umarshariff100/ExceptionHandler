
import java.util.Scanner;

public class Exception4 {

    public static void main(String[] args) {
        System.out.println("Connection is established");
        try {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the Numerator");
            int a = scan.nextInt();
            System.out.println("Enter the Demoinator");
            int b = scan.nextInt();
            int c;
            c = a / b;
            System.out.println(c);
            
            ///===============================================================/////

            System.out.println("Enter the size of array");
            int size = scan.nextInt();

            int x[] = new int[size];
            System.out.println("Enter the Elements to be inserted");
            int elem = scan.nextInt();
            System.out.println("Enter the position at which the element has to be inserted");
            int i = scan.nextInt();
            x[i] = elem;
            System.out.println(x[i]);
        } catch (ArithmeticException e) {
            System.out.println("Give a non zero Denomiator");
        } catch (NegativeArraySizeException f) {
            System.out.println("Give a postive array size");
        } /* catch (ArrayIndexOutOfBoundException g){
        System.out.println("give a proper index which is within the size limits");
    }*/ catch (ArrayStoreException h) {
            System.out.println("Giva a valid type of input");
        } catch (Exception i) {
            System.out.println("Some problem occurred");
        }
        System.out.println("COnnection Terminated");

    }
}
