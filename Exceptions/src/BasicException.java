//Problem1 Basic Try-Catch
public class BasicException{
    public static void main(String[]args){
        int a = 6;
        int b = 0;
        int c;
        //if we suspect the code may throw exception we will have to handle that code in try catch block.
        try{
            c = a/b;
        }
        catch(ArithmeticException e){
            System.out.println("cannot " + e.getMessage());
        }
    }
}
