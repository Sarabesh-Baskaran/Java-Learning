//Default Constructor - Java itself automatically calls whenever we create object by using new().

class Student {
    String name;
    int age;

    //Default Constructor will be called here
    Student (String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class ConstructorDemo {
    public static void main(String[] args){
        //Object creation
        Student s = new Student("ajay", 21);
        System.out.println(s.name);
        System.out.println(s.age);


        //We can also perform Constructor Overloading and Constructor Chaining.
    }
}