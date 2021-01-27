/*
 *  Write a program in Java to display the pattern like a diamond.
Input number of rows (half of the diamond) : 7
Expected Output :
 *
 ***
 *****
 *******
 *********
 ***********
 **************
 ***********
 *********
 *******
 *****
 ***
 * 
 */
import java.util.Scanner;
public class Ques_7
{
    public static void main(String[] args)
    { 
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter N : ");
            int n=sc.nextInt(); 
            
            char c = '*';
            int i=1;
            int j;
            while(i<=n)
            {
                j=1;
                while(j++<=i)
             
                {
                    System.out.print(c);
             
                }
             
                System.out.println();
                i++;
            } 
                i=n-1;
            while(i>0)
            {
                j=1;
                while(j++<=i)
                 
                {
                    System.out.print(c);
                 
                    }
             
                System.out.println();
                i--;
            } 
    }
  }