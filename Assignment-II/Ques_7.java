/**
 *  Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are
equal, "All numbers are different" if all three numbers are different and "Neither all are equal or different"
otherwise.
Input first number: 2564
Input second number: 3526
Input third number: 2456
Expected Output :
All numbers are different
 */
import java.util.Scanner;
public class Ques_7
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input three numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        if((a==b)||(b==c))
        {
            if((a==b)&&(b==c))
            System.out.println("All are equal");
            else
            System.out.println("Two are equal");
        }
        else
        {
            System.out.println("None are equal");
        }
    }
}
