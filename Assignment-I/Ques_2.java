/**
 * WAP to display pattern like right angle triangle with a number input by user:
 * Input no of rows:4
 * 1
 * 12
 * 123
 * 1234
 */
import java.util.Scanner;
public class Ques_2
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input no of rows:");
        int n = in.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

        