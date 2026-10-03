//Super keyword is using for calling or utilizing parent class constructor/method by child class.

class Vehicle {
    String brand;
    Vehicle(String brand) {
        this.brand = brand;
    }

    void start(){
        System.out.println("Vehicle is in running state");
    }
}

class Bike extends Vehicle {
    Bike(String brand){
        super(brand);
    }

    @Override
    void start(){
        System.out.println("Bike is now set to go.");
    }
}

public class SuperDemo{
    public static void main(String[] args){
        Bike b = new Bike("Royal Enfield");
        b.start();
        //output is just simply override the parent class constructor or its method output.
        //Output: Bike is now set to go.
    }
}

