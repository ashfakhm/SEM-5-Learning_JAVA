import java.util.Scanner;

// Demonstrates custom exception handling for input validation
class ArithmeticCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number (10 or greater): ");
		int k = scanner.nextInt();

		try {
			if (k < 10) {
				// Throw exception if input is less than 10
				throw new ArithmeticException("Value of k is less than 10");
			} else {
				System.out.println("k = " + k + " is valid.");
			}
		} catch (ArithmeticException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}

		scanner.close();
	}
}
