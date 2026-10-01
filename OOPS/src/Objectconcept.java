class Car {
    String color;
    int speed;

    void drive(){
        System.out.println(color + " car driving at " + speed + "km/h");
    }
}

public class Objectconcept {

    public static void main(String[]args){
        //Object Creation that is actual instance by using new keyword using Car class
        Car carr = new Car();
        carr.color = "Green";
        carr.speed = 100;
        //Each object has own copy of fields, built from same blueprint.
        Car carr2 = new Car();
        carr2.color = "Red";
        carr2.speed = 200;

        carr.drive();
        carr2.drive();
    }
}