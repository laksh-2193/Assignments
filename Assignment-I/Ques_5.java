/**
 * WAP to display pattern like right angle triangle with a number input by user:
 * Input no of rows:5
 * 1
 * 01
 * 101
 * 0101
 * 10101
 */
import java.util.Scanner;
public class Ques_5
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int x = 0,y=0;
        System.out.print("Input no of rows:");
        int n = in.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i-j)%2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
            
        }
    }
}

        