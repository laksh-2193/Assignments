/**
 *  Write a Program in Java to input a number and check whether it is a Disarium Number or not.
Note: A number will be called DISARIUM if sum of its digits powered with their respective position is equal to
the original number.
For example 135 is a DISARIUM
(Workings 11
    +32
    +53
 = 135, some other DISARIUM are 89, 175, 518 etc) 
 */
import java.util.Scanner;
public class Ques_6 {
    public static void main(String args[])
    {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input a number : ");
            int num = sc.nextInt();
            int copy = num, d = 0, sum = 0;
            String s = Integer.toString(num);  
            int len = s.length();  
            while(copy>0)
            {
                d = copy % 10;  
                sum = sum + (int)Math.pow(d,len);
                len--;
                copy = copy / 10;
            }
             
            if(sum == num)
                System.out.println("Disarium Number.");
            else
                System.out.println("Not a Disarium Number.");
        }
    }