//              STRING - Character Sequence.
//String is Immutable, once it is created we cannot change its assigned Value. Even when we call the method to change its value new object will be created in heap. But the object value can never be changed.
public class StringPoolDemo{
    public static void main(String[]args){
        String s1 = "Hii";  //String Literal -> String Pool it can be also used by s2.
        String s2 = "Hii";

        String s3 = new String("Hii"); //Using New keyword creates a new object in Heap.
        System.out.println(s1==s2); //Here it returns true, because == it points out the reference address not value.
        System.out.println(s1==s3); //Here, it returns false, s1 and s3 are different address.
        System.out.println(s1.equals(s3)); //Here, it returns true, because .equals only means the value not the reference address.

        String s4 = s3.intern(); //Here, intern() method will convert heap object into pool object.
        System.out.println(s1==s4); //Return True, because s1 get the value from String Pool.
    }
}

/*
* Why String is Immutable?
* Database URL, Password, File Path will not get changed.
* String Pool is Safe. because one value change will not affect the other variable value.
* String is Immutable, So thread safe.
* Hash Code will never get changed. so the keys will be safe.*/