
/**
 * Program to check whether the input is Armstrong number or not
 */
import java.util.Scanner;
public class Ques_8
{
    
    public static void main(String args[])
    {
         
        Scanner in = new Scanner(System.in);
        int c=0,a,temp;  
    int n=in.nextInt();//It is the number to check armstrong  
    temp=n;  
    while(n>0)  
    {  
        a=n%10;  
        n=n/10;  
        c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("armstrong number");   
    else  
        System.out.println("Not armstrong number");   
   }  
}  
   