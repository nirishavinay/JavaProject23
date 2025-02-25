package src;

class PrintNumbers implements Runnable {
    private static int number = 1; // Shared resource for all threads
    private static final int MAX = 10; // The maximum number to print

    @Override
    public void run() {
        // Use synchronized block to ensure only one thread prints at a time
        while (true) {
            synchronized (PrintNumbers.class) {
                if (number <= MAX) {
                    System.out.println(Thread.currentThread().getName() + " printed: " + number);
                    number++; // Increment the number
                    try {
                        // Add a small delay to make output readable
                        Thread.sleep(100); // Optional, for better visualization of threads working
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break; // Exit the loop when the number exceeds MAX
                }
            }
        }
    }

    public static void main(String[] args) {
        PrintNumbers task = new PrintNumbers();
        
        // Create 2 threads, but you can create more if needed
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        
        // Start both threads
        thread1.start();
        thread2.start();
        
        // Wait for both threads to finish execution
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("All threads finished printing numbers.");
    }
}
