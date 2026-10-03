//Polymorphism means Many Forms. It have two types

//1.Method Overloading (Compile Time Polymorphism)
//In this method overloading, same method name but, different parameters.

class Calc {
    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b, double c){
        return a+b+c;
    }
}

public class PolymorphismDemo {
    public static void main(String[] args){
        Calc c = new Calc();
        System.out.println(c.add(2,3));

        System.out.println(c.add(1.2,5.3,3.1));
    }
}

//2.Method Overriding (Runtime Polymorphism)
//In this, method Overriding child class redefines the parent class method.

class Men {
    void gender(){
        System.out.println("Male");
    }
}

class Women extends Men {
    @Override
    void gender(){
        System.out.println("Female");
    }
}

public class PolymorphismDemo{
    public static void main(String[] args){
        //We cannot create object for parent class. eventhough we create its no use.
        Women w = new Women();
        w.gender();
    }
}