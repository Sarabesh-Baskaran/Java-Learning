//Interface is actually a agreement/contract. It don't have a method body only it have method signature. It tells class to implement the methods that i have.

interface Animal {
    void sound();
    void toEat();
}

//class which implement the interface
class Dog implements Animal {
    @Override
    public void sound(){
        System.out.println("Dog barks");
    }

    @Override
    public void toEat(){
        System.out.println("Dog eats pedigree");
    }
}

public class InterfaceDemo {

    public static void main(String[] args){
        //basically object creation is not available for interface
        Animal animal = new Dog(); //that's why we are using class to create object
        animal.sound();
        animal.toEat();

        //In interface method body is mostly default or static.
        //Fields like variables are public, static, final.
    }
}