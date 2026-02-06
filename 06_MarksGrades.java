import java.util.*;
class Grade{
public static void main(String args[])
	{
	int Avg,a,b,c,Cgpa;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your Marks");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		Avg=(a+b+c)/3;
		Cgpa=Avg/10;
		System.out.println("Average Is "+Avg);
		
		
		switch(Cgpa)
		{
		case 10 :
		case 9  : System.out.println("A Grade");
				break;
		case 8  : System.out.println("B Grade");
				break;
		case 7  : System.out.println("C Grade");
				break;
		case 6  : System.out.println("D Grade");
				break;
		case 5  : System.out.println("E Grade");
				break;
		default: System.out.println("You Failed");
		
		}
	}
}
