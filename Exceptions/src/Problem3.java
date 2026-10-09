import java.util.Scanner;

//Problem 3 - String to integer
public class Problem3{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        String input = sc.nextLine();
        try{
            int age = Integer.parseInt(input);
            //If it converts,
            System.out.print("Output: " + age);
        }

        catch(NumberFormatException e){
            System.out.println("Please enter a valid number: " + e.getMessage());
        }
        sc.close();
    }
}