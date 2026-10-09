import java.util.Scanner;

//Problem 2 - Array Index
public class Problem2{
    public static void main(String[] args){
        //Given array
        int[] numbers = {10,20,30,40,50};
        //Scanner class to get input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index: ");
        int index = sc.nextInt();

        try{
            //If its valid index then, it prints the value
            System.out.println("output: " + numbers[index]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}