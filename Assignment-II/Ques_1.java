
/**
 *  Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the
name of the weekday.
Test Data
Input number: 3
Expected Output :
Wednesday
 */
import java.util.*;
public class Ques_1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter weekday");
        int n=sc.nextInt();
        String weekday[]={"Invalid Output","Monday","Tuesday","Wednesday",
            "Thursday","Friday","Saturday","Sunday"};
         if((n>0)&&(n<8))
         System.out.println(weekday[n]);
         else
         System.out.println("Invalid Output");
        
    }
}