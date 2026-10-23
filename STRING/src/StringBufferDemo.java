//      STRINGBUFFER
//StringBuffer is also same as StringBuilder. But, every method is synchronized, so it is thread safe. It's also mutable.

public class StringBufferDemo{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hi");
        sb.append(" World");
        sb.reverse();
        System.out.println(sb);   // dlroW olleH
    }
}