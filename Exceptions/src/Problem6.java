import java.util.Scanner;

//Finally Concept
public class Problem6{
    public static void main(String[] args){
        //Scanner class to get input from user
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter your username: ");
            String username = sc.nextLine();

            System.out.print("Enter your password: ");
            int password = sc.nextInt();

            if(username!=null && password>0){
                System.out.println("Authentication Successful");
            }
            else{
                System.out.println("Authentication failed.");
            }
        }
        catch(Exception e){
            System.out.print("There is some minor bugs.");
        }
        finally{
            System.out.print("Closing Login process");
        }
        sc.close();
    }
}