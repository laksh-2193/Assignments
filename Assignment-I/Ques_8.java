//Write a java program to generate a following @'s triangle
 //Input the number: 5
//Expected Output : 
 //        
 //        @ 
 //       @@@
 //      @@@@@ 
 //     @@@@@@@ 
 //    @@@@@@@@@


import java.util.Scanner;
public class Ques_8
{
    public static void main(String args[])
    {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j = 1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int c = 1;c<=i;c++)
            {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
}