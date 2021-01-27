/*
 * WAP to print such pattern
 * Enter the no of rows : 6
 * ******
 *  ****
 *   ***
 *    **
 *     *
 * 

 * 
 */

import java.util.Scanner;
public class Ques_10
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = in.nextInt();
        int x=n;
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                
                System.out.print(" ");
            }
            for(int k = 1;k<=(n-i);k++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}