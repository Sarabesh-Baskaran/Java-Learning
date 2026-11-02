//2.Implement the Runnable Interface. it is also functional interface because it contains one abstract method.
class MyTask implements Runnable{
    @Override
    public void run(){
        System.out.println("Task is running");
    }

}


public class Main2{
    public static void main(String[]args){

        MyTask task = new MyTask();

        Thread t1 = new Thread(task);
        t1.start();
    }
}
//A Runnable task can also be submitted to an executor or thread pool later.