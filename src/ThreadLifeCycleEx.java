package src;

class ThreadLifeCycle extends Thread {

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is in RUNNING state.");

            // Simulating Timed Waiting state (sleep for 2 seconds)
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " is in TIMED_WAITING state.");

            // Simulating Waiting state (waiting for 3 seconds)
            synchronized (this) {
                wait(3000);
            }
            System.out.println(Thread.currentThread().getName() + " is in WAITING state.");

        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " is interrupted.");
        }
        System.out.println(Thread.currentThread().getName() + " has TERMINATED.");
    }
}

public class ThreadLifeCycleEx
{
    public static void main(String[] args) throws InterruptedException {
        ThreadLifeCycle thread1 = new ThreadLifeCycle();
        System.out.println("Thread 1 is in NEW state.");

        // Start the thread (Thread will move to RUNNABLE state)
        thread1.start();

        // Main thread will wait for thread1 to complete
        thread1.join(); // This will cause main thread to wait until thread1 finishes.

        System.out.println("Main thread has completed execution.");
    }
}
