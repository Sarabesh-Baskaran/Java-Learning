//Throw an exception concept

import java.util.Scanner;

public class Problem7{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");

        int age = sc.nextInt();

        try{
            checkAge(age);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }

    }

    public static void checkAge(int age){
        if(age < 18){
            throw new IllegalArgumentException("Not eligible to vote.");
        }
        else{
            System.out.print("You are eligible to vote.");
        }
    }
}