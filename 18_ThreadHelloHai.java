// Demonstrates multithreading in Java by printing "Hello" and "Hai" alternately
// Each thread prints its message 6 times with a 500ms pause between prints

class HaiThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hai");
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("HaiThread interrupted: " + e);
            }
        }
    }
}

class HelloThread extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("HelloThread interrupted: " + e);
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        // Create thread objects
        HaiThread haiThread = new HaiThread();
        HelloThread helloThread = new HelloThread();

        // Start both threads
        haiThread.start();
        helloThread.start();
    }
}
