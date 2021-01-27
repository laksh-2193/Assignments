/**
 *Write a Program in Java to input a number and check whether it is a Pronic Number or Heteromecic
Number or not.
Pronic Number : A pronic number, oblong number, rectangular number or heteromecic number, is a number
which is the product of two consecutive integers, that is, n (n + 1). 
 */
import java.util.*;
public class Ques_10 {
    public static void main(String args[])
       {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");
        int num = sc.nextInt();
        int ans = 0;
        for(int i=0; i<num; i++)
        {
            if(i*(i+1) == num)
            {
                ans = 1;
                break;
            }
        }
         
        if(ans == 1)
            System.out.println("Pronic Number.");
        else
            System.out.println("Not a Pronic Number.");      
    }
}