/*
 *  Write a program in Java to display the pattern like a diamond.
Input number of rows (half of the diamond) : 7
Expected Output :
1
212
32123
4321234
543212345
65432123456
7654321234567
65432123456
543212345
4321234
32123
212
1 
 */
import java.util.Scanner;
public class Ques_9
{
    public static void main(String[] args)
    { 
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter N : ");
            int n=sc.nextInt(); 
            int rows = 2*n-1;
            int d = 0;
            int i=0,k=0,j=0;
            for(i = 1;i<=n;i++)
            {
                
                for(j = i;j>=1;j--)
                {
                    System.out.print(j);
                    
                    
                }
                for(k = 2;k<=i;k++)
                {
                    System.out.print(k);
                }
                System.out.println();
            }
            for(i = 1;i<=n;i++)
            {
                
                for(j = (n-i);j>=1;j--)
                {
                    System.out.print(j);
                    
                    
                }
                for(k=2;k<=(n-i);k++)
                {
                    System.out.print(k);
                }
                System.out.println();
            }
            
    }
     }