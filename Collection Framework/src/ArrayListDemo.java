//ArrayList is a resizable-array implementation of list interface.
/*
* Characteristics of ArrayList
* 1)It stores elements using internal array.
* 2)It grows when the capacity is needed.
* 3)It maintains insertion order.
* 4)It allows duplicate and null values.
* 5)It provides index-based access.*/

import java.util.*;

public class ArrayListDemo {
    public static void main(String[]args){
      List<Integer>nums=new ArrayList<>(List.of(10,20,40,50));

      nums.add(2,37); //It takes time complexity of O(n) because it have to shift the value next to them.
        System.out.println(nums);



    }
}