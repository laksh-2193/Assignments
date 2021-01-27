
import java.util.Scanner;
public class Reverse
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = in.nextInt();
        int rev = 0;
        int x = 0;
        while(a!=0)
        {
            x = a%10;
            rev = rev*10+x;
            a = a/10;
        }
        System.out.println("Reversed number : "+rev);
    }
}