/**
 * WAP to swap two numbers
 */
import java.util.Scanner;
public class Ques_1
{
    public static int a = 0, b=0;
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a = in.nextInt();
        b = in.nextInt();
        Ques_1 ob = new Ques_1();
        ob.swap(a,b);
        
    }
    public static void swap(int x, int y)
    {
        
        System.out.println("Value of a = "+a);
        System.out.println("Value of b = "+b);
        System.out.println("-------------After swapping------------------");
        System.out.println("Value of a = "+y);
        System.out.println("Value of b = "+x);
    }
}