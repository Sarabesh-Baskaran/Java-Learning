abstract class Shape {
    abstract double area(); //abstract method doesn't have body but we can implement

    void display(){
        System.out.println("It is also a shape."); //Normal method with body.
    }
}

class Circle extends Shape {
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    double area() {
        return 3.14 * radius ;
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Circle c = new Circle(6);
        System.out.println(c.area());
    }
}