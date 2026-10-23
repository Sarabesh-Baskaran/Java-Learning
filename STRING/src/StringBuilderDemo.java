//                  STRINGBUILDER
//Here, StringBuilder is Mutable, it is not same like String. We can modify the same object, it will not create new object. And the thread is not safe.
public class StringBuilderDemo{
    public static void main(String[]args){
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println(sb.append(" World"));          // Hello World
        System.out.println(sb.insert(5, ","));            // Hello, World
        System.out.println(sb.replace(0, 5, "Hi"));       // Hi, World
        System.out.println(sb.delete(2, 3));              // Hi World      (index 2 to 3 munnadi varai)
        System.out.println(sb.reverse());                 // dlroW iH

        StringBuilder sb2 = new StringBuilder("abc");
        sb2.setCharAt(0, 'X');        // Xbc
        sb2.deleteCharAt(1);          // Xc
        sb2.length();                 // 2

        String result = new StringBuilder().append("a").append(1).append(true).append(2.5).toString(); // a1true2.5
        System.out.println(result); //Here append will accept every datatypes.

    }
}