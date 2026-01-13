class Hai extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hai");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Hello extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Hai h1 = new Hai();
        Hello h2 = new Hello();

        h1.start();
        h2.start();
    }
}
