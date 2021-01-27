/**Write a program in Java to display the cube of the number upto given an integer. Test Data
Input number of terms : 4
Expected Output :
Number is : 1 and cube of 1 is : 1
Number is : 2 and cube of 2 is : 8
Number is : 3 and cube of 3 is : 27
Number is : 4 and cube of 4 is : 64 
 */
import java.util.*;
public class Ques_5 
{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter how many times do u want to test the program");
	int n=sc.nextInt();
	for(int i=0;i<n; i++)
	{
	     System.out.print("Enter an integer number: ");
	     int num=sc.nextInt();
	     System.out.println("Cube of "+ num + " is: "+ Math.pow(num, 3));
	  }
       }
}