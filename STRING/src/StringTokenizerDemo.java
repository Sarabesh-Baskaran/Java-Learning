//  STRINGTOKENIZER - It is default delimiter. It can break the long String into small Tokens.
import java.util.StringTokenizer;
public class StringTokenizerDemo{
    public static void main(String[]args){
        StringTokenizer st = new StringTokenizer("This is String Tokenizer Concept.");
        //To count the Tokens
        System.out.println(st.countTokens()); //5
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken()); //"This" "is" "String" "Tokenizer" "Concept."
        }
    }
}