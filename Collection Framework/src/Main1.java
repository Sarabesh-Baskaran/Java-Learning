import java.util.*;
public class Main1{
    public static void main(String[]args){
        Collection<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(75);
        numbers.add(30);
        numbers.add(15);

        //checking Methods
        System.out.println(numbers.size());

        System.out.println(numbers.contains(15)); //It checks whether the number is there or not.

        System.out.println(numbers.isEmpty());  //It checks it is empty or not.

        numbers.remove(10);

        System.out.println(numbers);

        numbers.clear();   //It removes all elements
        System.out.println(numbers);

    }
}