//Two foundational ways to create a Thread and we may run our task.

//1.Extend the thread class
class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

public class Main1 {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        t1.start();
    }
}