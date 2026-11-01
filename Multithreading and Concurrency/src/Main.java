//Multithreading & Concurrency
//It is a thread syntax in Java
public class Main{
    public static void main(String[]args){
        //creating a thread
        Thread t1 = new Thread(() ->{
            System.out.println("TASK A");
        });
        t1.start();
        //when we put start() function it results in asynchronous execution
        //when we put run() function it results in Sequential execution.

        System.out.println("TASK B");
    }
}
/*
* Why it prints Task B then Task A is start() method tells JVM to create new thread and execute code inside
* lambda block asynchronously. While, creating a new thread takes few CPU cycles. when JVM is busy with creating
* a new thread, the main thread carry next line and prints TASK B first, then new thread wakes up and prints
* TASK A.
* */