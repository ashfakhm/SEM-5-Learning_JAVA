import p1.*;
import java.util.*;
class CheckPrime {
    public void check(int x) {
        Prime p = new Prime();
        if (p.isPrime(x) == 1)
            System.out.println(x+" is a Prime Number");
        else
            System.out.println(x+" is Not a Prime Number");
    }

    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter The Number For Checking");
    	int x = s.nextInt();
        CheckPrime cp = new CheckPrime();
        cp.check(x);
        s.close();
    }
}

