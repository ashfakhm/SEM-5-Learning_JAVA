import java.util.*;
class rpm{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no of rows you need");
        int rows = s.nextInt();
        System.out.println("Enter the no of Colomns need");
        int colomns = s.nextInt();
        System.out.println("Enter The Elements:");
        int a[][]= new int[rows][colomns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<colomns;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        
        System.out.println("The Matrix Is");
         for(int i=0;i<rows;i++)
        {
            for(int j=0;j<colomns;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("The Transpose Matrix Is");
        for(int i=0;i<colomns;i++)
        {
            for(int j=0;j<rows;j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.println("");
        }
    }
}
