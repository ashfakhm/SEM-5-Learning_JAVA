class factorial{
int fact(int n){
int result;
if(n==1) return 1;
result=fact(n-1)*n;
return result;
}
}
// Class to calculate factorial using recursion
class Factorial {
	// Recursive method to calculate factorial
	int fact(int n) {
		// Base case: factorial of 1 is 1
		if (n == 1) return 1;
		// Recursive case: n * factorial of (n-1)
		return n * fact(n - 1);
	}
}
class Recursion{
public static void main(String Args[]){
factorial f = new factorial();
System.out.println("Factorial of 5 is"+" "+f.fact(5));
}
// Main class to test factorial calculation
class Recursion {
	public static void main(String args[]) {
		Factorial f = new Factorial();
		int number = 5;
		System.out.println("Factorial of " + number + " is " + f.fact(number));
	}
}
}
