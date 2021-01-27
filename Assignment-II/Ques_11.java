/**
 * Write a Program in Java to input a number and check whether it is a Harshad Number or Niven Number
or not..
Harshad Number : In recreational mathematics, a Harshad number (or Niven number), is an integer (in base
10) that is divisible by the sum of its digits.
 */
import java.util.*;
class Ques_11
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int c = n, d, sum = 0;
         
        //finding sum of digits
        while(c>0)
        {
            d = c%10;
            sum = sum + d;
            c = c/10;
        }
         
        if(n%sum == 0)
            System.out.println(n+" is a Harshad Number.");
        else
            System.out.println(n+" is not a Harshad Number.");      
    }
}