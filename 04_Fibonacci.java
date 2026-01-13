import java.util.*;
class fibannoci{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int start,end;
        start = 0;
        System.out.println("Enter The Limit of Fibonacci Series:");
        end = s.nextInt();
        int a=0,b=1;
        System.out.println("Fibonnaci Numbers In The range " +start + " to " +end+ " : ");
        while (a<=end) {
            if(a>=start)
            {
               System.out.print(a + " "); 
            }
            int next = a + b;
            a=b;
            b=next;
        }
        s.close();
    

    }
}