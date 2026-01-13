import java.util.*;
class sortA{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Array Size");
        int n=s.nextInt();
        int A[]=new int[n];
        int i;
        System.out.println("Enter The Array Elements");
        for(i=0;i<n;i++)
        {
            A[i]=s.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(A[j]>A[j+1])
                {
                    int temp = A[j];
                    A[j]=A[j+1];
                    A[j+1]= temp;
                    
                }
            }
        }
        System.out.println("Sorted Array");
        for(i=0;i<n;i++)
        {
            System.out.print(A[i]+" ");
        }
        


    }
}