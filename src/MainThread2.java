package src;

class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Threads are Runnable.");
    }
}
public class MainThread2 {
    public static void main(String[] args) {
        MyRunnable runnable= new MyRunnable();
        Thread t = new Thread(runnable);
        t.start();
    }
}
