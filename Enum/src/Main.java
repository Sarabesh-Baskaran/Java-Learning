//Enum is used to declare fixed set of constants.
//By the way, its convention is enum name uses PascalCase, while constant values are UPPER_SNAKE_CASE and separated by comma.
//Declaration is outside or inside of a class but, never inside a method.
enum TrafficLight{
    RED,
    YELLOW,
    GREEN;
}

public class Main{
    public static void main(String[] args){
        TrafficLight signal = TrafficLight.GREEN;
        if(signal == TrafficLight.GREEN){
            System.out.print("We can go.");
        }

    }
}