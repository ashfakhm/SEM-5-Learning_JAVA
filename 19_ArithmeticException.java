import java.util.*;
class ArithmeticCheck{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
    	System.out.println("Enter The Number 10 or less value");
    	int k = s.nextInt();
try{
if(k<10){
throw new ArithmeticException("Value of k is less than 10");
}else{
System.out.println("k = "+k+" is Valid");
}
}catch(ArithmeticException e){
System.out.println("Exception Caught:"+e);
}
}
}
