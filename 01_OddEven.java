import java.util.*;
class OE
{
public static void main(String args[])
{
    int a;
    Scanner s=new Scanner(System.in);
    System.out.println("enter a number to check whether it is odd or even");
    a=s.nextInt();
    if(a%2==0)
	{
	System.out.println(a+ " Is Even");
	}
	else
	{
	System.out.println(a+ " is odd");
	}
	s.close();
	
}
}
