/**
 * Write a Java program to find the number of days in a month
Test Data
Input a month number: 2
Input a year: 2016
Expected Output :
February 2016 has 29 days 
 */
import java.util.Scanner;
public class Ques_3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input month no." );
        int n=sc.nextInt();
        System.out.println("Input year");
        int y=sc.nextInt();
        switch(n) {
            case 1:
            System.out.println("January "+y+" has 31 days");
            break;
            case 2:
            int i = y%100;
            if(i%4==0)
            System.out.println("February"+y+"has 29 days");
            else
            System.out.println("February"+y+"has 28 days");
            break;
            case 3:
            System.out.println("March"+y+" has 31 days" );
            break;
            case 4:
            System.out.println("April "+y+" has 30 days" );
            break;
            case 5:
            System.out.println("May "+y+" has 31 days" );
            break;
            case 6:
            System.out.println("June "+y+" has 30 days" );
            break;
            case 7:
            System.out.println("July "+y+" has 31 days" );
            break;
            case 8:
            System.out.println("August"+y+" has 31 days" );
            break;
            case 9:
            System.out.println("September"+y+" has 30 days" );
            break;
            case 10:
            System.out.println("October"+y+" has 31 days" );
            break;
            case 11:
            System.out.println("November"+y+" has 30 days" );
            break;
            case 12:
            System.out.println("December"+y+" has 31 days" );
            break;
            default:
            System.out.println(" Incorrect input" );
        }
    }
}