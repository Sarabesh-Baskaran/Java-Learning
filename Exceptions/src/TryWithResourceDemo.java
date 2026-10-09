//Try with Resources are one of the concepts in Exception handling, To prevent memory leaks and system resource depletion.
import java.io.*;
public class TryWithResourceDemo{
    public static void main(String[]args){
        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))){
            System.out.println(br.readLine());

        }
        //Java automatically calls br.close() right here
        catch(Exception e){
            System.out.println("Exception caught here " + e.getMessage());
            //e.getMessage this specifies what type of error actually caught in.
        }
    }
}