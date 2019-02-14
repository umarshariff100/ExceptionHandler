class Alpha12{
    public void func12(){
        try{
            func12();
        }
        catch(Exception e){
            System.out.println("Problem resolved");
        }
    }
}



public class Exception7 {
    public static void main(String[] args){
        Alpha12 x12 = new Alpha12();
        x12.func12();
    }
}
