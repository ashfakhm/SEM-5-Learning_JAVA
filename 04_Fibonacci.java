import java.util.*;
class Fibonacci {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the limit for Fibonacci Series:");
        int limit = s.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci Numbers up to " + limit + ": ");
        while (a <= limit) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        s.close();
    }
}