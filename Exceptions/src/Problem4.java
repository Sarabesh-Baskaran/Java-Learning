import java.util.Scanner;

//Bonus Question
public class Problem4{
    public static void main(String[]args){
        int[] arr = {10,20,30};
        Scanner sc = new Scanner(System.in);
        try{



        System.out.print("Enter index: ");
        int index = Integer.parseInt(sc.nextLine());

        System.out.print("Enter divisor: ");
        int divisor = Integer.parseInt(sc.nextLine());


            System.out.println(arr[index]/divisor);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index number & out of bound");
        }
        catch(NumberFormatException e){
            System.out.println("please enter a valid number not string");
        }
        catch(ArithmeticException e){
            System.out.println("Division by Zero");
        }
        sc.close();


    }

}