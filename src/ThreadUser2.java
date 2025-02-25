package src;

class MyThreadClass extends Thread{
    @Override
    public void run(){
        System.out.println("Through run method: "+Thread.currentThread().getName());
        System.out.println("Through run method: "+Thread.currentThread().getState());
        System.out.println("Through run method: "+Thread.currentThread().getId());
        System.out.println("Through run method: "+Thread.currentThread().getPriority());
    }
}
public class ThreadUser2 {
    public static void main(String[] args) {
        System.out.println("Through main method: "+Thread.currentThread().getName());
        System.out.println("Through main method: "+Thread.currentThread().getState());
        System.out.println("Through main method: "+Thread.currentThread().getId());
        System.out.println("Through main method: "+Thread.currentThread().getPriority());
        MyThreadClass myThreadClass=new MyThreadClass();
        Thread thread=new Thread(myThreadClass);
        Thread thread1=new Thread(myThreadClass);
        thread.start();
        thread1.start();
    }
}
