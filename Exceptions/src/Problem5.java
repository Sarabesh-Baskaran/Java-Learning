import java.util.Scanner;

//Finally
public class Problem5{
    public static void main(String[]args){
        int a = 100;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter a number: ");
            int b = sc.nextInt();
            int c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed");
        }
        finally{
            System.out.print("Program Execution Completed");
        }
        sc.close();
    }
}