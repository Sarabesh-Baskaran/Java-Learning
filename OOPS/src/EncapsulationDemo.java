//Encapsulation - Private Fields + public Getter / Setter methods.

class BankAccount {
    private double balance; //private fields.

    //Getter method
    public double getBalance() {
        return balance;
    }

    //Setter method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args){
        BankAccount acc = new BankAccount();

        acc.deposit(1500);
        acc.withdraw(500);
        System.out.println(acc.getBalance());
    }
}



