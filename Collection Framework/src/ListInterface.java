//List is a child interface of Collection Interface.
/*
* The main characteristics about list interface is
* 1)It orders the collection of elements.
* 2)It doesn't care about the duplicates. so, it allows duplicates.
* 3)It supports index based access.*/

import java.util.*;
public class ListInterface{
    public static void main(String[]args){
        List<String> names = new ArrayList<>();
        names.add("Suresh");
        names.add("Kannan");
        names.add("Vignesh");
        names.add("Suresh");

        //if we have to view any one of the name in the list we have to access that using index value.
        System.out.println(names.get(1)); //It Retrieves the element.
        names.add(4,"sarabesh"); //It inserts element at particular index.
        System.out.println(names);
        names.set(2,"Ajay"); //We can set an element at particular index.
        System.out.println(names);
        System.out.println(names.indexOf("sarabesh")); // we can get the index value
        System.out.println(names.lastIndexOf("sarabesh")); //To find the last index value. if element doesn't exist it returns -1.
    }
}