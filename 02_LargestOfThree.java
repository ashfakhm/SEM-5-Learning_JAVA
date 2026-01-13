import java.util.*;
class BIG
{
public static void main(String args[])
{
    int a,b,c;
    Scanner s=new Scanner(System.in);
    System.out.println("enter 3 numbers");
    a=s.nextInt();
    b=s.nextInt();
    c=s.nextInt();
    if(a>b && a>c)
	{
	System.out.println(a+ " Is the largest");
	}
	else if(b>a && b>c)
	{
	System.out.println(b+ " Is the largest");
	}
    else
    {
    System.out.println(c+ " Is the largest");
    }
    s.close();
}
}
