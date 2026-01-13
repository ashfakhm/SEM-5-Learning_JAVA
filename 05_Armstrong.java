import java.util.*;

class Armstrong {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a 3-digit number to check if it is an Armstrong number:");
        int num = s.nextInt();
        
        int original = num;
        int sum = 0;

        while (num > 0) { 
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }    

        if (sum == original) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }
    }
}
