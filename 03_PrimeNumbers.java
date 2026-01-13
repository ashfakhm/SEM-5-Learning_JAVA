import java.util.*;
class PINR{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Start Range:");
        int start=s.nextInt();
        System.out.println("Enter The End Of Range:");
        int end=s.nextInt();
        System.out.println("Prime No Between\t"+start+"\tand\t"+end+"\tare\t");
        for(int num=start;num<=end;num++)
        {
            if(num<=1)
            continue;
            int flag=0;
            for(int i=2;i<=(num/2);i++){
                if(num%i==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println(num);
            }
            s.close();


        }

    }

}