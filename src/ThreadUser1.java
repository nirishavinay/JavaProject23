package src;

class MyThreadClass1 implements Runnable{
    @Override
    public void run(){
        System.out.println("Through run method: "+Thread.currentThread().getName());
        System.out.println("Through run method: "+Thread.currentThread().getState());
        System.out.println("Through run method: "+Thread.currentThread().getId());
        System.out.println("Through run method: "+Thread.currentThread().getPriority());
    }
}
public class ThreadUser1 {
    public static void main(String[] args) {
        System.out.println("Through main method: "+Thread.currentThread().getName());
        System.out.println("Through main method: "+Thread.currentThread().getState());
        System.out.println("Through main method: "+Thread.currentThread().getId());
        System.out.println("Through main method: "+Thread.currentThread().getPriority());
        MyThreadClass1 myThreadClass1=new MyThreadClass1();
         Thread thread=new Thread(myThreadClass1);
        Thread thread1=new Thread(myThreadClass1);
         thread.start();
         thread1.start();
    }
}
