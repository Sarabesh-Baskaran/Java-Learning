import java.util.Scanner;

// 1. Create the custom unchecked exception class
class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        }
        catch(InvalidAgeException e) {
            System.out.print(e.getMessage());
        }
        sc.close(); // Good practice to close the scanner
    }

    public static void checkAge(int age) {
        if(age < 18) {
            throw new InvalidAgeException("Not eligible to Vote.");
        }
        else {
            System.out.print("Eligible to Vote.");
        }
    }
}
